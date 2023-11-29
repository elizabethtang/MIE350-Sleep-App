INSERT INTO users (username, firstName, lastName, email, birthMonth, birthDay, birthYear, password) VALUES ('test', 'Armanbek', 'Narzibekov', 'arman.narzibekov@mail.utoronto.ca', 1, 12, 2002, 'password');
INSERT INTO recommendations (recommendationId, sleepAmount, username) VALUES (11111, 8, 'test');

-- SleepDatas Inserts
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333340, 'test', 22, 15, 6, 30, 1, 2, 1, 1, 2020, 2020, 8, 3, 'Dreamt of a beach');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333341, 'test', 23, 45, 7, 10, 3, 4, 1, 1, 2020, 2020, 9, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333342, 'test', 21, 30, 5, 45, 5, 6, 1, 1, 2020, 2020, 7, 2, 'A dream about a music festival');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333343, 'test', 0, 10, 8, 20, 8, 9, 1, 1, 2020, 2020, 10, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333344, 'test', 22, 50, 6, 40, 10, 11, 1, 1, 2020, 2020, 6, 3, 'Dreamt of hiking in mountains');

-- ActivityData Inserts
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654655, 'test', 45, '20200115', 'Energetic', 200, 300, 1500, 'Gym workout');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654656, 'test', 30, '20200120', 'Tired', 50, 250, 1200, 'Yoga');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654657, 'test', 60, '20200125', 'Motivated', 100, 400, 1800, 'Cycling');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654658, 'test', 20, '20200130', 'Relaxed', 0, 150, 800, 'Walking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654659, 'test', 35, '20200204', 'Happy', 80, 280, 1400, 'Swimming');

-- SleepDatas Inserts for February 2020
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333345, 'test', 23, 00, 6, 55, 13, 14, 2, 2, 2020, 2020, 8, 4, 'Dream about a lost pet');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333346, 'test', 21, 40, 5, 30, 16, 17, 2, 2, 2020, 2020, 7, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333347, 'test', 22, 25, 6, 10, 19, 20, 2, 2, 2020, 2020, 6, 2, 'A dream about being a superhero');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333348, 'test', 0, 15, 7, 45, 22, 23, 2, 2, 2020, 2020, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333349, 'test', 23, 50, 7, 20, 25, 26, 2, 2, 2020, 2020, 8, 4, 'Dreamt of a family gathering');

-- ActivityData Inserts for February 2020
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654660, 'test', 50, '20200207', 'Focused', 150, 350, 1600, 'Running');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654661, 'test', 40, '20200211', 'Joyful', 120, 300, 1300, 'Dance class');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654662, 'test', 55, '20200216', 'Satisfied', 70, 420, 2000, 'Hiking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654663, 'test', 25, '20200221', 'Calm', 30, 180, 900, 'Stretching');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654664, 'test', 45, '20200227', 'Refreshed', 90, 310, 1450, 'Kickboxing');

-- SleepDatas Inserts for March 2022
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333350, 'test', 22, 10, 5, 50, 3, 4, 3, 3, 2022, 2022, 7, 2, 'Dream about an ancient city');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333351, 'test', 23, 30, 6, 40, 6, 7, 3, 3, 2022, 2022, 8, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333352, 'test', 21, 45, 6, 00, 10, 11, 3, 3, 2022, 2022, 6, 4, 'A dream about a space journey');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333353, 'test', 0, 05, 7, 30, 14, 15, 3, 3, 2022, 2022, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333354, 'test', 22, 55, 6, 15, 18, 19, 3, 3, 2022, 2022, 7, 3, 'Dreamt of a mysterious forest');

-- ActivityData Inserts for March 2022
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654665, 'test', 35, '20220304', 'Vigorous', 110, 280, 1400, 'Crossfit');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654666, 'test', 20, '20220309', 'Relieved', 60, 200, 1100, 'Pilates');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654667, 'test', 30, '20220315', 'Proud', 140, 350, 1700, 'Weight training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654668, 'test', 45, '20220322', 'Energized', 180, 400, 1900, 'Mountain biking');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654669, 'test', 50, '20220328', 'Inspired', 90, 450, 2100, 'Trail running');

