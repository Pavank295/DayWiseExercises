function separateFirstRest(first, ...rest) {
  return {
    first: first,
    rest: rest
  };
}
console.log(separateFirstRest(1, 2, 3));