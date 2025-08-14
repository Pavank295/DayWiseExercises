// List of persons
let persons = [
    { name: "Pavan", age: 25, city: "New York" },
    { name: "Sara", age: 16, city: "London" },
    { name: "Manju", age: 30, city: "Paris" },
    { name: "Anna", age: 17, city: "Tokyo" },
    { name: "Hemanth", age: 20, city: "Sydney" }
];
let eligibleVoters = persons.filter(person => person.age >= 18);
console.log("Eligible voters:");
eligibleVoters.forEach(p => {
    console.log(`${p.name} (${p.age}) from ${p.city}`);
});

