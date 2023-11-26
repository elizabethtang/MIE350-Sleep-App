INSERT INTO users (username, firstName, lastName, email, birthMonth, birthDay, birthYear, password) VALUES ('bruh', 'Armanbek', 'Narzibekov', 'arman.narzibekov@mail.utoronto.ca', 1, 12, 2002, 'password');
INSERT INTO recommendations (recommendationId, sleepAmount, username) VALUES (11111, 12, 'bruh');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333335, 'bruh' , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 'idk');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday)
VALUES (654654, 'bruh', 1, 2, 'idk', 11, 13, 12, 'Some activities for today');

INSERT INTO emailMessages (emailMessageId, username, recommendationID, emailMessage)
VALUES (7778, 'bruh', 11111, 'hello World kinda thing');
