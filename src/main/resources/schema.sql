DROP TABLE IF EXISTS Customers;

CREATE TABLE Customers(
Customer_Id SERIAL PRIMARY KEY,
First_Name VARCHAR(50) NOT NULL
CONSTRAINT First_Name CHECK(First_Name NOT LIKE '%^[A-Za-z]%'),
Last_Name VARCHAR(50) NOT NULL
CONSTRAINT Last_Name CHECK(Last_Name NOT LIKE '%^[A-Za-z]%'),
Mobile_No VARCHAR(10) NOT NULL
CONSTRAINT Mobile_No CHECK(Mobile_No NOT LIKE '%^[0-9]%'),
Country VARCHAR(50)
CONSTRAINT Country CHECK(Country NOT LIKE '%^[A-Za-z]%')
);

