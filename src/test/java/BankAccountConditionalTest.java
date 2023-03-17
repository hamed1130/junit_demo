import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {
    @Test
    @EnabledOnOs({OS.MAC})
    public void testOnMac() {}

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testOnWindows() {}

    @Test
    @EnabledOnOs({OS.LINUX})
    public void testOnLinux() {}

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    public void testJRE17() {}

    @DisabledOnJre({JRE.JAVA_9})
    public void testNoJRE16() {}
}
