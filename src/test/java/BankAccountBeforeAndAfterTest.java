import com.mycompany.main.java.forunittest.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// to use BeforeAll and AfterAll without static, this annotation could be used:
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAndAfterTest {
     static BankAccount bankAccount;

    @BeforeAll
    public static void prepTest() {
        System.out.println("Preparing BeforeAll...");
        bankAccount = new BankAccount(500,0);
    }

    @AfterAll
    public static void endTest() {
        System.out.println("Destroying stuff AfterAll...");
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(300);
        assertEquals(500, bankAccount.getBalance());
    }
}
