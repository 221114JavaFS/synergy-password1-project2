CREATE DATABASE ProjectTwo;

CREATE TABLE user_info(
user_id SERIAL PRIMARY KEY,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
DoB DATE NOT NULL,
SSN VARCHAR(11) NOT NULL,
address VARCHAR(100),
current_employee BOOLEAN NOT NULL,
current_subscriber BOOLEAN NOT NULL
);

CREATE TABLE covid_info(
covid_id SERIAL PRIMARY KEY, --i think primary keys should just be id to avoid confusion
user_id INT NOT NULL,
vaccinated BOOLEAN NOT NULL,
vaccine_type VARCHAR(100),
vaccination_date DATE DEFAULT(null)
);

CREATE TABLE payments(
id SERIAL PRIMARY KEY NOT NULL CHECK(id > 0),
user_id INT NOT NULL,
card_type VARCHAR(20) NOT NULL,
cvv INT NOT NULL,
exp_date DATE,
amount INT NOT NULL,
-- im not sure if due date is exactly what we want 
due_date DATE,
description VARCHAR(100) NOT NULL
);