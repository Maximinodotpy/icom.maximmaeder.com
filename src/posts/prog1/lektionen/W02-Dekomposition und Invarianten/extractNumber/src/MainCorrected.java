//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCorrected {
    public static void main(String[] args) {
        System.out.println(extractNumber("Ich bin cool"));
        System.out.println(extractNumber("Ich bin cool 750"));
        System.out.println(extractNumber("Ich 61 bin cool"));
        System.out.println(extractNumber("57 Ich bin cool"));
        System.out.println(extractNumber("99 Ich 67 bin cool"));
    }

    public static int extractNumber(String s) {
        int i = 0;

        while(i < s.length() && !isDigit(s.charAt(i))) {
            i++;
        }

        int res = 0;

        while (i < s.length() && isDigit(s.charAt(i))) {
            res = res * 10 + s.charAt(i) - '0';
            i++;
        }

        return res;
    }

    static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}