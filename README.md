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



# TOC 


Week 1 		

Day1	Maven,  OOAD	"Introduction to OOAD & UML 
Understanding the need of documents, Introduction to Data modelling "	"
Building Simple Java Project with Maven(Dependencies, Build, Plugins) 
Overview of Gradle"	Subjective + MCQ

Day 2 	Git Jenkins 	"Recap of Git working with BitBucket, 
Introduction to DevOps, Devops-Sec ,
Working with Jenkins - building application with Jenkins, 
Understanding plugins, creating pipeline with groovy script"		

Day3	MongoDB	MongoDB - NoSQL DB, CRUD, Understnaing & Creating  Indexes, CAP theorem		

Day4	Java	"Understnding Highly Cohesive - 
Loosely Coupled Systems, Collections & Generics-List, Set, Map"		

Day5	RDBMS, JDBC	RDBMS Concepts, JDBC - CRUD Operations, with postgres DB/Mysql		
Week 2				

Day6	Java 8	"Java 8 Concepts, functional programming 	"		Subjective + MCQ

Day7	Java 8 + 11	Java 8 Concepts, functional programming, Introduction to Java 11 programming features, introduction to graalvm 		

Day8	TDD, Mockito, Code Quality	Understanding TDD approach Working with JUnit 5, Mockito, Sonarqube, Introduction to Groovy Spock Testing, and usages 		

Day9	Solid Principles	Design Patterns & Principles, SOLID Principles, DRY,YAGNI, Introduction to logging		

Day10	Spring	"Spring IOC, Bean Life Cycle, Bean post processor,Annotation Based, Spring AOP. 	"		
Week 3				

Day11	Servlets, JSP	Introduction Servlets & JSP 		Subjective + MCQ

Day12	Spring MVC	Spring MVC		

Day13	SpringBoot	Creating a Spring Application using Spring Boot, Performing CRUD Operations with MongoDB  		

Day14	Spring Boot Netflix OSS Tools	Spring Boot + Netflix OSS Tools - Eureka, Swagger, API Gateway, LB, Feign, Hystrix(Resilence4J), Introduction to Circuit Breaker + Ribbon 		

Day15	HTML, JS 	Introduction to HTML, CSS,Javascript, Introduction to Mediaqueries, Object based features, Validating with Javascript, Understanding DOM, Manipulating HTML with DOM. Understanding object hierarchy 		

Week 4				

Day16	JavaScript	Introduction to AJAX, Fetch, Functinal programming, closures, currying, call, async, await.  Introductio to ES6, npm dependencies  Understanding promises & callback		Subjective + MCQ

Day17	React	Introduction to Reactjs, jsx, Stateless and stateful component, nesting component , Forms & Inputs		

Day18	React	Events & methods, Lifecycle, HOC, CSS Styling, Form Validation 		

Day19	React	JSX Introduction, Benefits of JSX, React Components, Hooks, Error Boundaries, React.lazy and Suspense for CSR, CSR/SSR		

Day20	React Redux	React Redux - State management, React Routers, Intrododuction to JEST and Testing React Application		

Week 5				

Day21	Cucumber	Need of BDD, Introduction to Cucumber, Gherkins	Project Work 	Project Work

Day22	Selenium	Understanding e2e Testing, working with Selenium 	Project Work 	

Day23	Kafka	Introduction to Kafka 	Project Work 	

Day24	Docker	Working with Docker, introduction to container orchestration and deploying a spring boot application with k8s + security	Project Work 	

Day25	AWS	AWS - Creating EC2 instances, Creating VPC, understanding NAT, Security policies	Project Work 	


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



toc - trainer/sme write/read, company read 
- standard toc 
    - section 1 
        - topic 1 
        - topic 2 
        - topic 3 
    - section 2
        - topic 1 
        - topic 2 
        - topic 3         


- sapient
- standard toc 
    - section 1 
        - topic 1 
        - topic 2 
    - section 2
        - topic 1 
        - topic 2 
        - topic 3                 



- Philips
- standard toc 
    - section 1 
        - topic 1 
        - topic 2 
        - topic 4 
        - topic 5 
    - section 2
        - topic 1 
        - topic 2 
        - topic 3 



1. understand the requirement 
2. Create class diagram / seqence diagram 
3. implementation 
    1. core logic with only java + db like mongodb 
    2. core logic with java + db mongodb + view to be react js 


Team1 - Alok, Kartik, Kartikey, tejasw,  
Team2 - Himanshu, Mayank, simar, yash
Team3 - Mohammad, rohan, siddharth
Team4 - Prakhar, Pranshu, Praneet
Team5 - Abhigyan, Nieless, Satya 


folder structure 
1. learning 
2. assessment 
3. prodct-phase


# Day 2 

- Git - is the way how code is processes 
- Github/Bitbucket - is the place where it is kept 

```
- pranshu 
    package com.pranshu; 

    public class Hello {

        public void hi() {
            // some budiness logic 
        }

    }

- karthik 

 package com.karthik; 

    public class Hello {
 
        public void hello() {
            // some budiness logic  
        }
    }

```

- SCM 
    - VSS
    - CVS 
    - SVN 
    - GitHub / Git 
- LowCode - NoCode Approach 

> git init my-repo

> create a file 

> git add filename

> git commit -m "first commit" 

> git config 
    - terminal 
    - user / global 
    - system 

> git config --global user.email navsrini4@partners.publicisgroupe.net

> git config --global --edit

