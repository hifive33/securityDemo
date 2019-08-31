
/* Drop Tables */

DROP TABLE Employee CASCADE CONSTRAINTS;
DROP TABLE Depart CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_Depart_departno;




/* Create Sequences */

CREATE SEQUENCE SEQ_Depart_departno INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE Depart
(
	-- 부서 번호
	departno number NOT NULL,
	-- 부서 이름
	departname varchar2(50) NOT NULL,
	-- 부서가 있는 지역
	location varchar2(50) NOT NULL,
	PRIMARY KEY (departno)
);


CREATE TABLE Employee
(
	-- 사원번호, 공백을 수용하지 않음
	empid varchar2(20) NOT NULL,
	-- 사원이름
	-- 우리회사는 동명이인이 들어올 수 없음
	username varchar2(50) NOT NULL UNIQUE,
	-- 사원의 만 나이
	age number(3) DEFAULT 0,
	-- 사원의 몸무게
	weight number(5,2) DEFAULT 0,
	-- 부서 번호
	departno number NOT NULL,
	PRIMARY KEY (empid)
);



/* Create Foreign Keys */

ALTER TABLE Employee
	ADD FOREIGN KEY (departno)
	REFERENCES Depart (departno)
;



