CREATE DATABASE ProjectTwo;

CREATE TABLE user_info(
	user_id SERIAL PRIMARY KEY,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL UNIQUE,
	password VARCHAR(100) NOT NULL,
	DoB DATE NOT NULL,
	SSN VARCHAR(11) NOT NULL,
	address VARCHAR(100) NOT NULL,
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

CREATE TABLE payments( --just testing out my branch
	payment_id SERIAL PRIMARY KEY NOT NULL CHECK(id > 0),
	user_id INT NOT NULL,
	card_type VARCHAR(40) NOT NULL,
	cvv INT NOT NULL,
	exp_date DATE,
	amount INT NOT NULL,
	-- im not sure if due date is exactly what we want 
	due_date DATE,
	description VARCHAR(100) NOT NULL
);

create table claim(
	claim_id SERIAL primary key CHECK(id>0),
	user_id INT not null, 
	clain_description Varchar(50),
	amount float check (amount>0),
	status varchar(20) default 'pending',
	submission_date DATE,
	decision_date DATE default null,
	foreign key (user_id) references user_info(user_id)
);
