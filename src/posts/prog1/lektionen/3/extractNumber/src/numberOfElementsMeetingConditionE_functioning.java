public class numberOfElementsMeetingConditionE_functioning {
    public static void main(String[] args) {
        boolean[] test1 = {true, true, false};
        System.out.println(numberOfElementsMeetingConditionE(test1));
    }

    public static int numberOfElementsMeetingConditionE (boolean[] arr) {
        // j muss am anfang bereits ausserhalb sein
        int i = 0; int j = arr.length;

        while (i < j) {
            int m = (i + j) / 2;
            if (arr[m]) i = m + 1; else j = m;
        }

        return i;
    }
}
