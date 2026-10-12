
public class Main {
    public static void main(String[] args) {
        Module prog1 = new Module();
        prog1.name = "prog1";
        prog1.credits = 6;
        prog1.grade1 = 4.2;
        prog1.grade2 = 5.5;

        Module insy = new Module();
        insy.name = "insy";
        insy.credits = 6;
        insy.grade1 = 5.1;
        insy.grade2 = 4.7;

        Module mgli = new Module();
        mgli.name = "mgli";
        mgli.credits = 3;
        mgli.grade1 = 4.5;
        mgli.grade2 = 5.0;

        System.out.println(prog1.name + " (" + prog1.credits + "): " + prog1.grade1 + ", " + prog1.grade2);
        System.out.println(insy.name + " (" + insy.credits + "): " + insy.grade1 + ", " + insy.grade2);
        System.out.println(mgli.name + " (" + mgli.credits + "): " + mgli.grade1 + ", " + mgli.grade2);
    }
}