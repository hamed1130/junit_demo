import com.mycompany.main.java.forunittest.CalculateMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {
    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setupMock() {
        Mockito.when(calculateMethods.divide(15,3)).thenReturn(5.);
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, calculateMethods.divide(15,3));
    }
}
