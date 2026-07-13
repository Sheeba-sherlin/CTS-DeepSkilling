UpdateCustomerLastModified
CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE
ON Customers
FOR EACH ROW
BEGIN

    :NEW.LastModified := SYSDATE;

END;
/


LogTransaction
CREATE TABLE AuditLog(
    LogID NUMBER,
    Message VARCHAR2(200)
);

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT
ON Transactions
FOR EACH ROW
BEGIN

    INSERT INTO AuditLog
    VALUES(
        :NEW.TransactionID,
        'Transaction Inserted'
    );

END;
/