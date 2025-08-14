let cities = ["Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore", "Hyderabad"];

function populateCities() {
    let dropdown = document.getElementById("cityDropdown");

    dropdown.length = 1;

    let sortedCities = cities.slice().sort();

    sortedCities.forEach(function(city) {
        let option = document.createElement("option");
        option.text = city;
        option.value = city;
        dropdown.add(option);
    });
}
