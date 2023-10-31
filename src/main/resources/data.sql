INSERT INTO classrooms (classroomId, capacity) VALUES ('MIE123', 120);
INSERT INTO classrooms (classroomId, capacity) VALUES ('APS111', 500);

INSERT INTO departments (code, name, contactEmail) VALUES ('MIE', 'Mechanical and Industrial Engineering', 'reception@mie.utoronto.ca');
INSERT INTO departments (code, name, contactEmail) VALUES ('ECE', 'Electrical and Computer Engineering', 'eceinquiry@utoronto.ca');
INSERT INTO departments (code, name, contactEmail) VALUES ('MSE', 'Materials Science and Engineering', 'materials.engineering@utoronto.ca');

INSERT INTO students (id, firstName, lastName, email) VALUES (1111, 'Tyrion', 'Lannister', 'tyrion.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (2222, 'Cersei', 'Lannister', 'cersei.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (3333, 'Jaime', 'Lannister', 'jaime.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (4444, 'Daenerys', 'Targaryen', 'jaime.targaryen@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (5555, 'Jon', 'Snow', 'jon.snow@mail.univ.ca');



INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (1122, 'Sansa', 'Stark', 'sansa.stark@univ.ca', 'BA1234', 50000);
INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (3344, 'Arya', 'Stark', 'arya.stark@univ.ca', 'MC1234', 70000);
INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (5566, 'Jorah', 'Mormont', 'jorah.mormont@univ.ca', 'MY1234', 60000);

INSERT INTO users (username, firstName, lastName, email, birthMonth, birthDay, birthYear, password) VALUES ('bruh', 'Armanbek', 'Narzibekov', 'arman.narzibekov@mail.utoronto.ca', 1, 12, 2002, 'password');
INSERT INTO recommendations (recommendationId, sleepAmount, username) VALUES (11111, 12, 'bruh');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333335, 'bruh' , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 'idk');


INSERT INTO courses (code, name, professorId) VALUES ('GOT123', 'A Game of Thrones', 1122);
INSERT INTO courses (code, name, professorId) VALUES ('GOT456', 'A Clash of Kings', 3344);
INSERT INTO courses (code, name, professorId) VALUES ('GOT789', 'A Storm of Swords', 5566);

INSERT INTO marks(studentId, courseCode, mark) VALUES(1111, 'GOT123', 80);
INSERT INTO marks(studentId, courseCode, mark) VALUES(2222, 'GOT123', 85);
INSERT INTO marks(studentId, courseCode, mark) VALUES(3333, 'GOT456', 90);
INSERT INTO marks(studentId, courseCode, mark) VALUES(4444, 'GOT456', 95);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT789', 100);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT123', 80);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT456', 90);