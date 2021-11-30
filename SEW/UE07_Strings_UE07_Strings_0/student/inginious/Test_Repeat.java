
package inginious;

/*
  2021-05-01 12:05:42.603294 path: out/SEW1/UE07_Strings_UE07_Strings_0, task: {'name': 'A', 'desc': '
*/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Locale;



import static inginious.Template_Repeat.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_Repeat {

    private final ByteArrayOutputStream __stdOut = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        Locale.setDefault(Locale.US);
        //__stdOut.reset();
        System.setOut(new PrintStream(__stdOut));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    private void setStdIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getStdOut() throws IOException {
        __stdOut.flush();
        return __stdOut.toString().replaceAll("\r\n", "\n");
    }

    @Test
    void test000_Repeat0() {
        String __msg = "repeat(\"ab\", 3)";
        setStdIn("");

        try {
          {
            ;

            __msg = "repeat(\"ab\", 3)";

            ;

            assertEquals("ababab",

            repeat("ab", 3)

            , __msg);
            
    assertTrue(getStdOut().isEmpty(), "you shall not print anything! System.out isEmpty()");



           }
        } catch (Exception e) {
            fail(__msg + ": got Exception " + e.getClass() + ": \"" + e.getMessage() + "\"");
        } catch (VirtualMachineError e) {
            fail(__msg + ": got Error " + e.getClass() + ": \"" + e.getMessage() + "\"");
        }
    }

    @Test
    void test001_Repeat1() {
        String __msg = "repeat(\"ab\", 1)";
        setStdIn("");

        try {
          {
            ;

            __msg = "repeat(\"ab\", 1)";

            ;

            assertEquals("ab",

            repeat("ab", 1)

            , __msg);
            
    assertTrue(getStdOut().isEmpty(), "you shall not print anything! System.out isEmpty()");



           }
        } catch (Exception e) {
            fail(__msg + ": got Exception " + e.getClass() + ": \"" + e.getMessage() + "\"");
        } catch (VirtualMachineError e) {
            fail(__msg + ": got Error " + e.getClass() + ": \"" + e.getMessage() + "\"");
        }
    }

    @Test
    void test002_Repeat2() {
        String __msg = "repeat(\"ab\", 0)";
        setStdIn("");

        try {
          {
            ;

            __msg = "repeat(\"ab\", 0)";

            ;

            assertEquals("",

            repeat("ab", 0)

            , __msg);
            
    assertTrue(getStdOut().isEmpty(), "you shall not print anything! System.out isEmpty()");



           }
        } catch (Exception e) {
            fail(__msg + ": got Exception " + e.getClass() + ": \"" + e.getMessage() + "\"");
        } catch (VirtualMachineError e) {
            fail(__msg + ": got Error " + e.getClass() + ": \"" + e.getMessage() + "\"");
        }
    }

    @Test
    void test003_Repeat3() {
        String __msg = "repeat(\"ab\", -2)";
        setStdIn("");

        try {
          {
            ;

            __msg = "repeat(\"ab\", -2)";

            ;

            assertEquals("",

            repeat("ab", -2)

            , __msg);
            
    assertTrue(getStdOut().isEmpty(), "you shall not print anything! System.out isEmpty()");



           }
        } catch (Exception e) {
            fail(__msg + ": got Exception " + e.getClass() + ": \"" + e.getMessage() + "\"");
        } catch (VirtualMachineError e) {
            fail(__msg + ": got Error " + e.getClass() + ": \"" + e.getMessage() + "\"");
        }
    }

}
