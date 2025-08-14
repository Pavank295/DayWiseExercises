interface Employee {
    empId: number;
    empName: string;
    salary: number;
}
function printEmployees(employees: Employee[]): number {
    console.log("Employee List:");
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });

    return employees.length; 
}

let employeeList: Employee[] = [
    { empId: 1, empName: "John", salary: 50000 },
    { empId: 2, empName: "Alice", salary: 60000 },
    { empId: 3, empName: "Bob", salary: 55000 }
];
let count = printEmployees(employeeList);
console.log("Total Employees:", count);
