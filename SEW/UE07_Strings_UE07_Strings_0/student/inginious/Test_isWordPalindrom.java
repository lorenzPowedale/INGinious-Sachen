
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



import static inginious.Template_isWordPalindrom.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_isWordPalindrom {

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
    void test000_isWordPalindrom0() {
        String __msg = "isWordPalindrom(\"Lagerregal\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"Lagerregal\")";

            ;

            assertEquals(true,

            isWordPalindrom("Lagerregal")

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
    void test001_isWordPalindrom1() {
        String __msg = "isWordPalindrom(\"hugo\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"hugo\")";

            ;

            assertEquals(false,

            isWordPalindrom("hugo")

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
    void test002_isWordPalindrom2() {
        String __msg = "isWordPalindrom(\"a\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"a\")";

            ;

            assertEquals(true,

            isWordPalindrom("a")

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
    void test003_isWordPalindrom3() {
        String __msg = "isWordPalindrom(\"aa\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"aa\")";

            ;

            assertEquals(true,

            isWordPalindrom("aa")

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
    void test004_isWordPalindrom4() {
        String __msg = "isWordPalindrom(\"aA\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"aA\")";

            ;

            assertEquals(true,

            isWordPalindrom("aA")

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
    void test005_isWordPalindrom5() {
        String __msg = "isWordPalindrom(\"ab\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"ab\")";

            ;

            assertEquals(false,

            isWordPalindrom("ab")

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
    void test006_isWordPalindrom6() {
        String __msg = "isWordPalindrom(\"aba\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"aba\")";

            ;

            assertEquals(true,

            isWordPalindrom("aba")

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
    void test007_isWordPalindrom7() {
        String __msg = "isWordPalindrom(\"abc\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isWordPalindrom(\"abc\")";

            ;

            assertEquals(false,

            isWordPalindrom("abc")

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
    void test008_isWordPalindrom8() {
        String __msg = "Ein leerer String ist kein Palindrom.";
        setStdIn("");

        try {
          {
            ;

            __msg = "Ein leerer String ist kein Palindrom.";

            ;

            assertEquals(false,

            isWordPalindrom("")

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