```
    1002  cd Desktop
 1003  pwd
 1004  mkdir git-works-asde
 1005  cd git-works-asde
 1006  pwd
 1007  git -version
 1008  clear
 1009  git --version
 1010  git init my-repo
 1011  ls
 1012  cd my-repo
 1013  ls -la
 1014  ls -a
 1015  clear
 1016  code . 
 1017  git status
 1018  git add sample.html
 1019  git status
 1020  git comit -m "first commit"
 1021  git commit -m "first commit"
 1022  git status
 1023  git status
 1024  git add sample.html
 1025  git commit -m "added h1 and para tag in body"
 1026  git status
 1027  git log
 1028  clear
 1029  git config --edit
 1030  git config --global --edit
 1031  git config --global --edit
 1032  clear
 1033  git config --global --edit
 1034  clear
 1035  git add .
 1036  git commit -m "added title"
 1037  git st
 1038  git log 
 1039  git log --oneline
 1040  clear
 1041  git branch 
 1042  git branch table-branch
 1043  git branch
 1044  git checkout table-branch
 1045  git branch 
 1046  git st
 1047  git add .
 1048  git commit -m "create table " 
 1049  git status
 1050  clear
 1051  git add . 
 1052  git commit -m "put some content in table"
 1053  git status
 1054  git log --oneline
 1055  git log --oneline --decorate --graph
 1056  git checkout main 
 1057  git add . 
 1058  git commit -m "added h3 in main"
 1059  git checkout main 
 1060  git log --oneline --decorate --graph
 1061  git branch
 1062  git checkout table-branch 
 1063  git log --oneline --decorate --graph
 1064  clear
 1065  git branch
 1066  git checkout main 
 1067  git merge table-branch
 1068  git status
 1069  git add . 
 1070  git commit -m "merged and resolved conflicts"
 1071  git status
 1072  clear
 1073  git branch 
 1074  git branch alok-feature
 1075  git branch 
 1076  git checkout alok-branch
 1077  git checkout alok-feature
 1078  git status
 1079  git add . 
 1080  git commit -m "added h3 in alok works"
 1081  git add . 
 1082  git commit -m "updated title of the page"
 1083  git status
 1084  git log --oneline --decorate --graph 
 1085  git checkout main 
 1086  git branch 
 1087  git status
 1088  git add .
 1089  git add .
 1090  git commit -m "added h4"
 1091  git status
 1092  git log --oneline --decorate --graph 
 1093  clear
 1094  git checkout main 
 1095  git branch 
 1096  git merge alok-feature
 
```

- mono repo 
    

> java -jar jenkins-27-jul-2022.war --httpPort=9090



```
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
---- 
pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
              echo "Build Stage"
            }
        }
        stage('Test') { 
            steps {
             echo "Test Stage"
            }
        }
        stage('Deploy') { 
            steps {
               echo "Deploy Stage"
            }
        }
    }
}
--- 


pipeline {
    agent any

    tools {
       
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}

```

- need 1 simple project in bitbucket in the folder and build it with jenkins 
- bitbucket plugin 



# Day 3 

- CAP theorem
    - Horizontal Scalaing 

- Introduction to Data modelling 
- MongoDB - NoSQL DB, CRUD, Understnaing & Creating  Indexes, 

- ACID 
   - Vertical Scaling 


```
   [ {
        empId: 101, 
        empName:"Siddharth", 
        empSal:1234, 
        addresss:{
             hno:1222, 
            street:"Dream Way Blvd", 
            city:"bengaluru", 
            State:"KA" 
        }
        email:"siddharth@ps.com", 
        access: {
            sharepoint:"siddhart"
        }
    }, 
    {
        empId: 102, 
        empName:"Mayank", 
        empSal:1244, 
        addresss:{
             hno:4422, 
            street:"Reston Blvd", 
            city:"Reston", 
            State:"VA" 
        }
        email:"mayank@ps.com", 
        access: {
            teams:"mayank@ps.com", 
            bitbucket:"mayaneg", 
            jira:"mayaneg", 
            sharepoint:"mayaneg"
        }
    }, 
    
    ]
```

- in memory db 
    - redis 
    - cauch db 
    - memcahce db 



> db.emps.insert({empid:101, empname:"harry", empsal:1234});

> db.emps.insert({empid:102, empname:"Siddharth", empsal:2233});

> db.emps.insert({empid:103, empname:"Satya", empsal:3322});

> db.emps.insert({empid:104, empname:"Himanshu", empsal:4321});

> db.emps.insert({empid:105, empname:"Praneeth", empsal:4455, city:"bengaluru"});

> db.emps.find({selection + and + or + or some functions available in  mongodb}, {projection})

- find emp who is in bengaluru, and project only name and empid 

> db.emps.find({city:"bengaluru"}, {empid:1, empname:1, _id:0})

>  db.emps.find({city:{$exists:true}})

>  db.emps.find({city:{$exists:false}})

> db.emps.find({empname: {$in:["harry", "Satya"]}})

> db.emps.find({empsal:{$gt:2000}})

-- and 
> db.emps.find({
        empsal:{$gt:2000}, 
        city:"bengaluru"
        })

-- or 

> db.emps.find({
    $or:[
        { empsal:{$gt:3000}},
        {empname:"harry"}
    ]
})

-- and / or 
> db.emps.find({
    city:"bengaluru", 
    $or:[
        { empsal:{$gt:3000}},
        {empname:"harry"}
    ]
})



- emp - 50000
- dept - 40 
- project  - 56 
- insurance - 44000
- bank details - 50000
- salary-for-consulting  - 23000
... 

- embedded document 

> db.embed.insert({
    empid:1234, 
    name: {
        first:"Abhigyan", 
        last:"Utsav"
    }, 
    address: {
        no:4433, 
        street:"American Dream Way", 
        city:"Cupertino", 
        state:"CA"
    }
})

