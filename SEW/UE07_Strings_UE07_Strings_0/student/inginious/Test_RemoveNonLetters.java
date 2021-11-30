
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



import static inginious.Template_RemoveNonLetters.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_RemoveNonLetters {

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
    void test000_RemoveNonLetters0() {
        String __msg = "removeNonLetters(\"ABCabc\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"ABCabc\")";

            ;

            assertEquals("ABCabc",

            removeNonLetters("ABCabc")

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
    void test001_RemoveNonLetters1() {
        String __msg = "removeNonLetters(\"123\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"123\")";

            ;

            assertEquals("",

            removeNonLetters("123")

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
    void test002_RemoveNonLetters2() {
        String __msg = "removeNonLetters(\"+ ,.\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"+ ,.\")";

            ;

            assertEquals("",

            removeNonLetters("+ ,.")

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
    void test003_RemoveNonLetters3() {
        String __msg = "removeNonLetters(\"Hallo Welt!\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"Hallo Welt!\")";

            ;

            assertEquals("HalloWelt",

            removeNonLetters("Hallo Welt!")

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
    void test004_RemoveNonLetters4() {
        String __msg = "removeNonLetters(\"12345\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"12345\")";

            ;

            assertEquals("",

            removeNonLetters("12345")

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
    void test005_RemoveNonLetters5() {
        String __msg = "removeNonLetters(\"\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "removeNonLetters(\"\")";

            ;

            assertEquals("",

            removeNonLetters("")

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
