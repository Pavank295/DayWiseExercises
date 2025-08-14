function pair<T, U>(first: T, second: U): [T, U] {
  return [first, second];
}
const example1 = pair(10, "ten"); 
const example2 = pair<number, boolean>(42, true);
interface Employee {
  empId: number;
  name: string;
}
const employee: Employee = { empId: 101, name: "Asha" };
const example3 = pair<Employee, string>(employee, "active");
console.log(example1); 
console.log(example2); 
console.log(example3); 

