// List of employees
let employees = [
    { name: "Pavan", role: "Manager", empId: 101, salary: 80000 },
    { name: "Hemanth", role: "Developer", empId: 102, salary: 60000 },
    { name: "Charan", role: "Manager", empId: 103, salary: 90000 },
    { name: "Divya", role: "QA", empId: 104, salary: 50000 },
    { name: "Manju", role: "Manager", empId: 105, salary: 85000 }
];

let managers = employees.filter(emp => emp.role === "Manager");

console.log("Managers:");
managers.forEach(m => {
    console.log(`${m.name} (ID: ${m.empId}) - Salary: ${m.salary}`);
});

let totalManagerSalary = managers.reduce((sum, emp) => sum + emp.salary, 0);

console.log("Total salary of all managers: " + totalManagerSalary);
