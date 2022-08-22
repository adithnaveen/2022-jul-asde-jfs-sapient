console.log("Start of Script");


function divide(num1, num2, callback) {

    if (typeof callback != 'function') {
        throw ("Sorry this function needs a callback");
    }

    setTimeout(() => {
        if (typeof num1 != 'number') {
            callback("please enter first param as number");
            return;
        }

        if (typeof num2 != 'number') {
            callback("Please enter second param as number");
            return;
        }

        if (num2 === 0) {
            callback("Sorry cannot divide by zero(0)");
            return;
        }

        callback(null, num1 / num2)
    }, 0);

}

let a = 100;
let b = 90;
divide(a, b, (err, result) => {
    if (err) {
        console.log(err);
    } else {
        console.log("Result is " + result);
    }
});
console.log("End of Script");


