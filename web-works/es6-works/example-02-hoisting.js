// hoisting 


hello();
// var company; - will be undefined 

function hello() {
    console.log('====================================');
    console.log("hey i'm in hello");
    console.log('====================================');
}


console.log("Value of Company : " + company);

var company = "Sapient";
console.log("Value of Company : " + company);

// let  company = "Sapient"; - will not be hoisted 