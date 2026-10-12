package ch.fhnw.prog1.exercise.pong;
import ch.trick17.gui.Gui;

public class Player {
    public int points = 0;
    public int x = 0;
    public int y = 0;
    public int length = 150;

    String upString = "up";
    String downString = "down";

    public Player(int x, int y, String upString, String downString, int length) {
        this.x = x;
        this.y = y;

        this.upString = upString;
        this.downString = downString;

        this.length = length;
    }

    public void render(Gui gui) {
        gui.fillRect(this.x, this.y, 10, this.length);
    }

    public void process(Gui gui) {
        if (gui.isKeyPressed(upString)) {
            y -= 6;
        } else if (gui.isKeyPressed(downString)) {
            y += 6;
        }
    }
}
