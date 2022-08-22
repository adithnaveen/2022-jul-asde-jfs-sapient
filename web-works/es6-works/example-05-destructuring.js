const person = {
    first: "Kartik",
    last: "Gupta",
    location: {
        city: "Bengaluru",
        state: "Karnataka"
    }
};


const { first: firstName, last: lastName, age = 20, location } = person;


console.log("First Name " + firstName);
console.log("Last Name " + lastName);

// template string 
console.log(`First Name ${firstName}, last Name ${lastName}, ${age > 18 ? "Major" : "Minor"}`);
console.log(`${location.city}, ${location.state}`);
const devices = ['laptop', 'desktop', 'mouse', 'mobile'];

const [device1, device2, device3] = devices;
console.log(`${device1}`);
console.log(`${device2}`);
console.log(`${device3}`);


// destructuring with arrays 
let arr = [12, 34, 55, 33, 100, 78];
let [num1, num2, ...restOfValues] = arr;
console.log(`Num1 is ${num1}`);
console.log(`Num2 is ${num2}`);
console.log(`restOfValues is ${restOfValues}`);

let [n1, n2, , n3] = arr;
console.log(n1, n2, n3);

let [fName, lName] = "Simar Singh".split(" ");
console.log(fName, lName);