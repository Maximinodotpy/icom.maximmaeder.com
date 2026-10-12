package ch.fhnw.prog1.exercise.pong;
import java.util.Random;
import ch.trick17.gui.Gui;

public class Ball {
    public int x = 0;
    public int y = 0;
    public int vel_x = 0;
    public int vel_y = 0;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;

        Random random = new Random();

        this.vel_x = random.nextInt(10);
        this.vel_y = random.nextInt(2);
    }

    public void render(Gui gui) {
        gui.fillCircle(this.x, this.y, 10);
    }

    public void process(Gui gui) {
        this.x += this.vel_x;
        this.y += this.vel_y;
    }
}
