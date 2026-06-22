CREATE OR REPLACE PACKAGE CustomerManagement AS

    PROCEDURE AddCustomer(
        p_id NUMBER,
        p_name VARCHAR2
    );

    FUNCTION GetBalance(
        p_id NUMBER
    )
    RETURN NUMBER;

END CustomerManagement;
/



CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_id NUMBER,
        p_name VARCHAR2
    )
    IS
    BEGIN

        INSERT INTO Customers
        (
            CustomerID,
            Name
        )
        VALUES
        (
            p_id,
            p_name
        );

    END;

    FUNCTION GetBalance(
        p_id NUMBER
    )
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN

        SELECT Balance
        INTO v_balance
        FROM Customers
        WHERE CustomerID=p_id;

        RETURN v_balance;

    END;

END CustomerManagement;
/