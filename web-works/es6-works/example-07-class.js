// working with class 

class Person {
    constructor(name, id, city = "bengaluru") {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    printPerson() {
        console.log(`Name is ${this.name}, id is ${this.id}, city is ${this.city}`)
    }
}

class Employee extends Person {
    constructor(name, id, city, salary) {
        super(name, id, city);
        this.salary = salary;
    }
    printPerson() {
        console.log(`Name is ${this.name}, id is ${this.id}, city is ${this.city}`);
        console.log(`Salary is ${this.salary}`);
    }
}

per = new Person("harry", 101, 'New York');
console.log(per);
console.log(typeof per);

emp = new Employee("Peter", 102, "Reston", 3434.45);
emp.printPerson();

