
//CHECKSTYLE:OFF
package inginious;



public class Template_IsPalindrom {
    public static String reverse(String s) {return new StringBuilder(s).reverse().toString();}
    public static String removeNonLetters(String s) { return s.replaceAll("\\P{L}", ""); }
    public static boolean isWordPalindrom(String word) {return ! word.isEmpty() && reverse(word).equalsIgnoreCase(word); }

    //CHECKSTYLE:ON

@    @IsPalindrom@@
}
