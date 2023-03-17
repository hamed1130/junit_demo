import com.mycompany.main.java.forunittest.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumptionTest {
    @Test
    @DisplayName("Activation account after creation, with assumeTrue() tested successfully.")
    public void testWithAssumptionTrue() {
        BankAccount bankAccount = new BankAccount(500, -100);
        assumeTrue(bankAccount != null, "message: account is null");
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Activation account after creation, with assumeFalse() tested successfully.")
    public void testWithAssumptionFalse() {
        BankAccount bankAccount = new BankAccount(500, -100);
        assumeFalse(bankAccount == null, "message: account is null");
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Activation account after creation, with assumingThat() tested successfully.")
    public void testWithAssumingThat() {
        BankAccount bankAccount = new BankAccount(500, -100);
        assumingThat(bankAccount != null, ()-> assertTrue(bankAccount.isActive()));
        //Assertions.assertThrows(ArithmeticException.class, ()->bankAccount.isActive());
    }

}
