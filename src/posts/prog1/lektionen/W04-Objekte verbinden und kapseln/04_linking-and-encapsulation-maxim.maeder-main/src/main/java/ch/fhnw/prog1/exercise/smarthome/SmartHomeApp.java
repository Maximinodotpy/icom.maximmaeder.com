package ch.fhnw.prog1.exercise.smarthome;

import ch.trick17.gui.Color;
import ch.trick17.gui.Gui;
import ch.trick17.gui.widget.Button;

import java.awt.*;

public class SmartHomeApp {

    private static final int IMG_WIDTH = 463;
    private static final int IMG_HEIGHT = 328;
    private static final double SCALE = determineScale();

    static void main() {
        Home home = createHome();

        Gui gui = Gui.create("SmartHome", (int) (IMG_WIDTH * SCALE), (int) ((IMG_HEIGHT + 28) * SCALE));
        gui.open();

        Button[] buttons = createButtons(home);
        gui.addComponents(buttons);

        while (gui.isOpen()) {
            drawHome(home, gui);
            gui.refreshAndClear(20);
        }
    }

    private static Home createHome() {
        Lamp[] kitchenLamps = {
                new Lamp("Ceiling Lamp", 2.5)};
        Room kitchen = new Room("Kitchen", kitchenLamps);
        Lamp[] livingRoomLamps = {
                new Lamp("Table Lamp", 7.0),
                new Lamp("Ceiling Lamp", 13.6),
                new Lamp("Niche Lamp", 5.2)};
        Room livingRoom = new Room("Living Room", livingRoomLamps);
        Lamp[] tvRoomLamps = {
                new Lamp("TV Lamp", 8.1),
                new Lamp("Ceiling Lamp", 12.7)};
        Room tvRoom = new Room("TV Room", tvRoomLamps);
        Lamp[] hallwayLamps = {
                new Lamp("Ceiling Lamp", 22.4),
                new Lamp("Sofa Lamp", 7.8),
                new Lamp("Entry Lamp", 6.6),
                new Lamp("Mirror Lamp 1", 3.5),
                new Lamp("Mirror Lamp 2", 3.8)};
        Room hallway = new Room("Hallway", hallwayLamps);
        Lamp[] bedroom1Lamps = {
                new Lamp("Ceiling Lamp", 10.1),
                new Lamp("Desk Lamp", 5.1)};
        Room bedroom1 = new Room("Bedroom 1", bedroom1Lamps);
        Lamp[] bedroom2Lamps = {
                new Lamp("Ceiling Lamp", 12.3)};
        Room bedroom2 = new Room("Bedroom 2", bedroom2Lamps);
        Lamp[] bedroom3Lamps = {
                new Lamp("Ceiling Lamp", 18.0),
                new Lamp("Bed Lamp 1", 2.2),
                new Lamp("Bed Lamp 2", 2.3)};
        Room bedroom3 = new Room("Bedroom 3", bedroom3Lamps);
        Room[] rooms = {
                kitchen, livingRoom, tvRoom, hallway,
                bedroom1, bedroom2, bedroom3};
        return new Home(rooms);
    }

    private static void drawHome(Home home, Gui gui) {
        gui.setAlpha(1);
        gui.setColor(9, 9, 9);
        gui.fillRect(0, 0, gui.getWidth(), gui.getHeight());
        gui.drawImage("smarthome/home.png", 0, 0, SCALE);
        for (Room room : home.getRooms()) {
            for (Lamp lamp : room.getLamps()) {
                if (lamp.isOn()) {
                    gui.setAlpha(lamp.getBrightness());
                    String combined = room.getName() + " " + lamp.getName();
                    String img = combined.replace(' ', '-').toLowerCase();
                    gui.drawImage("smarthome/" + img + ".png", 0, 0, SCALE);
                }
            }
        }
    }

    /*
     * The code below uses constructs not covered in prog1; kindly ignore.
     */

    private static double determineScale() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize.getHeight() > 2.5 * IMG_HEIGHT ? 2.0 : 1.0;
    }

    private static Button[] createButtons(Home home) {
        double margin = 10 * SCALE;
        double x = margin;
        double y = IMG_HEIGHT * SCALE;
        double w = 54 * SCALE;
        double h = 18 * SCALE;
        return new Button[]{
                new SmartHomeButton("Alles aus", x, y, w, h, home::turnAllOff),
                new SmartHomeButton("Zufällig", x += w + margin, y, w, h, home::randomize),
                new SmartHomeButton("+1 hell", x += w + margin, y, w, h, home::turnNextRoomBright),
                new SmartHomeButton("Sparen", x += w + margin, y, w, h, home::saveEnergy),
                new SmartHomeButton("Nacht", x + w + margin, y, w, h, home::nightMode)};
    }

    private static class SmartHomeButton extends Button {
        private final Runnable action;

        public SmartHomeButton(String text, double x, double y,
                               double width, double height,
                               Runnable action) {
            super(text, x, y, width, height);
            setBackgroundColor(new Color(195, 182, 101));
            setHoveredBackgroundColor(new Color(219, 215, 134));
            this.action = action;
        }

        @Override
        public void onLeftClick(double x, double y) {
            action.run();
        }
    }
}
