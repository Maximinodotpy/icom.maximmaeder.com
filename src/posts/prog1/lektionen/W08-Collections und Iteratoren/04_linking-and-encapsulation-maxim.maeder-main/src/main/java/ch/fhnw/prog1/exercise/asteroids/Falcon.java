package ch.fhnw.prog1.exercise.asteroids;

import ch.trick17.gui.Gui;

public class Falcon {
    private double x;
    private double y;
    private double vx = 0;
    private double vy = 0;

    public Falcon(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void accelerate(double ax, double ay) {
        vx += ax;
        vy += ay;
    }

    public void move() {
        x += vx;
        y += vy;
    }

    public void draw(Gui gui) {
        gui.drawImageCentered("asteroids/falcon.png", x, y, 0.5);
    }
}
