//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(extractNumber("Ich bin cool"));
        System.out.println(extractNumber("Ich bin cool 750"));
        System.out.println(extractNumber("Ich 61 bin cool"));
        System.out.println(extractNumber("57 Ich bin cool"));
        System.out.println(extractNumber("99 Ich 67 bin cool"));
    }

    public static String extractNumber(String s) {
        String number = "";
        int i = 0;

        while (i < s.length()-1 && !isDigit(s.charAt(i))) {
            i++;
        }

        if (isDigit(s.charAt(i))) {
            number += s.charAt(i);
            i++;
        }

        while (i < s.length() && isDigit(s.charAt(i))) {
            number += s.charAt(i);
            i++;
        }

        return number.length() != 0 ? number: "0";
    }

    static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}