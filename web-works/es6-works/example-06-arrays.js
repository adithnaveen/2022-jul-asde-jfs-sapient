let names = ['Satya', 'Yash', 'Alok', 'Siddharth', 'Himanshu'];

for (let i = 0; i < names.length; i++) {
    console.log(names[i].charAt(0));
}


names.forEach((name) => {
    console.log(name.charAt(0));
});

let namesFirstChar = names.map((name) => name.charAt(0));
console.log(namesFirstChar);

names.map((name) => name.charAt(0)).forEach(val => console.log(val));


names.filter(name => name.length > 4).forEach(val => console.log(val));

console.log(`hi how are you 





doing today`);