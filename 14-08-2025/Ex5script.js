class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    getInfo() {
        return `${this.make} ${this.model} (${this.year})`;
    }
}
class Car extends Vehicle {
    constructor(make, model, year, numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    getInfo() {
        return `${super.getInfo()} - ${this.numDoors} doors`;
    }
}
let v = new Vehicle("Toyota", "Innova", 2020);
console.log(v.getInfo()); 
let c = new Car("Honda", "Civic", 2022, 4);
console.log(c.getInfo()); 
