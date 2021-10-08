//Imports required so that Java can input characters to the program
//and caputre output characters from the program
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//Imports required for Junit
//When compiling and running this code
//we'll need the junit jar and the hamcrest jar
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTestMain {

    @Test  //annotation indicates that this is a unit test method for JUnit
    public void testcli() {
        
        //going to send 1 return, 1 return, 1 return as input to the program
        String input = "1\n1\n1\n";

        //Create a new byte input stream named "in"
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //Create a new byte input stream named "out"
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        /*
        We're invoking the main method right? It always has that  String[] arg thing..
        In most Java code we don't pass an argument to the program, it is empty
        so an empty argument is sent: {}*/
        String[] args = {};
        
        //Take the empty argument and run the main method in a static way.
        Demo.main(args);

        /* 
        Create a string variable named "consoleOutput" that creates the output text we should see
        if the program works correctly for input 1 return, 1 return, 1 return
        Many OS's and command lines treat hidden characters such are newlines, carriage returns, line feeds,
        EOL, EOF, etc. differently.  So here the string is build by asking the "System" aka Windows, or Mac
        or whatever it is - 'what do you consider a line?'
        we have to take into account how the OS handles text to make this unit test work...
        Is is worth it?
        */

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        //Now do the assertEquals.  
        //Does the output of the program captured by "out" match the string we created named
        //"consoleOutput"
        assertEquals(consoleOutput, out.toString());
        
    }
    
}
