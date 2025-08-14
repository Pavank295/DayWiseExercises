let persons = [
    { name: "Pavan", age: 25, city: "New York" },
    { name: "Sara", age: 16, city: "London" },
    { name: "Manju", age: 30, city: "Paris" },
    { name: "Anna", age: 17, city: "Tokyo" },
    { name: "Hemanth", age: 20, city: "Sydney" }
];
persons.forEach(person => {
    person.status = person.age >= 18 ? "Adult" : "Minor";
});
console.log("Updated Person List with Status:");
console.log(persons);
