import com.mycompany.main.java.forunittest.BankAccount;
import com.mycompany.main.java.forunittest.BankAccountParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {

    @Test
    @DisplayName("Deposit tested successfully with DI.")
    public void testDeposit(BankAccount bankAccount) {
        //BankAccount bankAccount = new BankAccount(0,0);
        bankAccount.deposit(500);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }
}
