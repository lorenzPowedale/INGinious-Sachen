
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



import static inginious.Template_getRandomPassword.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_getRandomPassword {

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
    void test000_getRandomPassword0() {
        String __msg = "getRandomPassword(50).length()";
        setStdIn("");

        try {
          {
            ;

            __msg = "getRandomPassword(50).length()";

            ;

            assertEquals(50,

            getRandomPassword(50).length()

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
    void test001_getRandomPassword1() {
        String __msg = "getRandomPassword(1000).contains(\"A\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "getRandomPassword(1000).contains(\"A\")";

            ;

            assertEquals(true,

            getRandomPassword(1000).contains("A")

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
    void test002_getRandomPassword2() {
        String __msg = "getRandomPassword(1000).contains(\"x\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "getRandomPassword(1000).contains(\"x\")";

            ;

            assertEquals(true,

            getRandomPassword(1000).contains("x")

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
    void test003_getRandomPassword3() {
        String __msg = "getRandomPassword(1000).contains(\"l\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "getRandomPassword(1000).contains(\"l\")";

            ;

            assertEquals(false,

            getRandomPassword(1000).contains("l")

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
    void test004_getRandomPassword4() {
        String __msg = "getRandomPassword(1000).contains(\"O\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "getRandomPassword(1000).contains(\"O\")";

            ;

            assertEquals(false,

            getRandomPassword(1000).contains("O")

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
