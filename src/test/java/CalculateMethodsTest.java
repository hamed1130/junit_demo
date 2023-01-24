import com.mycompany.main.java.forunittest.CalculateMethods;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateMethodsTest {
    private CalculateMethods calculateMethods;

    @BeforeEach
    public void initTest() {
        calculateMethods = new CalculateMethods();
    }

    @Test
    public void testDivide() {
        assertEquals(5, calculateMethods.divide(20, 4));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, ()->calculateMethods.divide(1,0));
    }
}
