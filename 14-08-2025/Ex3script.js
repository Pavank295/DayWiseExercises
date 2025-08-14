class Util {
    getDate() {
        const today = new Date();
        const day = String(today.getDate()).padStart(2, '0');
        const month = String(today.getMonth() + 1).padStart(2, '0');
        const year = today.getFullYear();
        return `${day}-${month}-${year}`;
    }
    getPIValue() {
        return Math.PI;
    }
    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }
    getFibonacci(n) {
        if (n <= 0) return [];
        if (n === 1) return [0];
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i-1] + fib[i-2]);
        }
        return fib;
    }
}
const util = new Util();
console.log("Today's Date:", util.getDate());
console.log("PI Value:", util.getPIValue());
console.log("25°C in Fahrenheit:", util.convertC2F(25));
console.log("First 2 Fibonacci numbers:", util.getFibonacci(2));
console.log("First 7 Fibonacci numbers:", util.getFibonacci(7));
