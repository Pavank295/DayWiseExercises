class Box<T> {
  value: T;
  constructor(value: T) {
    this.value = value;
  }
  getValue(): T {
    return this.value;
  }
}
const numberBox = new Box<number>(100);
console.log(numberBox.getValue()); 
const stringBox = new Box<string>("Hello TypeScript");
console.log(stringBox.getValue()); 
interface Employee {
  empId: number;
  name: string;
}

const employeeBox = new Box<Employee>({ empId: 101, name: "Asha" });
console.log(employeeBox.getValue()); 
