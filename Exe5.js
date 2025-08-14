// Global scope
var a = 10;
let b = 20;
const c = 30;

console.log("Global a:", a); 
console.log("Global b:", b); 
console.log("Global c:", c); 

function testScope() {
    var a = 100; 
    let b = 200;
    const c = 300; 

    console.log("Inside function a:", a); 
    console.log("Inside function b:", b);
    console.log("Inside function c:", c); 

    if (true) {
        var a = 1000; 
        let b = 2000; 
        const c = 3000; 

        console.log("Inside if block a:", a); 
        console.log("Inside if block b:", b); 
        console.log("Inside if block c:", c); 
    }

    console.log("After if block a:", a); 
    console.log("After if block b:", b);
    console.log("After if block c:", c); 
}

testScope();

console.log("Global a after function:", a); 
console.log("Global b after function:", b); 
console.log("Global c after function:", c); 


