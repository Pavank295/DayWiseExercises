let questions = [
    {
        question: "What is the capital of France?",
        options: ["Berlin", "Madrid", "Paris", "Rome"],
        answer: "Paris"
    },
    {
        question: "Which planet is known as the Red Planet?",
        options: ["Earth", "Mars", "Jupiter", "Saturn"],
        answer: "Mars"
    },
    {
        question: "Who wrote 'Hamlet'?",
        options: ["Charles Dickens", "William Shakespeare", "Mark Twain", "Leo Tolstoy"],
        answer: "William Shakespeare"
    }
];

let currentQuestionIndex = 0;
let score = 0;

function loadQuestion() {
    let questionEl = document.getElementById("question");
    let optionsEl = document.getElementById("options");
    let feedbackEl = document.getElementById("feedback");
    let nextBtn = document.getElementById("nextBtn");

    feedbackEl.textContent = "";
    nextBtn.disabled = true;

    let currentQ = questions[currentQuestionIndex];
    questionEl.textContent = currentQ.question;
    optionsEl.innerHTML = "";

    currentQ.options.forEach(option => {
        let btn = document.createElement("button");
        btn.textContent = option;
        btn.className = "option-btn";
        btn.onclick = () => checkAnswer(option);
        optionsEl.appendChild(btn);
    });

    document.getElementById("score").textContent = `Score: ${score}`;
}

function checkAnswer(selectedOption) {
    let currentQ = questions[currentQuestionIndex];
    let feedbackEl = document.getElementById("feedback");

    if (selectedOption === currentQ.answer) {
        feedbackEl.textContent = "Correct!";
        feedbackEl.style.color = "green";
        score++;
    } else {
        feedbackEl.textContent = "Wrong!";
        feedbackEl.style.color = "red";
    }

    // Disable all option buttons after selection
    document.querySelectorAll(".option-btn").forEach(btn => btn.disabled = true);

    document.getElementById("nextBtn").disabled = false;
    document.getElementById("score").textContent = `Score: ${score}`;
}

function nextQuestion() {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        loadQuestion();
    } else {
        document.getElementById("quiz-container").innerHTML =
            `<h3>Quiz Finished!</h3><p>Your final score is: ${score} / ${questions.length}</p>`;
    }
}
loadQuestion();
