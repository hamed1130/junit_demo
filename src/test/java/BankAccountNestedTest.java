import com.mycompany.main.java.forunittest.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountNestedTest {

    @Test
    @DisplayName("Withdraw tested successfully.")
    public void testWithdraw1() {
        BankAccount bankAccount = new BankAccount(900, 0);
        bankAccount.withdraw(100);
        assertNotEquals(400, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit tested successfully.")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.deposit(250);
        assertEquals(750., bankAccount.getBalance());
    }

    @Nested
    class WhenBalanceEqulsZero {
        @Test
        @DisplayName("Withdraw1 (Nested) tested successfully.")
        public void testWithdrawMinimumBalanceIs0() {
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, ()->bankAccount.withdraw(500));
        }

        @Test
        @DisplayName("Withdraw2 (Nested) tested successfully.")
        public void testWithdrawMinimumBalanceIsNegative1000() {
            BankAccount bankAccount = new BankAccount(0, -1000);
            bankAccount.withdraw(500);
            assertEquals(-500, bankAccount.getBalance());
        }
    }

}
