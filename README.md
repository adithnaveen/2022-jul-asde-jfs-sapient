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
 3. Create logical data model 
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