> db.embed.insert({
    empid:1122, 
    name: {
        first:"Tejasw", 
        last:"Jain"
    }, 
    address: {
        no:56, 
        street:"Stevenks Creek Blvd", 
        city:"AshBurn", 
        state:"VA"
    }
})

 > db.embed.find({"name.last":"Jain"});

 -- update 

> db.emps.update({}, {$set:{city:"Delhi"}}) - single record 

> db.emps.update({}, {$set:{city:"Delhi"}}, {multi:true}) - multiple records 

> db.emps.update({empname:"Satya"}, {$set:{city:"Hyderabad", email:"satya@ps.com", empsal:5544}}, {multi:true}) - multiple records 

- upsert 

> db.emps.update({empname:"simar"}, {$set:{city:"Mysuru", empsal:4433}}, {upsert:true})

 > db.emps.update({city:{$set:"Delhi"}}, {city:{$exists:false}})

 - delete - remove 
 > db.embed.remove({})

 > db.emps.remove({empname : "simar"})


 > db.person.createIndex({gender:1})

 > db.person.createIndex({gender:1, email:1})


 > db.person.createIndex({gender:1, email:-1})



 - problem statement 

 1. Create sequence diagram 
 2. Create class diagram 
 3. Create logical data model (json)
    - TOC 
    - Trainer 
    - Company 
    - Company Staff 
    - .... 
4. import .json file to the db 
5. perform simple CRUD operations to validate the code 

 {
    tid:101, 
    name:"naveen kumar" 
 }

 {
    tid:101, 
    name: {
        "first":"Naveen", 
        "last":"Kumar
    }
 }


 ```
    public class HelloWorld {
        public static void main(String args[]) {
            System.out.println("hi"); 
        }
    }
 ```

team-1
team-2
team-3
team-4
team-5


```
    // bean classes 
    class User {
        private int userId; 
        private String userName; 
        private String email; 
        ....
        
        public void setUserId(int userId) {
                // if you want you can write some conditions 
            this.userId = userId} 
        public int getUserId() {return this.userId;}
    }

    class UserService {
 
        public boolean registerUser(User user) {
            // validate user object 
            // call dao 
        }

        public List<User> getAllUsers() {
            call dao layer 
            return the user before returning validate the users 
            got from the db are correct     
        }

        public User getUser(int userId) {
            validate if its a +ve number 
            the call dao layer 
            return user to controller 
        }

    }




    class UserDAO {
        public boolean registerUser(User user) {
          insert to DB 
        }

        public List<User> getAllUsers() {
           get records 
        }

        public User getUser(int userId) {
          get single record 
        }

    }
 

```



# Day 4 

Team1 - Alok, Kartik, Kartikey, tejasw - Himanshu 
    - completed sequence diagram, working on class diagram, mostly today 
    - 
Team2 - Himanshu, Mayank, simar, yash - Asif 
    - completed sequence diagram, working on class diagram half way, research on data model. 

Team3 - Asif, rohan, siddharth - Pranshu 
    - seq, class is done,  working on data model

Team4 - Prakhar, Pranshu, Praneet - Abhigyan
     - seq, class is in progress,  working on data model

Team5 - Abhigyan, Nieless, Satya - Alok 
    -  completed sequence diagram, working on class diagram, not started with data model 

 - problem statement 

 1. Create sequence diagram 
 2. Create class diagram 
 3. Create logical data model (json)
    - TOC 
    - Trainer 
    - Company 
    - Company Staff 
    - .... 
4. import .json file to the db 
5. perform simple CRUD operations to validate the code 

- user stories 
- Given - pre condition, When - actual, Then- post , But - check, And - multiple 
```

    Epic: Creating a CLI application for TMS progressively, to persist the data in secondary storage / dbms 

    User Story: to register a trainer 
    
    Steps: 
    Given application is available  
    When user gets an option of the menu 
    And choosed option 1 from the given option to register 
    Then user is asked for details like email, name, gender etc 
    When user completes the enteries 
    Then as an ack the trainer records is shown with trainer id which can be kept for reference 


- to create toc 
    Given the application is loaded 
    And the user enters userid 
    And the valid password 
    Then take the user to menu options 
    When user selects "1" to Add TOC 
    Then ask user to enter duration 
    And outcome 
    And pre-requistie 
    And section, topics 
    When user enters "0" 
    Then stop the loop 
    And show an ack to user "TOC Created Successfully" 
```


Java (Features)
    - Platform Independent 
    - Architecture Neutral 
    - Common Code OS 
    - WORM - Write Once Read Many 
    - JVM 
    - .. 

- James Gostling 
- Oak - 1991 
- Java - 1993 - Green Project 
- OOPS 

- public 
- private 
- protecte 
- defulat (package)

```
    void main() {
        int x; 
        printf("%d", x); 
    }

    scanf("%d", &n); 
    cin >> n ; 
```



```
    public class HelloWorld {
        public static void main(String [] args) {
            System.out.println("hi"); 
        }
    }

    > javac HelloWorld.java  (Compiler - JIT)
        -> HelloWold.class 
    > java HelloWorld first-param second-param



-- initialization 
    public clas Hello extends Thread  {
        int x; 
        static int sx; 

        public void hi() {
            int hix; 
        }
    static {
        // put your code 
    }
    {
        // put your code
    }
        public static  void his() {
            static int hix; 
        }

        public void run() {
            // busines logic goes here 
            // this may call another method based on condition 
        }
    }

class Client {
    psvm() {
        Thread t1 = new Thread(new Hello()); 
        t1.start(); 
        Thread t2 = new Thread(new Hello()); 
        t2.start(); 
        
        Thread t3 = new Thread(new Hello()); 
        t3.start(); 
    }
}

```



