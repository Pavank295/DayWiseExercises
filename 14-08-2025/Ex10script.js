function sumNumbers(...numbers) {
  let sum = 0;
  for (let num of numbers) {
    sum += num;
  }
  return sum;
}
console.log(sumNumbers(1, 2, 3));
