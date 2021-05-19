DROP TABLE applicationjson CASCADE CONSTRAINTS;
DROP SEQUENCE applicationjsonseq;

CREATE TABLE applicationjson
{
	applicationID NUMBER(19, 0) NOT NULL,
	guid VARCHAR2 (36 CHAR) UNIQUE,
	createdate timestamp,
	lastupdatedate timestamp,
	json clob,
	productid VARCHAR2(2 CHAR),
	PRIMARY KEY (applicationID)
}

CREATE SEQUENCE applicationjsonseq
	START WITH 1000000001
	MAXVALUE 1500000001;