1. class extending thread class 
2. class implementing runnable interface 
3. executors 







learning
assessment - mono repo 



# Day5 - 
    - RDBMS, JDBC
    - RDBMS Concepts, JDBC - CRUD Operations, with postgres DB/Mysql	


-  application server 
    - glass fish - sun microsystems - Oracle corp 
    - web logic - Oracl corp 
    - web sphere - IBM 
    - jboss - Red Hat 


- data processing from jdbc to dbms 
    - Statement - is used only to send sql 
    - PreparedStatement - statement works + batch statements + they are precompiled 
    - CallablcStatement - preparedstatement does + can invoke functions and procedures in dbms 


- mysql commands 

> create database sapient_aug_2022; 

> use sapient_aug_2022; 

> create table trainer(
    tid int primary key, 
    tname varchar(20) not null, 
    temail varchar(35), 
    tincome decimal(7,2)
);


```
    interface Vehicle {
        .. few mehtods 
    }
    class Car impllements Vehicle {
        private int cI; 
        private String name; 
    }
    class Bike implements Vehicle{
        private int bikeId; 
        private String name; 
    }

    Vehicle v = new Car(); 
    v= new Bike(); 
```


- learning - mono repo 
- assessment - mono repo 
- teams - 2-4 - 
    pax 1 write the the code we need PR 



# Day 6 


- Jira Stories - swati 
    - we need to create sub task 
- assessment 
- branching strategy 


- Java 8 

- Java 
```
    main() {
        hi();
    }
    hi() {
        hello();
    }
    hello() {
        cya()
    }
    cya(){.. some bl }
```

- method they did not have fuction 

```
- closures 
    let cya = function(() => {
        ... some business logic 
    }){}
    let hi = function(cya){}
    function hello(hi); 

    int *myfunction() {}

```
- Groovy 
- Ruby 
- Kotlin 
- R .... 























- functional interface  - this is an interface which exactly has 1 method 

```
    interface myinterface {
        hi();
    }
```


- given numbers 
    - 87,65,89,-78,77,-101,-922,12


```
    interface one {
        myfunction1(); 
        default void myfunctiondefault() {}
    }
    interface two {
         default void myfunctiondefault() {}
    }

    class Hello implements one, two {
        hi() {
            one.myfunctiondefault() ; 
            two.myfunctiondefault() ; 
        }
    }
```


# Day 7 
- Streams - data is flown 



```
    select * from table-name where salary > 3000; 


    select dept-name, count(*) 
        from dept d, emp e 
        where salary > 3000 
        group by dept-name
        order by dept-name;
```


| empid | empname | emp-dept | 
| 101 | Siddhart | cs| 
| 102 | Mayank | Mech | 
| 103 | Nieless | cs| 
| 104 | Alok | Mech | 
| 105 | Pranshu | Mech | 


cs - 2 
Mech - 3

mobile, mouse, keyboard, monitor, mobile, keyboard 

2 - MOBILE 
2 - KEYBOARD
1 - MONITOR
1 - MOUSE 



```
@FunctionalInterface
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

TriFunction<Person, Salary, Project, Emp>

```



# Day 8 
    - MDD - Model Driven Development - entire product mostly should be shown 
    - DDD - Domain Driven Development 
    - BDD - Behaviour Driven Development 
    - TDD - Test Driven Development 
        - Gatling 
        - unit testing 
            - jUnit - 4, 5 (Jupiter)
            - testNG 


 

Team1 - Alok, Kartik, Kartikey, tejasw - Himanshu 
    - completed sequence diagram, working on class diagram, mostly today 
    - dao is done, the code not looking great 

    	private ArrayList<String> toc_requisites;
```        public void getToc_requisites() {

        }

        ```
    - identify the missing user stories, need to be added in next sprint 
    - test cases missing, code quality needs to be checked. 
    - code should be improvised 
Team2 - Himanshu, Mayank, simar, yash - Asif 
    - completed sequence diagram, working on class diagram half way, research on data model. 
    - PR not done 
    - the program was broken in between, once after login there should have been an option for logout 
    - for himanshu git it not working 
    - lacking with data schema  
Team3 - Asif, rohan, siddharth - Pranshu 
    - seq, class is done,  working on data model

Team4 - Prakhar, Pranshu, Praneet - Abhigyan
     - seq, class is in progress,  working on data model

Team5 - Abhigyan, Nieless, Satya - Alok 
    -  completed sequence diagram, working on class diagram, not started with data model 






1. Login - Trainer 
2. Logout - Trainer 
3. Login - Company 
4. Logout - Company 
5. Exit 


1. Login - Trainer 
    1. Enter username 
        Your name 
    2. Password 
        Options show 
        1. Create TOC 
        2. View Your TOC's 
        3. Update Profile 
        4. Logout 

    2. Register 


1. Creating the Unit Test Cases + Mocking 
user Story : creating test cases 
    as a developer i want to create test cases 
    i want the source code is covered with test cases 
    so that we can find the bugs at early stage 

2. Deploy the application with Jenkins 
3. If you have missed any user strories from sprint1, include it in sprint 2 




# Day9 

- SonarQube - 9000 
```
mvn sonar:sonar \
  -Dsonar.projectKey=sapient-jul-2022-java-works \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=4b2c646f3474d19c95e6a14cd358f8eb855e13f0
  

  mvn sonar:sonar -Dsonar.tests=src/test/java
```

> mvn clean compile org.jacoco:jacoco-maven-plugin:prepare-agent install site 
> mvn sonar:sonar 



  - sonar properties - https://docs.sonarqube.org/latest/analysis/analysis-parameters/
