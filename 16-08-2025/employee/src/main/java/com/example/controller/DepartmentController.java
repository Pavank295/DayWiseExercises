package com.example.controller;
import com.example.model.Department;
import com.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public String listDepartments(Model model) {
        model.addAttribute("departments", departmentRepository.findAll());
        return "departments";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("department", new Department());
        return "department-form";
    }

    @PostMapping
    public String saveDepartment(@ModelAttribute Department department) {
        departmentRepository.save(department);
        return "redirect:/departments";
    }

    @GetMapping("/edit/{id}")
    public String editDepartment(@PathVariable int id, Model model) {
        Department department = departmentRepository.findById(id).orElse(null);
        model.addAttribute("department", department);
        return "department-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable int id) {
        departmentRepository.deleteById(id);
        return "redirect:/departments";
    }
}
