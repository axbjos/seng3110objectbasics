/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoTest {

    @Test
    public void evaluatesExpression1() {
        //Demo demo = new Demo();
        boolean result = Demo.isTriangle(1, 1, 1);
        assertEquals(true, result);
    }

    @Test
    public void evaluatesExpression2() {
        //Demo demo = new Demo();
        boolean result = Demo.isTriangle(2, 2, 0);
        assertEquals(false, result);
        
    }

}
