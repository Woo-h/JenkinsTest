CREATE TABLE TEST(
	SEQ NUMBER NOT NULL
);
SELECT localtimestamp FROM DUAL;

INSERT INTO TEST(SEQ)
VALUES (1);

SELECT * FROM TEST;

INSERT INTO ADMIN.EMP
(EMP_ID, EMP_PASSWORD, EMP_NAME, 
 STATE_NO, EMP_ADDRESS, EMP_PHONE, 
EMP_AUTH, EMP_EMAIL, EMP_NFC, 
EMP_REGDATE)
VALUES(
1, '1234', '인사관리자', 
'01' , 'ADMIN', 'AMDIN', 
'ROLE_ADMIN_INSA', 'ADMIN', 0, 
TO_CHAR(SYSDATE,'YYYY-MM-DD')	
);

INSERT INTO ADMIN.EMP
(EMP_ID, EMP_PASSWORD, EMP_NAME, 
 STATE_NO, EMP_ADDRESS, EMP_PHONE, 
EMP_AUTH, EMP_EMAIL, EMP_NFC, 
EMP_REGDATE)
VALUES(
2, '1234', '게시판관리자', 
'01' , 'ADMIN', 'AMDIN', 
'ROLE_ADMIN_BOARD', 'ADMIN', 0, 
TO_CHAR(SYSDATE,'YYYY-MM-DD')	
);

SELECT * FROM EMP WHERE EMP_ID = '2022052001' AND EMP_PASSWORD = '1234';

CREATE SEQUENCE EMP_SEQ INCREMENT BY 1 START WITH 1 MAXVALUE 99 CYCLE;

SELECT * FROM EMP;