// calc.js
import { multiply, divide } from './operations.js';
document.getElementById("output").innerHTML = `
    Multiply 5 × 3 = ${multiply(5, 3)}<br>
    Divide 10 ÷ 2 = ${divide(10, 2)}<br>
    Divide 8 ÷ 0 = ${divide(8, 0)}
`;
