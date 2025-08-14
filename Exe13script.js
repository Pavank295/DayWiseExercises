function validateEmailBlur() {
    let emailValue = document.getElementById("email").value.trim();
    let emailError = document.getElementById("spEmail");
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (emailValue === "" || !emailPattern.test(emailValue)) {
        emailError.style.visibility = "visible";
    } else {
        emailError.style.visibility = "hidden";
    }
}

function validatePasswordBlur() {
    let passValue = document.getElementById("password").value.trim();
    let passError = document.getElementById("spPass");

    if (passValue === "") {
        passError.style.visibility = "visible";
    } else {
        passError.style.visibility = "hidden";
    }
}

function validateForm() {
    validateEmailBlur();
    validatePasswordBlur();
}
