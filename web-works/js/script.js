function myFunction() {
    console.log("you called my function")
}

// there are various ways in which variables can be declared 
gx = 100;
function varEx() {
    var gv = 200;
    // has instance scoping 
    let gl = 300;
    const gc = 400;

    for (let i = 0; i < 5; i++) {
        console.log("i value is " + i);
    }

    // console.log("Value of i outside for " + i);

    let strVar = "India";
    let intVar = 100;
    let boolVar = true;

    // ===, <==, >==, !==
    console.log(strVar + intVar);
    console.log(intVar == "100");
    console.log(intVar === "100");

    console.log(boolVar === 1);
}

function fnCheckToVote() {
    let name = prompt("Enter Your Name");
    let age = parseInt(prompt("Enter Your Age", "18"));

    if (age < 18) {
        console.log("Sorry Mr/Ms/Mrs: " + name + " cannot vote");
    } else {
        console.log("Please show your ID Card to Vote");
        if (confirm("Do you have AADHAR Card")) {
            console.log("Good to See AADHAR Card");
        } else {
            console.log("GOVT is making it mandatory");
        }
    }

}


function fnCalculateSum() {
    let number = 0;
    let result = 0;

    do {
        number = parseInt(prompt("Enter a number", "0"))
        result = result + number;
    } while (number != 0);

    console.log("Total Value is " + result);
}

function display() {
    for (let i = 0; i < display.arguments.length; i++) {
        console.log("You Called with " + display.arguments[i]);
    }
}
