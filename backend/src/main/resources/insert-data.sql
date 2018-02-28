insert into Professor(name, email) values
	('John Doe','johndoe@gmail.com'),
	('Jane Doe','janedoe@gmail.com'),
	('Janie Doe','janiedoe@gmail.com');
	
insert into Course(title, available, level, time, professor_id) values
	('Programming for dummies', false, 'BASIC', 60, 1),
	('TDD', true, 'INTERMEDIATE', 40, 2),
	('Spring framework step-by-step', true, 'INTERMEDIATE', 50, 2),
	('AngularJS', true, 'ADVANCED', 70, 3);