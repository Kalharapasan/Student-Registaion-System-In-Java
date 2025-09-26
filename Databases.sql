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

INSERT INTO Admin (admin_code, admin_first_name, admin_last_name, admin_age, admin_birthday, admin_address, admin_email, admin_nic, admin_salary)
VALUES
('A001', 'John', 'Doe', 35, '1989-03-15', '123 Main St, New York, USA', 'john.doe@example.com', 891234567, 4500.00);




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


INSERT INTO Teacher (teacher_code, teacher_first_name, teacher_last_name, teacher_age, teacher_birthday, teacher_address, teacher_email, teacher_nic, teacher_salary)
VALUES
('T001', 'Michael', 'Brown', 45, '1979-02-11', '15 Elm St, Boston, USA', 'michael.brown@example.com', 791234567, 5200.00),
('T002', 'Olivia', 'Johnson', 33, '1991-09-08', '99 King Rd, Sydney, Australia', 'olivia.johnson@example.com', 911234567, 4300.50),
('T003', 'Hassan', 'Ali', 40, '1984-06-25', '23 Jinnah Ave, Karachi, Pakistan', 'hassan.ali@example.com', 841234567, 4800.75),
('T004', 'Isabella', 'Martinez', 29, '1995-12-17', '222 Broadway, New York, USA', 'isabella.martinez@example.com', 951234567, 3900.00),
('T005', 'David', 'Lee', 37, '1987-04-02', '12 Nathan Rd, Hong Kong', 'david.lee@example.com', 871234567, 4500.00);


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

INSERT INTO Student (student_code, student_first_name, student_last_name, student_age, student_birthday, student_address, student_email, student_nic)
VALUES
('S001', 'Alice', 'Green', 12, '2012-05-14', '10 Oak St, Chicago, USA', 'alice.green@example.com', 201234567),
('S002', 'Noah', 'Kim', 15, '2009-03-22', '88 Maple Ave, Seoul, Korea', 'noah.kim@example.com', 200934567),
('S003', 'Fatima', 'Hassan', 17, '2007-08-19', '45 Nile St, Cairo, Egypt', 'fatima.hassan@example.com', 200745678),
('S004', 'Ethan', 'Williams', 14, '2010-11-02', '33 Queen St, Toronto, Canada', 'ethan.williams@example.com', 201045678),
('S005', 'Chloe', 'Brown', 13, '2011-09-27', '56 Hill Rd, London, UK', 'chloe.brown@example.com', 201145678);



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