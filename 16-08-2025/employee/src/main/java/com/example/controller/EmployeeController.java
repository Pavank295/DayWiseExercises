package com.example.controller;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Address;
import com.example.model.Employee;
import com.example.model.EmploymentType;
import com.example.repository.DepartmentRepository;
import com.example.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final DepartmentRepository departmentRepository;

    public EmployeeController(EmployeeService employeeService,
                              DepartmentRepository departmentRepository) {
        this.employeeService = employeeService;
        this.departmentRepository = departmentRepository;
    }


    @GetMapping
    public String homeRedirect() {
        return "redirect:/employees/list";
    }

    @GetMapping("/list")
    public String listEmployees(@RequestParam(value = "q", required = false) String name,
                                Model model) {
        List<Employee> employees = (name == null) ?
                employeeService.findAll() : employeeService.searchByName(name);
        model.addAttribute("employees", employees);
        model.addAttribute("q", name == null ? "" : name);
        return "list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        Employee e = new Employee();
        e.setAddress(new Address());
        model.addAttribute("employee", e);
        model.addAttribute("employmentTypes", EmploymentType.values());
        model.addAttribute("departments", departmentRepository.findAll());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("employee") Employee employee,
                       BindingResult bindingResult,
                       @RequestParam(value = "departmentId", required = false) Long departmentId,
                       Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("employmentTypes", EmploymentType.values());
            model.addAttribute("departments", departmentRepository.findAll());
            return "form";
        }
        employeeService.save(employee, departmentId);
        return "redirect:/employees/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Employee e = employeeService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
        if (e.getAddress() == null) e.setAddress(new Address());
        model.addAttribute("employee", e);
        model.addAttribute("employmentTypes", EmploymentType.values());
        model.addAttribute("departments", departmentRepository.findAll());
        return "form";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         @Valid @ModelAttribute("employee") Employee employee,
                         BindingResult bindingResult,
                         @RequestParam(value = "departmentId", required = false) Long departmentId,
                         Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("employmentTypes", EmploymentType.values());
            model.addAttribute("departments", departmentRepository.findAll());
            return "form";
        }
        employeeService.update(id, employee, departmentId);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        employeeService.delete(id);
        return "redirect:/employees/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "id", required = false) Long id,
                         @RequestParam(value = "name", required = false) String name,
                         Model model) {
        if (id != null) {
            Employee e = employeeService.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
            model.addAttribute("employees", List.of(e));
            model.addAttribute("q", "");
        } else {
            model.addAttribute("employees", employeeService.searchByName(name));
            model.addAttribute("q", name == null ? "" : name);
        }
        return "list";
    }

    @GetMapping("/api/{id}")
    @ResponseBody
    public ResponseEntity<Employee> apiGetById(@PathVariable Long id) {
        return employeeService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
    }

    @GetMapping("/api")
    @ResponseBody
    public ResponseEntity<List<Employee>> apiSearch(@RequestParam(required = false) String name) {
        return ResponseEntity.ok(employeeService.searchByName(name));
    }
}
