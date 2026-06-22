DECLARE

CURSOR c_accounts IS
SELECT AccountID
FROM Accounts;

BEGIN

    FOR acc IN c_accounts LOOP

        UPDATE Accounts
        SET Balance=Balance-100
        WHERE AccountID=acc.AccountID;

    END LOOP;

    COMMIT;

END;
/