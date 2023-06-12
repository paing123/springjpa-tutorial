# SpringBoot with JPA, MYSQL, Thymeleaf

### Installing Java 8, Spring Tool Suit 4 & MySQL Server 5.6
- Java 8 : https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
- Spring Tool Suit download link : https://spring.io/tools
- MySQL Server 5.6 : https://downloads.mysql.com/archives/community/?version=5.6.23
- MySQL Workbench 8.0 CE : https://dev.mysql.com/downloads/workbench/

### Running Examples
- Download the zip or clone of springjpa the Git repository.
- Unzip the zip file
- Get SQL file in db folder in unzipped file and import in MySQL Server
- Open Spring Tool Suit 4 IDE
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip of springjpa
   - Select the right project
- Open SpringjpaApplication.java file and right click then Run as -> "Spring Boot App"
- You all are ready to test

### Test register, update and delete for student
- You can see initial screen by calling that link http://localhost:8080/allstudents
01

- You can register with necessary information by clicking Save button
02

- After saving new student, you can see it in the list
03

- You will see the validation when you click save button without any information inserting
04
 
- You can reset all data by clicking reset button
05
06

- You can get the update student form by clicking update link of each student
07

- You can see the validation check when you set empty field in the update student form.
08

- You can edit student information except student id then you can click update button then you will see the updated student in student list table
09

- You can delete the student by clicking delete link of each student. When you click delete link, you will see the confirm dialog form. If you click yes, 
that student will be deleted. If you click no, nothing happens.
10
11
12
