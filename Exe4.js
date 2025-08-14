let input = document.getElementById("input1");
let label = document.getElementById("charRemaining");

input.oninput = () => label.textContent = (50 - input.value.length) + " characters remaining";

document.getElementById("btn1").onclick = () => {
    console.log(input.value);
    alert("You entered: " + input.value);
};
