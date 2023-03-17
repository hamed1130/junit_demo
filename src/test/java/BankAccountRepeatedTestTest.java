import com.mycompany.main.java.forunittest.BankAccount;
import com.mycompany.main.java.forunittest.BankAccountParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTestTest {
    @RepeatedTest(5)
    @DisplayName("Deposit tested successfully with DI.")
    public void testDeposit(BankAccount bankAccount) {
        //BankAccount bankAccount = new BankAccount(0,0);
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @RepeatedTest(5)
    @DisplayName("Deposit tested successfully with DI and Repetition Info.")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo repetitionInfo) {
        //BankAccount bankAccount = new BankAccount(0,0);
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
        System.out.println("Test repetition #: " + repetitionInfo.getCurrentRepetition());
    }

}
