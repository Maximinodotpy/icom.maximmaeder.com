package ch.fhnw.prog1.exercise.asteroids;

import ch.trick17.gui.Gui;

public class AsteroidsGame {

    private static final int WIDTH = 512;
    private static final int HEIGHT = 768;

    private final Gui gui;
    private final Falcon falcon;

    public AsteroidsGame() {
        gui = Gui.create("Asteroids", WIDTH, HEIGHT);
        falcon = new Falcon(WIDTH * 0.5, HEIGHT * 0.75);
    }

    void main() {
        gui.open();

        while (gui.isOpen()) {
            if (gui.isKeyPressed("Left")) {
                falcon.accelerate(-0.5, 0);
            }
            if (gui.isKeyPressed("Right")) {
                falcon.accelerate(0.5, 0);
            }
            if (gui.isKeyPressed("Up")) {
                falcon.accelerate(0, -0.5);
            }
            if (gui.isKeyPressed("Down")) {
                falcon.accelerate(0, 0.5);
            }

            falcon.move();

            draw();
            gui.refreshAndClear(20);
        }

        gui.waitUntilClosed();
    }

    private void draw() {
        gui.drawImage("asteroids/space.png", 0, 0, 0.5);
        falcon.draw(gui);
    }
}
