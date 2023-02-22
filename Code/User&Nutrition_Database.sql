CREATE TABLE IF NOT EXISTS Users(
  user_ID INT PRIMARY KEY,
  name TEXT,
  gender TEXT,
  age INT,
  height INT,
  weight INT
);

CREATE TABLE IF NOT EXISTS Nutrition(
  user_ID INT PRIMARY KEY,
  calorie  INT,
  carb INT,
  fat INT,
  protein INT
);
  

INSERT INTO Users(user_ID,name,gender,age,height,weight) 
VALUES
  (1, "John Smith" , "Male", 19, 170, 151),
  (2, "Matt Smith" , "Male", 30, 183, 175),
  (3, "Jessica Smith" , "Female", 29, 160, 148),
  (4, "Kevin Smith" , "Male", 35, 175, 182),
  (5, "Lisa Smith" , "Female", 40, 155, 167),
  (6, "Jenny Smith" , "Female", 18, 177, 143),
  (7, "Jayden Smith" , "Male", 25, 161, 160),
  (8, " Howard Smith" , "Male", 27, 182, 195),
  (9, "James Smith" , "Male", 31, 158, 144),
  (10, "David Smith" , "Male", 60, 177, 163),
  (11, "Rachel Smith" , "Female", 25, 160, 141),
  (12, " Naomi Smith" , "Female", 23, 174, 171),
  (13, "Harry Smith" , "Male", 54, 176, 188),
  (14, "Peter Smith" , "Male", 38, 182, 196),
  (15, "Mark Smith" , "Male", 32, 184, 180),
  (16, "Joel Smith" , "Male", 21, 169, 178),
  (17, "Patricia Smith" , "Female", 24, 152, 138),
  (18, "Linda Smith" , "Female", 28, 173, 186),
  (19, "Katy Smith" , "Female", 58, 157, 151),
  (20, "Julia Smith" , "Female", 46, 172, 164);


INSERT INTO Nutrition(user_ID,calorie,carb,fat,protein) 
VALUES
  (1, 2571, 352, 86, 98 ),
  (2, 2781, 373, 93, 114 ),
  (3, 2471, 320, 59, 143),
  (4, 2600, 329, 67, 67 ),
  (5, 2871, 252, 76, 108 ),
  (6, 2541, 342, 80, 132 ),
  (7, 1980, 302, 63, 101 ),
  (8, 2174, 320, 92, 90 ),
  (9, 2711, 369, 83, 92 ),
  (10, 2482, 373, 86, 100 ),
  (11, 2691, 372, 60, 160 ),
  (12, 2485, 311, 71, 123 ),
  (13, 2364, 244, 68, 102 ),
  (14, 3051, 422, 111, 178 ),
  (15, 3167, 431, 102, 198 ),
  (16, 2364, 252, 57, 97 ),
  (17, 2184, 296, 74, 107 ),
  (18, 2432, 289, 77, 125 ),
  (19, 1989, 248, 59, 110 ),
  (20, 2057, 267, 70, 90 );
  