- the code coverag is 0% 



- Design Pattern - postulate 

```
    class Company {
        private Company() {}

        public static Company getCompany(Company comp) {
            if(comp != null) {
                return comp; 
            }
            return new company; 
        }
    }
    class Employee {
        private Company comp; 
        private int empId; 
        public Employee(Company comp, int empId) {
            this.empId = empId; 
            this.comp = comp; 
        }

    }   

    class Client {

        main() {
            Company comp = Company.GetCompany(null); 
            Employee emp = new Employee(comp, 101); 
            Employee emp = new Employee(comp, 101); 
            Employee emp = new Employee(comp, 101); 
            Employee emp = new Employee(comp, 101); 
        }
    }


    -- factory 

    class Audi extends Car {}
    class Maruti extends Car {}
    class Volvo extends Car {}
    // 1000 




    class Car {
        public static Car getCar(String name) {
            if(name.equlas("audi")) {
                return new Audi(); 
            }else if(name.equlas("maruti")) {
                return new Maruti(); 
            }else if(name.equals("volvo")) {
                return new Volvo();
            }

            return null; 
        }
    }

    -- client 

    main() {
        Car car = Car.getCar("maruti"); 
         car = Car.getCar("audi"); 
    }


-- prototype 

Emp e = new Emp(); 
e.set
e.set
e.set... 

Emp e1 = e.clone();

- builder 
    select name, salary, gender, depname from 
        employee e, dept d 
        where e.deptid = d.deptid
        .... 


interface One {
    hi();
    bye();
    cya();
    again();
}


abstract class OneAdapter {
   hi() {}
    bye(){}
    cya(){}
    again(){}
}
class Impl extneds OneAdapter{
     bye(){}
}

```


- SOLID -theory 



# Day 10 
- to deploy an application with jenkins 

- Design pattern 
    - singleton
        - Eager 
        - Lazy 



```
Example:

 @Slf4j
 public class LogExample {
 }
 
will generate:
 public class LogExample {
     private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
 }
 
```

- 90's 
    - servlets and JSP 
    - Struts 1.0 and 2.0 (to use MVC) 
    - Rod Johnson - Spring + IOC / DI 
        - by default all spring beans are single ton 

```
application.xml 
    <beans>
        <bean id="dummydao" class="com.sapient.dao.DummyDAO"></bean>
        <bean id="jdbcdao" class="com.sapient.dao.JDBCDAO"></bean>
    </beans>



    main() {

        ApplicationContext context = new ClassPathAXmlApplicationContext("application.xml"); 
        IEmployeeDAO = context.get("dummydao"); 

    }


```


    - AutoWiring 
    - Bean Post Processor 
    - AOP 
    - Reading the Data from properties 
    - 



0.0.0.0 - 255.255.255.255 


```
public class Screen {
	@Value(value = "6")
	private int len; 	
}

public class Screen {

	private int len; 	

    public void setLen(int len) {
        this.len = len; 
    }
}

some body calling 
Screen screen = new Screen(); 
 


```


```
Creating mobile class 
    public class Mobile {
        private Camera camera; 
        private Screen screen; 
        private Speaker speaker; 

        // getter and setters 	
}


main() {
    Mobile m = new Mobile(); 
    Camera camera = new Camera(); 
    camera.setType("Vga"); 

    m.setCamera(camera); 
}

``` 


[ INFO] 2022-08-08 14:56:26,936 main            com.sapient.client.AnnotationEx02 [  19] 
Mobile is : Mobile(camera=Camera(type=vga), screen=Screen(len=6, bre=4, screenType=gorilla), speaker=Speaker(type=mono, volLevels=2))



# Day 11 

- SOLID 
- @Primary 
```

    class Person {
        private int pid; 
        private String pname; 
    }
    class Employee extends Person {
        private Address address; 
        private Office office; 
    }
    class Address {
        private int hNo; 
        private String street; 
        private String city; 
        ... 
    }
    class Office {

    }

    @Configuration 
    class AppConfig {
        
        @Bean ("my-employee)
        public Employee getEmployee() {
            return new Employee();
        }
        @Primary 
        @Bean 
        public Address getAddress() {
            return new Address();
        }

        @Primary 
        @Bean 
        public Office getOffice() {
            return new Office();
        }


        @Primary 
        @Bean 
        public Person getPerson() {
            return new Person();
        }
    }


```


-- Bean post processor 
```
    Mobile 
        - camera 
        - speaker 
        - screen 

```

-- aop

    ```
        com.sapieng.beans.Mobile.getSpeaker(*)
        com.sapieng.beans.Mobile.getSpeaker(..)
    ```

- Web Server 
    - Java 
        - Tomcat 
        - Jetty 
        - Web logic 
        - Web sphere 
        - jboss
        - glassfish 
        - Netty (reactive)
    - Php
        - Apache 
    - python 
        - Django 
    - .net 
        - iis 

```
    The DD 
    web.xml 

    <servlet> 
        <servlet-name>hello</servlet-name>
        <servlet-class>com.sapient.HelloWorld</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>


    // HttpServlet class shall have the capability to take http request and give http response 
    class HelloWorld extends HttpServlet {

    }

```        


```
    int *ptr; 
    ptr = (int) malloc(100); 


    free(ptr); 
```


# Day 12 

```
  <servlet>
  	<servlet-name>mycompany</servlet-name>
  	<servlet-class>org.spring.......DispatcherServlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>mycompany</servlet-name>
  	<url-pattern>/*</url-pattern>
  </servlet-mapping>
  
  ```

return example 

/WEB-INF/views/example.jsp

  <property name="prefix" value="/WEB-INF/views/" />
		<property name="suffix" value=".jsp" />


