function outer() {
    let city = "Bengaluru";

    function inner() {
        return city.toUpperCase();
    }
    return inner();
}


console.log(outer());

/////////////////////

function fnRefFunction(num1) {
    return function (num2) {
        return num1 + num2;
    }
}

let fnRefFunction10 = fnRefFunction(10);
let fnRefFunction20 = fnRefFunction10(20);

console.log(fnRefFunction10);
console.log(fnRefFunction20);

//////////////////

function sum(val1) {
    return function (val2) {
        return function (val3) {
            return val1 + val2 + val3;
        }
    }
}

// 1, 2, 3 

let firstRef = sum(1);
let secondRef = firstRef(2);
let thirdRef = secondRef(3);
console.log(thirdRef);

sum1 = (val1) => (val2) => (val3) => val1 + val2 + val3;
// curring 
console.log(sum1(1)(2)(3));

////////////////////////////// 
function fnCounter() {
    let count = 0;
    return {
        increment: () => count++,
        decrement: () => count--,
        getCount: () => count
    }
}

let fnc = fnCounter();
console.log(fnc);
fnc.increment();
fnc.increment();
console.log(fnc.getCount());

fnc.decrement();
console.log(fnc.getCount());


