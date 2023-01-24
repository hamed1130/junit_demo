import com.mycompany.main.java.forunittest.BankAccount;
import com.mycompany.main.java.forunittest.BankAccountParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTestTest {
    @ParameterizedTest
    @ValueSource(ints = {100, 400, 800, 1000})
    @DisplayName("Deposit tested successfully with DI and parametrized.")
    public void testDeposit(int amount, BankAccount bankAccount) {
        //BankAccount bankAccount = new BankAccount(0,0);
        bankAccount.deposit(amount);
        Assertions.assertEquals(amount, bankAccount.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY", "THURSDAY"})
    public void testDayOdWeek(DayOfWeek day) {
        Assertions.assertTrue(day.toString().startsWith("T"));
    }

    @ParameterizedTest
    @CsvSource({"100, Kuni", "200, KosBaboo", "300, KirDeDoo"})
    public void depositAndNameTest(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        Assertions.assertEquals(amount, bankAccount.getBalance());
        Assertions.assertEquals(name, bankAccount.getHolderName());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "details.csv", delimiter = ',')
    public void depositAndNameTest1(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        Assertions.assertEquals(amount, bankAccount.getBalance());
        Assertions.assertEquals(name, bankAccount.getHolderName());
    }
}
