package ch.fhnw.prog1.exercise.bosses;

public class Employee {

    private final String name;
    private Employee boss;

    public Employee(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public boolean isSuperiorOf(Employee other) {
        // TODO
        return false;
    }

    public Employee findCommonSuperiorWith(Employee other) {
        // TODO
        return null;
    }

    public String toString() {
        String bossPart = boss == null
                ? "no boss"
                : "boss: " + boss.name;
        return "Person(" + name + ", " + bossPart + ")";
    }
}
