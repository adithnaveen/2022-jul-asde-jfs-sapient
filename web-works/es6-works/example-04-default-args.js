// version 1 
/* 
function calculateSalary(salary, tax, incentives) {
    if (tax === undefined) {
        tax = 0;
    }
    if (incentives === undefined) {
        incentives = 0;
    }

    return salary + tax + incentives;
}
*/

// version 2 - little better
/* 
function calculateSalary(salary, tax, incentives) {
    tax = tax || 0;
    incentives = incentives || 0;
    return salary + tax + incentives;
}*/


function calculateSalary(salary, tax = 0, incentives = 0) {
    tax = tax || 0;
    incentives = incentives || 0;
    return salary + tax + incentives;
}
console.log(calculateSalary(100));
console.log(calculateSalary(100, 10));