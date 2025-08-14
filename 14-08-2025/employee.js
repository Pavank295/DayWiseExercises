function printEmployees(employees) {
    console.log("Employee List:");
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return employees.length;
}
var employeeList = [
    { empId: 1, empName: "John", salary: 50000 },
    { empId: 2, empName: "Alice", salary: 60000 },
    { empId: 3, empName: "Bob", salary: 55000 }
];
var count = printEmployees(employeeList);
console.log("Total Employees:", count);
