drop table APP.TRANSACTION_HISTORY;
drop table APP.FINANCIAL_PROFILE;
drop table APP.RECURRENCE_TYPE;
drop table APP.PAYMENT_TYPE;
drop table APP.INTERACTION_HISTORY;
drop table APP.INTERACTION_TYPE;
drop table APP.EMAIL_ADDRESS;
drop table APP.PHONE_NUMBER;
drop table APP.CONSTITUENT;
drop table APP.CONSTITUENT_TYPE;

CREATE TABLE APP.CONSTITUENT_TYPE (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	TYPE VARCHAR(25) NOT NULL,
	PRIMARY KEY (ID)
);

INSERT INTO APP.CONSTITUENT_TYPE (TYPE) VALUES ('Donor');
INSERT INTO APP.CONSTITUENT_TYPE (TYPE) VALUES ('Volunteer');
INSERT INTO APP.CONSTITUENT_TYPE (TYPE) VALUES ('Event Participant');
INSERT INTO APP.CONSTITUENT_TYPE (TYPE) VALUES ('Other');


CREATE TABLE APP.CONSTITUENT (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTITUENT_TYPE_ID INTEGER NOT NULL,
	FIRST_NAME VARCHAR(50),
	LAST_NAME VARCHAR(50),
	ADDRESS_1 VARCHAR(255),
	ADDRESS_2 VARCHAR(255),
	CITY VARCHAR(50),
	STATE VARCHAR(50),
	ZIPCODE VARCHAR(25),
	PRIMARY KEY (ID),
	CONSTRAINT constituent_type_FK FOREIGN KEY (constituent_type_id) REFERENCES app.constituent_type (id) 
);


CREATE TABLE APP.PHONE_NUMBER (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTITUENT_ID INTEGER,
	TYPE VARCHAR(25),
	PHONE_NUMBER VARCHAR(25),
	PRIMARY KEY (ID),
	constraint constituent_phone_FK foreign key (constituent_id) references app.constituent (id)
);


CREATE TABLE APP.EMAIL_ADDRESS (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTITUENT_ID INTEGER,
	TYPE VARCHAR(25),
	EMAIL_ADDRESS VARCHAR(50),
	PRIMARY KEY (ID),
	constraint constituent_email_FK foreign key (constituent_id) references app.constituent (id)
);


CREATE TABLE APP.INTERACTION_TYPE (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	TYPE VARCHAR(25) NOT NULL,
	PRIMARY KEY (ID)
);
	
INSERT INTO APP.INTERACTION_TYPE (TYPE) VALUES ('Phone call');
INSERT INTO APP.INTERACTION_TYPE (TYPE) VALUES ('Email');
INSERT INTO APP.INTERACTION_TYPE (TYPE) VALUES ('In person');
INSERT INTO APP.INTERACTION_TYPE (TYPE) VALUES ('Mailed letter');
INSERT INTO APP.INTERACTION_TYPE (TYPE) VALUES ('Other');


CREATE TABLE APP.INTERACTION_HISTORY (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	CONSTITUENT_ID INTEGER,
	INTERACTION_TYPE_ID INTEGER NOT NULL,
	COMMENT VARCHAR(4000),
	DATE DATE,
	CONSTRAINT interaction_history_type_FK FOREIGN KEY (interaction_type_id) REFERENCES app.interaction_type (id), 
	CONSTRAINT interaction_history_constituent_FK FOREIGN KEY (CONSTITUENT_id) REFERENCES app.constituent (id) 
);
	
	
CREATE TABLE APP.RECURRENCE_TYPE (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	TYPE VARCHAR(25) NOT NULL,
	PRIMARY KEY (ID)
);

INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('Monthly');
INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('Weekly');
INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('Quarterly');
INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('Six months');
INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('Yearly');
INSERT INTO APP.RECURRENCE_TYPE (TYPE) VALUES ('At will');


CREATE TABLE APP.PAYMENT_TYPE (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	TYPE VARCHAR(25) NOT NULL,
	PRIMARY KEY (ID)
);
	
INSERT INTO APP.PAYMENT_TYPE (TYPE) VALUES ('Bank (ACH)');
INSERT INTO APP.PAYMENT_TYPE (TYPE) VALUES ('Credit Card');
INSERT INTO APP.PAYMENT_TYPE (TYPE) VALUES ('Debit Card');
INSERT INTO APP.PAYMENT_TYPE (TYPE) VALUES ('PayPal');


CREATE TABLE APP.FINANCIAL_PROFILE (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	CONSTITUENT_ID INTEGER,
	EXTERNAL_TOKEN VARCHAR(1000),
	PAYMENT_TYPE_ID INTEGER,
	RECURRENCE_TYPE_ID INTEGER,
	ACTIVE_FLG BOOLEAN,
	PRIMARY KEY (ID),
	CONSTRAINT financial_profile_constituent_FK FOREIGN KEY (CONSTITUENT_id) REFERENCES app.constituent (id), 
	CONSTRAINT financial_profile_payment_type_FK FOREIGN KEY (PAYMENT_TYPE_id) REFERENCES app.payment_type (id),
	CONSTRAINT financial_profile_recurrence_type_FK FOREIGN KEY (RECURRENCE_TYPE_id) REFERENCES app.recurrence_type (id)
);


CREATE TABLE APP.TRANSACTION_HISTORY (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY, 
	FINANCIAL_PROFILE_ID INTEGER,
	AMOUNT DECIMAL(19,4),
	TIMESTAMP TIMESTAMP,
	COMMENT VARCHAR(4000),
	PRIMARY KEY (ID),
	CONSTRAINT transaction_history_financial_profile_FK FOREIGN KEY (financial_profile_id) REFERENCES app.financial_profile (id)
);
	