- spring mvc works

- maven dependencies 

- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1

- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl/1.2

- https://mvnrepository.com/artifact/org.springframework/spring-context






flow of spring mvc  application 

1. http://localhost:9090/spring-mvc-works 
2. it invokes the welcome file index.jsp 
    2.1 The configuration is loaded with @Configuration 
    2.2 it becomes web appliaction with @EnableWebApplication 
    2.3 the context is give for servlet with name called ds for DispatcherServlet  -> / 
3. when clicked on Click Me on the page
    3.1 looks for hello in controller as you have mentioned in 2.2 
    3.2 the resource is found then it returns hello 
    3.3 which shall be given to InternalResourceViewResolver /WEB-INF/pages/hello.jsp 
    3.4 Then the file is invoked 




# Day 13 
    - Spring 5.x.x 
    - Spring 3.x started using Annotation + XML 
    - Spring 4.x - mostly on annotation 
    - Represenationl State (REST)
    - REST
        - Jersey 
        - RestLet
        - RestEazy 
        - SpringBoot 

- rest works 
- https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=11&groupId=com.rest-works&artifactId=rest-works&name=rest-works&description=building%20rest%20api%20performing%20crud%20operations&packageName=com.rest-works.rest.works&dependencies=lombok,web,devtools,data-mongodb

- user details 
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=11&groupId=com.user.details&artifactId=user-details&name=user-details&description=building%20rest%20api%20performing%20crud%20operations&packageName=com.user.details.user.details&dependencies=lombok,web


- eureka service 
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=11&groupId=com.sapient&artifactId=discovery-service&name=discovery-service&description=eureka%20server&packageName=com.sapient.discovery.service&dependencies=web,cloud-eureka-server

- api  gateway
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=11&groupId=com.sapient&artifactId=api-gateway&name=api-gateway&description=eureka%20server&packageName=com.sapient.api.gateway&dependencies=web,cloud-eureka,cloud-gateway




MongoRepository already has it 
findById(ID id);

name 
findByName(String name)


findByEmail(String name)


- Richarson Maturity Model 
    - RRM LEVEL 0 
        - swamp of POX 
    - RRM LEVEL 1 
        -  individual URIs (still all typically POST)
        - userInsert 
        - userDelete 
        - userUpdate
        - userDelete 
    - RRM LEVEL 2 
        - GET /user
        - GET /user/{userID}
        - POST /user
        - PUT /user
        - DELETE /user
    - RRM LEVEL 3 
        - HATEOAS (Hypermedia As The Engine of Application State)


rest-works - 9090 
    - http://localhost:9090/user GET, PUT, POST, DELETE 
    - http://localhost:9090/user/user-details/yash
user-details - 9100
    - http://localhost:9100/user-details/yash
eureka - 8761
api-gateway - 8765 




# Day 15 
Get All Users - http://localhost:9090/api/user

With Api GateWay - Get All Users - http://localhost:8765/REST-WORKS/api/user


For Front End 
    - Notepad ++ 
    - VS Code (we will use this)
    - Atom 
    - Sublime 
    - Brackets 


http://localhost:5500/html-works/Example02.html?username=

- Mobile First 
- Desktop First 

Media Queries 
    - can render dynamic css based on the width of the screeen + type 


http://example.com



```
    styles - common styles 
    h1 font - blue 

    if screen-min-width- 500px
        then load this css 


    if screen-min-width-500px and max is 700 px 
        then load this css 


```

RWD  - Responsive Web Development 
AWD  - Adaptive Web Development 


```
User Stories 
Epic: Creating endpoints which adheres to rest full 

technical -
Story 1.1 : Setting up Eureka, API Gateway, Sleuth, HAL, Actuator, Resilinece4j 
Given the end point http://localhost:8765/Service-Name/URI 
When user invokes http://localhost:8765/Service-Name/URI  - GET Request 
Then on the developer logs the id should be shown for the request make (Sleuth)
When http://localhost:Service-portNumber/
Then HAL browser to be loaded 

Story 1.2 : Setting up Eureka, API Gateway, Sleuth, HAL, Actuator, Resilinece4j 
Given the end point http://localhost:8765/Service-Name/URI 
When the invoked service is down 
Then the fallback message is shown 


Story 1.3 : Setting up Eureka, API Gateway, Sleuth, HAL, Actuator, Resilinece4j 
Given the end point http://localhost:8765/Service-Name/URI 
When the invoked service is down 
Then the fallback message is shown 
And Number of requests retries should be 3 be default 

Business 
Story : getting all the trainer from the service 
Given the end point  http://localhost:8765/trainer-service/api/trainer 
When made a GET request
Then return the list of trainers in json format 

Story : saving a trainer 
Given the end point  http://localhost:8765/trainer-service/api/trainer 
When made a POST request
Then return the saved trainer object 

payload: 
{
    name: String, 
    email:String, 
    dob:String, 
    age:int, 
    income:double
}

```


# Day 16 

var x = 100; 
x= "hi"; 


- prompt return String
- alert return void 
- confirm return boolean 

Function / Method Overloading 
- in java script trivial 


- DOM, SAX, StAX

```
    <html>
        <head>
        </head>
        <body>
            <p> hi</p>
            <p> hiikkk </p>
        <body>
    </html>
```

 <p> - p - hi 


 # Day 17 
 - ES6 
    - closures 
    - currying 
    - callback
    - functional programming 
        ```
            const array1 = [1, 4, 9, 16];

            // pass a function to map
            const map1 = array1.map(x => x * 2);


            const map1 = array1.map(function(x) {
                return x *2; 
            });

            console.log(map1);
            // expected output: Array [2, 8, 18, 32]

        ```
    - promise 
    - you can write class 
    - java script for validation 

