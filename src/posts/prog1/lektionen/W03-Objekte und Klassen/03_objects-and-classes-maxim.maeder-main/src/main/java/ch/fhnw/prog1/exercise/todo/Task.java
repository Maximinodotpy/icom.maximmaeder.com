package ch.fhnw.prog1.exercise.todo;

public class Task {
    int id;
    public String description;
    public boolean done;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public void markDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        return (this.done ? "✅ ":"❌ ") + "[" + this.id + "] " + this.description;
    }
}
