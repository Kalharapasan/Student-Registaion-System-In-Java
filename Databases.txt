CREATE DATABASE Student_Management_System;
USE Student_Management_System;

CREATE TABLE Admin ( 
    admin_code VARCHAR(10)  NOT NULL PRIMARY KEY, 
    admin_first_name VARCHAR(50) NOT NULL,
    admin_last_name VARCHAR(50) NOT NULL,
    admin_age INT , 
    admin_birthday DATE,
    admin_address VARCHAR(255),
    admin_email VARCHAR(100) UNIQUE NOT NULL,
    admin_nic INT , 
    admin_salary DECIMAL(10,2) NOT NULL DEFAULT 0.00
);


-- Teacher Table
CREATE TABLE Teacher (
    
    teacher_code VARCHAR(10)  NOT NULL PRIMARY KEY, 
    teacher_first_name VARCHAR(50) NOT NULL,
    teacher_last_name VARCHAR(50) NOT NULL,
    teacher_age INT , 
    teacher_birthday DATE,
    teacher_address VARCHAR(255),
    teacher_email VARCHAR(100) UNIQUE NOT NULL,
    teacher_nic INT , 
    teacher_salary DECIMAL(10,2) NOT NULL DEFAULT 0.00
);

CREATE TABLE Student (
    student_code VARCHAR(10)  NOT NULL PRIMARY KEY, 
    student_first_name VARCHAR(50) NOT NULL,
    student_last_name VARCHAR(50) NOT NULL,
    student_age INT CHECK (student_age > 5), -- Optional: Ensure valid student age
    student_birthday DATE,
    student_address VARCHAR(255),
    student_email VARCHAR(100) UNIQUE NOT NULL,
    student_nic INT
);


-- Course Table
CREATE TABLE Course (
    course_id VARCHAR(50) NOT NULL PRIMARY KEY ,
    course_name VARCHAR(100) NOT NULL,
    teacher_code VARCHAR(10),
    course_payment DECIMAL(10,2),
    FOREIGN KEY (teacher_code) REFERENCES Teacher(teacher_code) ON DELETE SET NULL
);

-- Subject Table
CREATE TABLE Subject (
    subject_id VARCHAR(50) NOT NULL PRIMARY KEY,
    subject_name VARCHAR(100) NOT NULL,
    subject_credit INT,
    course_id VARCHAR(50),
    teacher_code VARCHAR(10),
    FOREIGN KEY (course_id) REFERENCES Course(course_id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_code) REFERENCES Teacher(teacher_code) ON DELETE SET NULL
);
select * from Subject;

-- TimeTable Table
CREATE TABLE TimeTable (
    timetable_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id VARCHAR (100) NOT NULL,
    subject_id VARCHAR(100) NOT NULL,
    teacher_code VARCHAR(10),
    time_mon VARCHAR (100) NOT NULL,
    time_tue VARCHAR (100) NOT NULL,
    time_wed VARCHAR (100) NOT NULL,
    time_thu VARCHAR (100) NOT NULL,
    time_fri VARCHAR (100) NOT NULL,
    FOREIGN KEY (course_id) REFERENCES Course(course_id) ON DELETE CASCADE,
    FOREIGN KEY (subject_id) REFERENCES Subject(subject_id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_code) REFERENCES Teacher(teacher_code) ON DELETE SET NULL
);

-- SubjectMark Table
CREATE TABLE SubjectMark (
    student_code VARCHAR(10)  ,
    course_id VARCHAR(50) ,
    subject_id VARCHAR(10) ,
    teacher_code VARCHAR(10) ,
    subject_mark int(100),
    subject_gpa DECIMAL(3,2),
    FOREIGN KEY (student_code) REFERENCES Student(student_code) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES Course(course_id) ON DELETE CASCADE,
    FOREIGN KEY (subject_id) REFERENCES Subject(subject_id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_code) REFERENCES Teacher(teacher_code) ON DELETE SET NULL
);


CREATE TABLE LoginUser(
    userId VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL ,
    userType VARCHAR(255) NOT NULL 
);

CREATE TABLE Enrolle(
    student_code VARCHAR(10) NOT NULL ,
    course_id VARCHAR(50) NOT NULL,
    FOREIGN KEY (student_code) REFERENCES Student(student_code) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES Course(course_id) ON DELETE CASCADE

);