-- SleepDatas Inserts for April 2022
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333355, 'test', 23, 20, 6, 30, 1, 2, 4, 4, 2022, 2022, 8, 4, 'Dream about a musical performance');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333356, 'test', 22, 00, 5, 45, 5, 6, 4, 4, 2022, 2022, 7, 2, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333357, 'test', 0, 30, 7, 55, 9, 10, 4, 4, 2022, 2022, 9, 5, 'A dream about winning a competition');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333358, 'test', 21, 35, 6, 10, 13, 14, 4, 4, 2022, 2022, 6, 3, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333359, 'test', 23, 05, 7, 20, 17, 18, 4, 4, 2022, 2022, 8, 4, 'Dreamt of a peaceful retreat');

-- ActivityData Inserts for April 2022
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654670, 'test', 60, '20220402', 'Determined', 200, 500, 2200, 'Marathon training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654671, 'test', 40, '20220408', 'Joyful', 50, 320, 1600, 'Dancing');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654672, 'test', 25, '20220414', 'Content', 0, 180, 900, 'Gentle yoga');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654673, 'test', 30, '20220420', 'Accomplished', 120, 360, 1800, 'Rock climbing');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654674, 'test', 45, '20220427', 'Rejuvenated', 70, 410, 2050, 'Surfing');

-- SleepDatas Inserts for November 23-29, 2023
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333360, 'test', 22, 30, 6, 00, 23, 24, 11, 11, 2023, 2023, 7, 3, 'Dreamt of a festive celebration');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333361, 'test', 23, 45, 7, 15, 24, 25, 11, 11, 2023, 2023, 8, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333362, 'test', 21, 50, 5, 40, 25, 26, 11, 11, 2023, 2023, 6, 2, 'A dream about a childhood friend');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333363, 'test', 0, 05, 7, 50, 26, 27, 11, 11, 2023, 2023, 9, 5, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333364, 'test', 23, 10, 6, 30, 27, 28, 11, 11, 2023, 2023, 8, 3, 'Dream about a serene lake');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333365, 'test', 22, 20, 6, 45, 28, 29, 11, 11, 2023, 2023, 7, 4, '');
INSERT INTO sleepDatas (SleepDataId, user_Username, startHour, startMinute,  endHour, endMinute, startDay, endDay, startMonth, endMonth,  startYear,  endYear,  startTiredness,  endTiredness,  dream) VALUES (333366, 'test', 23, 35, 7, 05, 29, 30, 11, 11, 2023, 2023, 8, 2, 'A dream about exploring a city');

-- ActivityData Inserts for November 23-29, 2023
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654675, 'test', 30, '20231123', 'Motivated', 80, 300, 1500, 'Strength training');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654676, 'test', 45, '20231124', 'Energized', 100, 350, 1750, 'Basketball');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654677, 'test', 20, '20231125', 'Relaxed', 60, 200, 1000, 'Leisurely walk');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654678, 'test', 55, '20231126', 'Inspired', 90, 400, 2000, 'Long distance running');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654679, 'test', 40, '20231127', 'Accomplished', 70, 320, 1600, 'Swimming');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654680, 'test', 35, '20231128', 'Fulfilled', 50, 280, 1400, 'Cycling');
INSERT INTO activityData (ActivityID, user_Username, time, date, userFeel, caffeineIntake, calorieBurn, calorieIntake, activitiesForToday) VALUES (654681, 'test', 25, '20231129', 'Calm', 30, 220, 1100, 'Yoga');


INSERT INTO emailMessages (emailMessageId, username, recommendationID, emailMessage)
VALUES (7778, 'test', 11111, 'test email');
