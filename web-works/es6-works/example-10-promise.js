console.log("Start of Script");


function divide(num1, num2) {

    return new Promise((resolve, reject) => {

        if (typeof num1 != 'number') {
            reject("please enter first param as number");
            return;
        }

        if (typeof num2 != 'number') {
            reject("Please enter second param as number");
            return;
        }

        if (num2 === 0) {
            reject("Sorry cannot divide by zero(0)");
            return;
        }

        resolve(num1 / num2)


    })

}

let a = 100;
let b = 90;

// let result = divide(a, b)
//     .then(data => console.log(data))
//     .catch(err => console.log(err));

// introduced in es7 
setTimeout(async () => {
    try {
        let result = await divide(a, b);
        console.log(`Result is ${result}`);
    } catch (err) {
        console.log(err);
    }
}, 0)


console.log("End of Script");


