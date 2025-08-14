const userIdInput = document.getElementById("userId");
const passwordInput = document.getElementById("password");
const statusText = document.getElementById("status");
if (localStorage.getItem("userId")) {
    statusText.textContent = `Logged in as: ${localStorage.getItem("userId")}`;
} else {
    statusText.textContent = "Not logged in.";
}
document.getElementById("loginBtn").addEventListener("click", () => {
    const userId = userIdInput.value.trim();
    const password = passwordInput.value.trim();

    if (userId && password) {
        localStorage.setItem("userId", userId);
        statusText.textContent = `Logged in as: ${userId}`;
        alert("Login successful!");
    } else {
        alert("Please enter both User ID and Password.");
    }
});
document.getElementById("logoutBtn").addEventListener("click", () => {
    localStorage.removeItem("userId");
    statusText.textContent = "Not logged in.";
    alert("Logged out successfully!");
});
