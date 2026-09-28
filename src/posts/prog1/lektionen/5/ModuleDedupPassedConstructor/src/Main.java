
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
        insy.grade1 = 3.5;
        insy.grade2 = 3.9;

        Module mgli = new Module();
        mgli.name = "mgli";
        mgli.credits = 3;
        mgli.grade1 = 5.1;
        mgli.grade2 = 4.7;

        System.out.println(prog1.name + " passed: " + prog1.passed());
        System.out.println(insy.name + " passed:  " + insy.passed());
        System.out.println(mgli.name + " passed:  " + mgli.passed());
    }
}