const numbers = [10, 20, 30, 40, 50];
const sumArray = (arr) => arr.reduce((sum, num) => sum + num, 0);
console.log(sumArray(numbers));
