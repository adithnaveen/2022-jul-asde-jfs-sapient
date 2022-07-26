# 2022-jul-asde-jfs-sapient


# Introduction 


- Kartikey papnai - BTech, Cs, Bits pilani, online games, 7

- Abhigyan - BE CS, Bits pilani, goa, PJP was good, has done android development, like to read and run, 7 

- Alok - NSIT, CS, worked on C++, Music mostly indi, 7 

- Himanshu - NSIT, BTech, CS, worked on Java, in engg, playing chess, 7.5 

- Karthi Gupta - NSIT, Delhi, BE, CS, PJP Helped in Java, football & chess,  6

- Mayank - BitsPilani, CS, Hyd, learned java in coll, liked data science and android, body building kayaking 7-8 

- Mohammad - NIT, Trichy, BTech, CS, worked in python, playing basketball, 3

- Nielless, Btech, bits pilani, hyd, cs, play badminton, and plays guitar, 7.5 

- Prakhar - Bits pilani, Hyd, plays foot ball, pjp could not be actively involved, 5

- Praneeth Kumar - Ele & Comm, Bits goa, CS was elective, worked on nodejs, pjp helped in understaning syntax, likes cooking, 6

- Rohan - BE CS, Bits goa, have worked in java, pjp helped, dancing, wathing movies, & reading, 6 

- Satya - CC, iit tirupati, had worked in java early, playing games chess, badminton, 7

- Siddharth - BE, Bits Hyd, good with java, reading and travel,  5

- simar - nsit, delhi, btech e&c, worked mostly in C++, in pjp learned in java, play TT & Swimming, 6.5

- Tejas - BE, IT, nsit delhi, worked in java, interest in sports, movies, 7.5

- Yash - CS, IIT, mandi, have completed courses in java, pjp was good, motor biking  7

- Pranshu - CS, IIT, Gandhinagar, worked in java, have done project with java, play guitar, watch movies, 7

> Class rep - Nielless, Rohan 




# Day 1 
- Standard
    - W3C 
        - REST (Representational State) - JSON

- UML 
    - Class Diagram 
        - Attributes 
        - Behviours 
    - Package Diagram 
    - Component Diagram 
    - Deployment Diagram 
    - Sequence Diagram 
    - Activity diagram 
    - Use Case Diagram 
    - E-R Diagram 
```
    class Employee {
        fields 
        Address

        what do they do 
    }

    class Address {
        fields 

        what do they do 

    }
```





```
    - C 
    struct Emp {
        fields 

    } - is always public - no acess specifier concept 
    - top down approact - 
    int main() {

    }

    - C++ 
    class Emp  {
        fields  
        behaviours 
    }

    - java 

    class Employee {
        private int empId; 
        private Name name; 
        private double salary; 

        // some BL 
    }

    class Customer {
        private int custId; 
        private Name name; 
        private double income; 
    }

    class Name {
        private String firstName; 
        private String lastName; 
        private String middleName; 
    }

```

- Highly Cohesive - Loosely Coupled Systems 

- Trainer - profile 
- Trainer has to propose for TOC 
- Trainer Trainee will work for x number of days on TOC 
- Trainer there is a cost involved 


- Trainer comes to system
- clicks on login 
- goes to login screen 
- enters credentials 
- loging success 


```
    - sample sequence diagram 
    @startuml
    Trainer -> TMS : Clicks On Login 
    TMS -> Trainer : Gives the login screen 

    Trainer -> Credentials : Enters Valid Credentials
    Credentials -> UserAuthService: As Json Object 
    UserAuthService -> Trainer : Sends JWT Token 

    Trainer -> Profile: To update the profile 

    @enduml
```

- Maven 
    - Your dependency Management is taken care 
    - they help you to scafold the application 
    - you can publish the depency 



1. Configure maven  to path 
2. mvn archetype:generate  - follow instruction 
3. mvn clean 
4. mvn clean compile 
5. mvn install 
6. mvn clean install -DskipTests
7. get the dependencies from maven repo and put it in pom.xml 
8. mvn dependency:tree

