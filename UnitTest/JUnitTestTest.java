import org.junit.Assert;
import org.junit.Test;


public class JUnitTestTest {
    @Test
    public void JUnitTes() {
        JUnitTest helloJunit = new JUnitTest();
        Assert.assertEquals("Hello", helloJunit.print());

    }
}