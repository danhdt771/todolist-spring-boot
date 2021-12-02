DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id int(11) NOT NULL AUTO_INCREMENT,
	name varchar(32) DEFAULT NULL,
	email varchar(32) NOT NULL,
	password varchar(32) DEFAULT NULL,
	PRIMARY KEY (id),
	CONSTRAINT unique_email UNIQUE (email)
);

DROP TABLE IF EXISTS todo; 
CREATE TABLE todo (
	id int(11) NOT NULL AUTO_INCREMENT,
	userId int(11) NOT NULL,
	title varchar(512) DEFAULT NULL,
	done boolean NOT NULL	DEFAULT 0,
	priority tinyint NOT NULL,
	dueDate date DEFAULT NULL,
	PRIMARY KEY (id),
	CONSTRAINT user_fk FOREIGN KEY (userId) REFERENCES user(id)
);


