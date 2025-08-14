let names = ["pavan", "Manju", "Hemanth", "Raj", "Jonathan", "Divya"];
let filteredNames = names
    .filter(name => name.length > 5)
    .map(name => name.toUpperCase());
document.getElementById("result").textContent = filteredNames.join(", ");
console.log(filteredNames);
