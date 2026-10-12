package ch.fhnw.prog1.exercise.energymeter;

public class EnergyMeter {
    public double capacity;
    public double level;

    public EnergyMeter(double capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity less than 0");
        }

        // Schauen ob der werte kleiner als 0 ist
        this.capacity = Double.max(0, capacity);
    }

    public void fill(double energy) {
        if (energy < 0) {
            throw new IllegalArgumentException("Capacity less than 0");
        }

        this.level += energy;

        this.level = Double.min(this.capacity, this.level);
    }

    public void consume(double intensity, double duration) {
        if (intensity < 0 || duration < 0) {
            throw new IllegalArgumentException("intensity or duration is less than zero ...");
        }

        double total = intensity * duration;

        this.level = Double.max(0, this.level - total);
    }

    public double percentFull() {
        return capacity == 0 ?  100.0 : level / capacity * 100;
    }
}