- Introduction to React JS 
- 

- React Js - Facebook (library)
- Angular - Google (Framework)
- Back bone  (library)
- vuejs (framework)
- nest js (framework)
- can js (library)
- dustjs.... (library)
- jquery (library)


- framework 
    - SPA
    - to hit to end point 
    - to test 
    - for reactive approach -
    .... 

- library 
    - JSX 
    - virtual dom 
    - fetch, axios 
```
    <head>
        <style>
            .headler {
                min-heigh:300px; 
                display: block; 
                background-color:orange;
            }
        </style>
    </head>
    <body>
        <div id="header" class="header">
        </div>

        <div id="main">
        </div>

        <div id="aside">
        </div>

        <div id="footer">
        </div>

        
    </body>
```


- Components 
    - class - stateful - extends Component (idea of life cycle comes into picture) - state 
    - function - stateless 



# Day 18 
- Events & methods
    - if you mutate state variable render function is called, so the view is updated 

    ```
         <button className="btn btn-danger"
                    onClick={
                        this.decrement
                    }>Decrement</button>


                <button className="btn btn-success"
                    onClick={() =>
                        this.incrementOrDecrement(1)
                    }>INCR</button>
    ```
- Stateless and stateful component
- Forms & Inputs
    - un-controlled components (deprecated)
    - Controlled component 
        ```
             !value or value == undefined 
        ```
- nesting component 
- Lifecycle of React Staful Component
- Higher Order Component 
- CSS Styling
- Form Validation 

- npm dependencies 
    - npm i ---- 
    - npm i --save-dev 
Example 
- npm install bootstrap 
- npm i --save-dev jest 

# Day 19 
- nesting component 
- Lifecycle of React Staful Component

    ```
        class Component  {
            // has functions nad properties 
        }
        class MyComponent extends Component {}
    ```
- Higher Order Component 
    ```
        class ContactList extends Contact {

        }

        export defauult Loading('contacts')(ContactList)


        class ProductList extends Contact {

        }

        export defauult Loading('products')(ProductList)
    ```
- CSS Styling - styled components
- Hooks, Error Boundaries
- React.lazy and Suspense 
    - lazy loading 
- CSR/SSR
- fetch with life cycle components 
    - you use fetch function to fetch 
    - you can use axios to fetch 



```
function AppComponent (props) {
    return(
 <div className='app-content'>
                <h3>Employee Details</h3>
                <table style={{ border: "1px solid black" }}>
                    <tbody>
                        <tr>
                            <td>Employee Name </td>
                            <td>{emp.name}</td>
                        </tr>
                        <tr>
                            <td>Employee Exp</td>
                            <td>{emp.experience}</td>
                        </tr>
                        <tr>
                            <td>Employee Exp</td>
                            <td>{emp.email}</td>
                        </tr>
                    </tbody>
                </table>
            </div >
    );
} 

```

-- post fetch 

```
    fetch("http://localhost:4000/contacts", {
        'content-type':'application/json", 
        'body': JSON.stringfy(contact)
    })
    .then(rep => rep.json())
    .then(data... )
```


# Day 20 


-- old style 
```
    var oldComponentStyle = React.createClass({
        render:  function() {
            return(
                <div>
                    <h1>Hey wondering i was the first syntax of React </h1>
                </div>
            )
        }, 
        myrender: function() {
            return(
                <div>
                    <h2>Hey hit is myrender</h2>
                </div>
            )
        }
    })
```

- class based 
```
    class HistoricalClasses extends React.Comonent {
        render() {
            return <div><h2>I'm still a old Guy</h2></div>
        }
    }
```

- function based 
```
function FunctionStyle() {
    render() {
        return(
                <div>
                    i was your friend u remember 
                </div>

        )
    }
}
```

- new age person 
```
    function ComonentOfToday() {
        const [name, setName] = useState("Simar"); 
        return(
                <div>
                    <h1>What a journey with react  {name} </h1>
                </div>

        ) 
    }
```


# Day 21 

    const [number, setNumber] = useReducer((number, newNumber) => number + newNumber, 0);
    const [store/state, dispatch] = useReducer((state, dispatcher) => { switch }, initialValue);




{
  type: 'ADD_CONTACT', data:{name:'Rohan', email:'rohan@example.com'}
}
{
  type: 'DELETE_CONTACT', data:1
}


```
    <Router>
        <nav>
            <ul>
                <li>
                    <Link to="/first-link">First</Link>
                </liu>
                <li>
                    <Link to="/second-link">second</Link>
                </liu>
                <li>
                    <Link to="/third-link">third</Link>
                </liu>
            </ul>
        </nav>

        <Switch>
            <Route path="/first-link" exact={true}>
                <FirstComponent /> 
            </Route>
            <Route path="/seond-link" exact={true}>
                <SeondComponent /> 
            </Route>
            <Route path="/third-link" exact={true}>
                <ThirdComponent /> 
            </Route>
            <Route path="*">
                <NotFound /> 
            </Route>
        </Switch>


    </Router>
```


Assert.equals(expected, actual); 

```
    test("my testmessage goes here ", () => {
        // look for the element - testing library 
        // expect -jest 
    })
```




# Day 22 
- cucumber 
    - BDD - Behaviour Driven Development tool 
    - Given (Pre Condition), When(Actual Execution), Then (Post Condition), And(Multiple), But (Excpetion)
    - Ruby 
        - Java, Scala, Ruby, Kotlin, Groovy, JavaScript




For Selnium 

- xml 
- xpath - is a query language for xml 
- selenium is an API 
    - lot of interfaces are defined here 
    - each browser people have the implementation of the interfaces 


