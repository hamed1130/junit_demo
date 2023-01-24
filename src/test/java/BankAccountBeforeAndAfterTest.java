import com.mycompany.main.java.forunittest.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;

    @BeforeAll
    public static void prepTest() {
        System.out.println("Preparing...");
        bankAccount = new BankAccount(500,0);
    }

    @AfterAll
    public static void endTest() {
        System.out.println("Destroying stuff...");
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        Assertions.assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(300);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }
}
