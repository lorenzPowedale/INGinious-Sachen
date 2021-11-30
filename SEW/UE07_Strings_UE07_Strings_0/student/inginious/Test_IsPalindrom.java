
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



import static inginious.Template_IsPalindrom.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_IsPalindrom {

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
    void test000_IsPalindrom0() {
        String __msg = "isPalindrom(\"Die Liebe ist Sieger; stets rege ist sie bei Leid.\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isPalindrom(\"Die Liebe ist Sieger; stets rege ist sie bei Leid.\")";

            ;

            assertEquals(true,

            isPalindrom("Die Liebe ist Sieger; stets rege ist sie bei Leid.")

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
    void test001_IsPalindrom1() {
        String __msg = "isPalindrom(\"Die Liebe ist Sieger\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isPalindrom(\"Die Liebe ist Sieger\")";

            ;

            assertEquals(false,

            isPalindrom("Die Liebe ist Sieger")

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
    void test002_IsPalindrom2() {
        String __msg = "isPalindrom(\" D . \")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isPalindrom(\" D . \")";

            ;

            assertEquals(true,

            isPalindrom(" D . ")

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
    void test003_IsPalindrom3() {
        String __msg = "isPalindrom(\" D . D :\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isPalindrom(\" D . D :\")";

            ;

            assertEquals(true,

            isPalindrom(" D . D :")

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
    void test004_IsPalindrom4() {
        String __msg = "isPalindrom(\" D . A :\")";
        setStdIn("");

        try {
          {
            ;

            __msg = "isPalindrom(\" D . A :\")";

            ;

            assertEquals(false,

            isPalindrom(" D . A :")

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
    void test005_IsPalindrom5() {
        String __msg = "Ein leerer String ist kein Palindrom.";
        setStdIn("");

        try {
          {
            ;

            __msg = "Ein leerer String ist kein Palindrom.";

            ;

            assertEquals(false,

            isPalindrom("")

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