```
    Feature: save contact - with POM 
    Scenario: 
        Given the application is loaded on http://localhost:3000
        When user enters himanshu
        And email is himanshu@gmail.com
        And phone is 9898989898
        And Click on add to list 
        Then Find the name called himanshu (ignore case) on the page 

 Scenario: 
        Given the application is loaded on http://localhost:3000
        When user enters himanshu
        And email is himanshu
        And phone is 9898989898
        And Click on add to list 
        Then next t "Add to List" button look for the message called "Not a valid email id"

```



# Day23
    - Kafka
        - Introduction to Kafka 
        - ESB - Enterprise Service Bus 
            - Kafka - Apache
            - Open MQ 
            - Rabbit MQ 
            - Tibco 
            - Mulesoft 



- working with kafka 

> ./zookeeper-server-start.sh ../../config/zookeeper.properties 

> ./kafka-server-start.sh ../config/server.properties 

> kafka-topics.sh --bootstrap-server localhost:9092 --list

> kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic first-topic 

> kafka-topics.sh --bootstrap-server localhost:9092 --create --topic second-topic 

> kafka-console-producer.sh --bootstrap-server localhost:9092 --topic first-topic

> kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic first-topic

> kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic first-topic --from-beginning 



-- from server when req from spring boot 
```
    SendResult 
    [producerRecord=ProducerRecord
        (topic=first-topic, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), 
        key=null, 
        value=Sample Message from spring boot1, 
        timestamp=null), 
        recordMetadata=first-topic-0@16
    ]
```


# Day 24 
- Docker
    - Working with Docker
    - Introduction to container 

    ```
        http://localhost:8080
        > docker run --name sap-jenkins -p 8080:8080 -p 50000:50000 -v /Users/naveenkumar/Desktop/docker-jenkins:/var/jenkins_home jenkins 

        > docker run --name sap-jenkins3 -p 8080:8080  -p 50000:50000 -v /Users/naveenkumar/Desktop/docker-jenkins:/var/jenkins_home jenkins:2.60.1
    ```
    - orchestration
    - deploying a spring boot application with k8s
    - security (Understaning)


- UI 
    - ReactJS 
    - HTML 
    - CSS 
    -JAVASCRIPT
    - Invoke the end point and process + coloring 

- Application 
    - Spring Boot 
    - Netflit Tooks

- DB
    - MongoDB 
    - Redis 

- Cloud 
    - AWS 

- Testing 
    - Gatling
    - jMeter


- Orchestration 
    - Kubernetes 
    - Docker Swarm 
    - Rancher 


- user stories 
    - spotify as ex
    - weather 
    - history 
    - family collaboration 
    - more options on recommendation 1. is weather 
    - project should be around on the 5g edge + caching, IOT
    - high level diagram needed
    - if its IOT - need an session for the class + trainer 



1. edge 
2. performance 
3. iot 
4. devops 



# Day 25 

> docker image build -t spring-boot-image:1 . 

> docker image tag 2022-spring-1:1 adithnaveen/2022-spring-boot-1:1

> docker push adithnaveen/2022-spring-boot-1:1

> docker pull adithnaveen/2022-spring-boot-1:1

> docker run -p 9090:9090 --name spring-boot-app-1 adithnaveen/2022-spring-boot-1:1

> docker run -p 9091:9090 --name spring-boot-app-2 adithnaveen/2022-spring-boot-1:1


> docker pull satyasai0922/2022-spring-boot-1:1

- Docker - Contanarization 
- Kubernetes, Docker Swarm, Rancher - Orchestration 

- kubenetes 

> kubectl create deployment demo --image=adithnaveen/2022-spring-boot-1:1 --dry-run -o=yaml > deployment.yaml

> AWS
    - Creating VPC
    - understanding NAT
    - Security policies
    - AWS - Creating EC2 instances


10.0.0.0/32- max of 1 ip is allocated 

10.0.0.0/24- max of 1 ip is allocated (10.0.0.0 to 10.0.0.255)

10.0.0.0/16- max of 1 ip is allocated (10.0.0.0 to 10.0.255.255)

10.0.0.0/8- max of 1 ip is allocated (10.0.0.0 to 10.255.255.255)



Spring 0 
- Technical stories 
    - setup the infra related work 
    - setting up MS Arch for Backend 
    - Setting up front end Arch + Cache lib (Varnish)
    - Setting DB + Server cache DB 
    - integration the code with sapient tools (Sonar)



# Prod Phase 

- Coding 
    - java 
    - spring boot 
    - spring test 
    - react 
    - testing library 
- Functionality 
    - given in sprint basis 
- DevOps 
    - Docker 
    - Jenkins 
    - Kubernetes 
- NFR 
    - UI 
    - Services
    - gatling / jmeter 
    - selenium + cucumber  (Gherkins)
- DB 
    - mongodb 
        - repl server 1+2 
        - sharing 1 + 3 *  3 
    - Redis 
- Infra 
    - settiup pipeline 
    - Creating branching strategy 
    - creating aws instances  + vpc etc 
- Documentation 
    - Confluence 
    - Jira 
    - .docx 
    - .xlsx 
    - .ppt 




1. pull the spring boot application which is deployed on hub.docker.com on aws instance which will be created and host it 
2. Create VPC 


DOD - Defination of Done - mostly technical
DOR - Defination of Release - mostly function 


- To know how to do work log + creating sub task is good or not 



PASD-233 -> 



- create repo to - karthikey, 

- discovery-service
- api-gateway
- restaurant 
- customer 
- promotion 
- order



- multi module project 
- use case diagram, sequence 