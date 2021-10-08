//Imports required for Junit
//When compiling and running this code
//we'll need the junit jar and the hamcrest jar
import static org.junit.Assert.assertEquals;
import org.junit.Test;

//the class containing unit tests for the method in the Demo class
public class DemoTestIsTriangle {

    @Test  //syntactic sugar, an "annotation" that plumbs this method is a unit testing method
    public void testIsTriangleTrue() {  //we can name the method whatever we want
        Demo demo = new Demo();  //instantiating a Demo object is not necessary...why?
        boolean result = demo.isTriangle(1, 1, 1);
        assertEquals(true, result);
    }

    @Test
    public void testIsTriangleFalse() {
        //here we don't instantiate a object from the Demo class
        //and use the method as static method
        boolean result = Demo.isTriangle(2, 2, 0);
        assertEquals(false, result);
        
    }

}
