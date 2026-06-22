CalculateAge
CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob DATE
)
RETURN NUMBER
IS
BEGIN

    RETURN TRUNC(
        MONTHS_BETWEEN(
        SYSDATE,
        p_dob)/12
    );

END;
/


HasSufficientBalance
CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account NUMBER,
    p_amount NUMBER
)
RETURN VARCHAR2
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID=p_account;

    IF v_balance >= p_amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

END;
/