package Aufgabe1;
public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
        System.out.println(closeFar(4, 1, 3));

        // Das müsste alles false geben
        System.out.println(closeFar(1, 1, 1));
        System.out.println(closeFar(1, 1, 2));
        System.out.println(closeFar(1, 1, 0));

        // 
        System.out.println(closeFar(1, 2, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        int ab_diff = Math.abs(a - b);
        int ac_diff = Math.abs(a - c);

        if (ab_diff == 1 && ac_diff == 1) {
            return false;
        }

        if (ab_diff <= 1 && ac_diff > 1) {
            return true;
        }
        if (ac_diff <= 1 && ab_diff > 1) {
            return true;
        }
        return false;
    }
}