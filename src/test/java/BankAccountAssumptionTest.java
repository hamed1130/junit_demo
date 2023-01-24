import com.mycompany.main.java.forunittest.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountAssumptionTest {
    @Test
    @DisplayName("Activation account after creation, with assumeTrue() tested successfully.")
    public void testWithAssumptionTrue() {
        BankAccount bankAccount = new BankAccount(500, -100);
        Assumptions.assumeTrue(bankAccount != null);
        Assertions.assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Activation account after creation, with assumeFalse() tested successfully.")
    public void testWithAssumptionFalse() {
        BankAccount bankAccount = new BankAccount(500, -100);
        Assumptions.assumeFalse(bankAccount == null);
        Assertions.assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Activation account after creation, with assumingThat() tested successfully.")
    public void testWithAssumingThat() {
        BankAccount bankAccount = new BankAccount(500, -100);
        Assumptions.assumingThat(bankAccount == null, ()->Assertions.assertTrue(bankAccount.isActive()));
    }

}
