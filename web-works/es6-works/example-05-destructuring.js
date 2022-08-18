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