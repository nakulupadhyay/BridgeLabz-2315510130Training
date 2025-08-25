package Bridge_Labz;
import java.util.Scanner;

public class UpperCaseConversion {
    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String customUpper = customToUpperCase(input);
        String builtInUpper = input.toUpperCase();
        boolean isEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("\nOriginal Text: " + input);
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results same? " + isEqual);

        sc.close();
    }
}

