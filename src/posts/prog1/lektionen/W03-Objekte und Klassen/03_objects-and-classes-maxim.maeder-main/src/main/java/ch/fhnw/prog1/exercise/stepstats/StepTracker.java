import ch.fhnw.prog1.exercise.stepstats.StepStatistics;

void main() {
    IO.println("----------------------------");
    IO.println("Welcome to the Step Tracker!");
    IO.println("----------------------------");

    Scanner scanner = new Scanner(System.in);
    IO.print("Your daily step goal? ");
    int goal = scanner.nextInt();
    IO.print("The number of days?   ");
    int[] steps = new int[scanner.nextInt()];

    for (int i = 0; i < steps.length; i++) {
        IO.print("Steps for day " + (i + 1) + "? ");
        steps[i] = scanner.nextInt();
    }
    IO.println();

    StepStatistics stats = new StepStatistics(steps, goal);
    IO.println("You made the goal " + (int) stats.successDays + " times.");
    IO.println("The average number of steps taken was " + stats.averageSteps + ".");
    IO.println("The least number of steps taken was " + (int) stats.minSteps + ".");
    IO.println("The most number of steps taken was " + (int) stats.maxSteps + ".");
}
