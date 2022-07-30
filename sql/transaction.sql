DROP TABLE IF EXISTS ACCOUNT;
CREATE TABLE ACCOUNT (
	ID INT PRIMARY KEY,
	NAME TEXT NOT NULL,
	BALANCE INT
);

INSERT INTO ACCOUNT (ID, NAME, BALANCE) VALUES
	(1, 'customerA', 1000000),
	(2, 'customerB', 1000000),
	(3, 'customerC', 1000000),
	(4, 'customerD', 1000000),
	(5, 'customerE', 1000000),
	(6, 'customerF', 1000000),
	(7, 'customerG', 1000000),
	(8, 'customerH', 1000000),
	(9, 'customerI', 1000000),
	(10, 'customerJ', 1000000);
