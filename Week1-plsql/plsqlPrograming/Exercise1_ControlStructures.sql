DECLARE
    CURSOR c_customers IS
    SELECT CustomerID,
           TRUNC(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
    FROM Customers;

BEGIN
    FOR c IN c_customers LOOP

        IF c.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;
        END IF;

    END LOOP;

    COMMIT;
END;
/


ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
    UPDATE Customers
    SET IsVIP='TRUE'
    WHERE Balance > 10000;

    COMMIT;
END;
/



BEGIN

    FOR loan IN
    (
        SELECT CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE
        AND SYSDATE+30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
        'Reminder for Customer '
        || loan.CustomerID);
    END LOOP;

END;
/