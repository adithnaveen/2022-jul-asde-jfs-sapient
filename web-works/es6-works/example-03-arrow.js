const names = [
    'Alok',
    'Rohan',
    'Satya',
    'Yash'
];
// arrow functions are not hoisted 
const getNames = () => {
    for (let temp of names) {
        console.log(temp);
    }
}

console.log(getNames);
getNames();

const add = (num1, num2) => num1 + num2;
console.log(add(10, 20));