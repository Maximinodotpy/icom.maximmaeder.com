public class Module {
    String name;
    int credits;
    double grade1;
    double grade2;

    public void print() {
        System.out.println(name + " (" + credits + "): " + grade1 + ", " + grade2);
    }
}