import com.mycompany.main.java.forunittest.BankAccount;
import com.mycompany.main.java.forunittest.BankAccountParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelExecutionTest {
    @Test
    @DisplayName("Deposit1 being tested in parallel...")
    public void testDeposit1(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit2 being tested in parallel...")
    public void testDeposit2(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit3 being tested in parallel...")
    public void testDeposit3(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
