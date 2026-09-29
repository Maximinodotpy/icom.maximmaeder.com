package ch.fhnw.prog1.exercise.stepstats;

public class StepStatistics {
    public int successDays;
    public double averageSteps;
    public int minSteps;
    public int maxSteps;

    public StepStatistics(int[] steps, int goal) {
        successDays = 0;
        int totalSteps = 0;
        minSteps = Integer.MAX_VALUE;
        maxSteps = Integer.MIN_VALUE;

        for (int step : steps) {
            if (step >= goal) {
                successDays++;
            }
            totalSteps += step;
            minSteps = Math.min(minSteps, step);
            maxSteps = Math.max(maxSteps, step);
        }

        averageSteps = (double) totalSteps / steps.length;
    }
}
