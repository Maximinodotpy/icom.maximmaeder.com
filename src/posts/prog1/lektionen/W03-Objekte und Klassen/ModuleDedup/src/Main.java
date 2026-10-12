
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

        prog1.print();
        insy.print();
        mgli.print();
    }
}