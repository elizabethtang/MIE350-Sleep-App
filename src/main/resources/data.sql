INSERT INTO users (username, firstName, lastName, email, birthMonth, birthDay, birthYear, password)
VALUES
    ('test', 'Armanbek', 'Narzibekov', 'mie350sleepapptest@gmail.com', 1, 12, 2002, 'password'),
    ('test1', 'John', 'Doe', 'john.doe@gmail.com', 3, 15, 1995, 'password123'),
    ('test2', 'Jane', 'Smith', 'jane.smith@gmail.com', 6, 22, 1988, 'securepass'),
    ('test3', 'Bob', 'Johnson', 'bob.johnson@gmail.com', 9, 5, 2000, 'pass123'),
    ('test4', 'Alice', 'Johnson', 'alice.johnson@gmail.com', 11, 8, 1990, 'userpass123'),
    ('test5', 'Charlie', 'Smith', 'charlie.smith@gmail.com', 2, 14, 1985, 'strongpassword'),
    ('test6', 'Eva', 'Williams', 'eva.williams@gmail.com', 7, 30, 1998, 'myp@ssword'),
    ('test7', 'Daniel', 'Miller', 'daniel.miller@gmail.com', 4, 5, 2001, 'daniel_pass'),
    ('test8', 'Sophia', 'Davis', 'sophia.davis@gmail.com', 10, 12, 1982, 'sophia123'),
    ('test9', 'Ethan', 'Wilson', 'ethan.wilson@gmail.com', 12, 18, 1993, 'wilsonpass'),
    ('test10', 'Mia', 'Moore', 'mia.moore@gmail.com', 8, 22, 1979, 'miapassword'),
    ('test11', 'Liam', 'Jackson', 'liam.jackson@gmail.com', 5, 3, 2005, 'liam_pass'),
    ('test12', 'Olivia', 'White', 'olivia.white@gmail.com', 9, 10, 1996, 'olivia_pass'),
    ('test13', 'Noah', 'Brown', 'noah.brown@gmail.com', 1, 25, 1987, 'brownpassword');

INSERT INTO recommendations (recommendationId, sleepAmount, username)
VALUES
    (11111, 8, 'test'),
    (22222, 9, 'test2'),
    (33333, 7, 'test3'),
    (11112, 7, 'test4'),
    (11113, 7, 'test6'),
    (11114, 10, 'test8'),

INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute, endHour, endMinute, startDay, endDay, startMonth, endMonth, startYear, endYear, startTiredness, endTiredness, dream)
VALUES
    (333340, 'test1', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (333341, 'test1', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (333342, 'test1', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (333343, 'test1', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (333344, 'test1', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (1333340, 'test2', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (1333341, 'test2', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (1333342, 'test2', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (1333343, 'test2', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (1333344, 'test2', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (2333340, 'test3', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (2333341, 'test3', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (2333342, 'test3', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (2333343, 'test3', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (2333344, 'test3', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (3333340, 'test8', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (3333341, 'test8', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (3333342, 'test8', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (3333343, 'test8', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (3333344, 'test8', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (4333340, 'test9', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (4333341, 'test9', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (4333342, 'test9', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (4333343, 'test9', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (4333344, 'test9', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (5333340, 'test10', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (5333341, 'test10', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (5333342, 'test10', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (5333343, 'test10', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (5333344, 'test10', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (6333340, 'test11', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (6333341, 'test11', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (6333342, 'test11', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (6333343, 'test11', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (6333344, 'test11', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (7333340, 'test12', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (7333341, 'test12', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (7333342, 'test12', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (7333343, 'test12', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (7333344, 'test12', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (8333340, 'test4', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (8333341, 'test4', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (8333342, 'test4', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (8333343, 'test4', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (8333344, 'test4', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (9333340, 'test5', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (9333341, 'test5', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (9333342, 'test5', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (9333343, 'test5', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (9333344, 'test5', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (10333340, 'test6', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (10333341, 'test6', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (10333342, 'test6', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (10333343, 'test6', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (10333344, 'test6', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike'),
    (11333340, 'test7', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach'),
    (11333341, 'test7', 23, 0, 7, 45, 5, 6, 3, 3, 2021, 2021, 6, 2, 'Had a peaceful sleep'),
    (11333342, 'test7', 21, 30, 5, 15, 10, 11, 5, 5, 2022, 2022, 7, 4, 'No dreams, slept soundly'),
    (11333343, 'test7', 22, 45, 6, 0, 15, 16, 8, 8, 2023, 2023, 5, 2, 'Dreamt of flying'),
    (11333344, 'test7', 23, 30, 7, 30, 20, 21, 10, 10, 2024, 2024, 8, 3, 'Dreamt of a mountain hike');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (12333340, 'test', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (12333341, 'test', 23, 45, 7, 10, 3, 4, 1, 1, 2020, 2020, 9, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (12333342, 'test', 21, 30, 5, 45, 5, 6, 1, 1, 2020, 2020, 7, 2, 'A dream about a music festival');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (12333343, 'test', 0, 10, 8, 20, 8, 9, 1, 1, 2020, 2020, 10, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (12333344, 'test', 22, 50, 6, 40, 10, 11, 1, 1, 2020, 2020, 6, 3, 'Dreamt of hiking in mountains');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654656, 'test', 30, '20200120', 'Tired', 50, 250, 1200, 'Yoga');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654657, 'test', 60, '20200125', 'Motivated', 100, 400, 1800, 'Cycling');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654658, 'test', 20, '20200130', 'Relaxed', 0, 150, 800, 'Walking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654659, 'test', 35, '20200204', 'Happy', 80, 280, 1400, 'Swimming');

INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333345, 'test', 23, 00, 6, 55, 13, 14, 2, 2, 2020, 2020, 8, 4, 'Dream about a lost pet');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333346, 'test', 21, 40, 5, 30, 16, 17, 2, 2, 2020, 2020, 7, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333347, 'test', 22, 25, 6, 10, 19, 20, 2, 2, 2020, 2020, 6, 2, 'A dream about being a superhero');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333348, 'test', 0, 15, 7, 45, 22, 23, 2, 2, 2020, 2020, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333349, 'test', 23, 50, 7, 20, 25, 26, 2, 2, 2020, 2020, 8, 4, 'Dreamt of a family gathering');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654660, 'test', 50, '20200207', 'Focused', 150, 350, 1600, 'Running');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654661, 'test', 40, '20200211', 'Joyful', 120, 300, 1300, 'Dance class');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654662, 'test', 55, '20200216', 'Satisfied', 70, 420, 2000, 'Hiking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654663, 'test', 25, '20200221', 'Calm', 30, 180, 900, 'Stretching');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654664, 'test', 45, '20200227', 'Refreshed', 90, 310, 1450, 'Kickboxing');

INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333350, 'test', 22, 10, 5, 50, 3, 4, 3, 3, 2022, 2022, 7, 2, 'Dream about an ancient city');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333351, 'test', 23, 30, 6, 40, 6, 7, 3, 3, 2022, 2022, 8, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333352, 'test', 21, 45, 6, 00, 10, 11, 3, 3, 2022, 2022, 6, 4, 'A dream about a space journey');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333353, 'test', 0, 05, 7, 30, 14, 15, 3, 3, 2022, 2022, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333354, 'test', 22, 55, 6, 15, 18, 19, 3, 3, 2022, 2022, 7, 3, 'Dreamt of a mysterious forest');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654665, 'test', 35, '20220304', 'Vigorous', 110, 280, 1400, 'Crossfit');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654666, 'test', 20, '20220309', 'Relieved', 60, 200, 1100, 'Pilates');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654667, 'test', 30, '20220315', 'Proud', 140, 350, 1700, 'Weight training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654668, 'test', 45, '20220322', 'Energized', 180, 400, 1900, 'Mountain biking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654669, 'test', 50, '20220328', 'Inspired', 90, 450, 2100, 'Trail running');

INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333355, 'test', 23, 20, 6, 30, 1, 2, 4, 4, 2022, 2022, 8, 4, 'Dream about a musical performance');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333356, 'test', 22, 00, 5, 45, 5, 6, 4, 4, 2022, 2022, 7, 2, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333357, 'test', 0, 30, 7, 55, 9, 10, 4, 4, 2022, 2022, 9, 5, 'A dream about winning a competition');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333358, 'test', 21, 35, 6, 10, 13, 14, 4, 4, 2022, 2022, 6, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333359, 'test', 23, 05, 7, 20, 17, 18, 4, 4, 2022, 2022, 8, 4, 'Dreamt of a peaceful retreat');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654670, 'test', 60, '20220402', 'Determined', 200, 500, 2200, 'Marathon training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654671, 'test', 40, '20220408', 'Joyful', 50, 320, 1600, 'Dancing');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654672, 'test', 25, '20220414', 'Content', 0, 180, 900, 'Gentle yoga');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654673, 'test', 30, '20220420', 'Accomplished', 120, 360, 1800, 'Rock climbing');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654674, 'test', 45, '20220427', 'Rejuvenated', 70, 410, 2050, 'Surfing');

INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333360, 'test', 22, 30, 6, 00, 23, 24, 11, 11, 2023, 2023, 7, 3, 'Dreamt of a festive celebration');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333361, 'test', 23, 45, 7, 15, 24, 25, 11, 11, 2023, 2023, 8, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333362, 'test', 21, 50, 5, 40, 25, 26, 11, 11, 2023, 2023, 6, 2, 'A dream about a childhood friend');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333363, 'test', 0, 05, 7, 50, 26, 26, 11, 11, 2023, 2023, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333364, 'test', 23, 10, 6, 30, 27, 28, 11, 11, 2023, 2023, 8, 3, 'Dream about a serene lake');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333365, 'test', 22, 20, 6, 45, 28, 29, 11, 11, 2023, 2023, 7, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333366, 'test', 23, 35, 7, 05, 29, 30, 11, 11, 2023, 2023, 8, 2, 'A dream about exploring a city');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654675, 'test', 30, '20231123', 'Motivated', 80, 300, 1500, 'Strength training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654676, 'test', 45, '20231124', 'Energized', 100, 350, 1750, 'Basketball');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654677, 'test', 20, '20231125', 'Relaxed', 60, 200, 1000, 'Leisurely walk');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654678, 'test', 55, '20231126', 'Inspired', 90, 400, 2000, 'Long distance running');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654679, 'test', 40, '20231127', 'Accomplished', 70, 320, 1600, 'Swimming');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654680, 'test', 35, '20231128', 'Fulfilled', 50, 280, 1400, 'Cycling');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654681, 'test', 25, '20231129', 'Calm', 30, 220, 1100, 'Yoga');

INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday)
VALUES
    (1654655, 'test2', 45, '20200115', 'Energetic', 200, 300, 1500, 'Gym workout'),
    (1654656, 'test2', 60, '20200220', 'Motivated', 150, 250, 1600, 'Running in the park'),
    (1654657, 'test2', 30, '20200325', 'Tired', 100, 200, 1700, 'Yoga session'),
    (1654658, 'test2', 45, '20200430', 'Energetic', 180, 280, 1400, 'Swimming'),
    (1654659, 'test2', 40, '20200505', 'Motivated', 220, 320, 1800, 'Cycling'),
    (2654655, 'test3', 45, '20200115', 'Energetic', 200, 300, 1500, 'Gym workout'),
    (2654656, 'test3', 60, '20200220', 'Motivated', 150, 250, 1600, 'Running in the park'),
    (2654657, 'test3', 30, '20200325', 'Tired', 100, 200, 1700, 'Yoga session'),
    (2654658, 'test3', 45, '20200430', 'Energetic', 180, 280, 1400, 'Swimming'),
    (2654659, 'test3', 40, '20200505', 'Motivated', 220, 320, 1800, 'Cycling');

INSERT INTO emailMessages (emailMessageId, username, recommendationID, emailMessage)
VALUES (7778, 'test', 11111, 'test email');
VALUES (7771, 'test2', 22222, 'test email');
VALUES (7772, 'test3', 33333, 'test email');
VALUES (7773, 'test4', 11112, 'test email');
VALUES (7774, 'test6', 11113, 'test email');
VALUES (7775, 'test8', 11114, 'test email');
