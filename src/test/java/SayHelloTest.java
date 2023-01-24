import com.mycompany.main.java.forunittest.SayHello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SayHelloTest {
    @Test
    public void test1() {
        SayHello codeForTest = new SayHello();
        Assertions.assertEquals("Hello Dayus khan!!", codeForTest.sayHello());
    }
}
