package ch.fhnw.prog1.exercise.smarthome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Repräsentiert einen Raum im SmartHome. Ein Raum besteht aus
 * einem Namen und einer Sammlung von Lampen (Klasse {@link Lamp}).
 */
public class Room {
    private final String name;
    private final ArrayList<Lamp> lamps;

    public Room(String name, Lamp[] lamps) {
        this.name = name;
        this.lamps = new ArrayList<Lamp>(Arrays.asList(lamps));
    }

    public String getName() {
        return name;
    }

    public Lamp[] getLamps() {
        return lamps.toArray(Lamp[]::new);
    }

    @Override
    public String toString() {
        return name + " (" + lamps.size() + " lamps)";
    }
}
