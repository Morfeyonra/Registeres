create table banks (
	uuid_ VARCHAR(75) null,
	bank_name VARCHAR(75) not null,
	bik VARCHAR(75) not null,
	address VARCHAR(75) null,
	primary key (bank_name, bik)
);

create table job_register (
	position VARCHAR(75) not null primary key,
	archive BOOLEAN
);

create table staff_roster (
	worker_id INTEGER not null primary key,
	last_name VARCHAR(75) null,
	first_name VARCHAR(75) null,
	middle_name VARCHAR(75) null,
	birth_date DATE null,
	position VARCHAR(75) null,
	employment_date DATE null,
	salary INTEGER,
	work_phone_num VARCHAR(75) null,
	mobile_phone_num VARCHAR(75) null,
	bank VARCHAR(75) null,
	archive BOOLEAN
);