package ch.fhnw.prog1.exercise.smarthome;

/**
 * Die Hauptklasse im SmartHome-System. Enthält eine Sammlung
 * von Räumen (Klasse {@link Room}) und eine Reihe von Methoden,
 * welche die SmartHome-Funktionalität implementieren.
 */
public class Home {
    private final Room[] rooms;

    public Home(Room[] rooms) {
        this.rooms = rooms;

        for (int i = 0; i < this.rooms.length; i++) {
            IO.println(this.rooms[i].getName());
        }
    }

    public Room[] getRooms() {
        return rooms;
    }

    /**
     * Schaltet alle Lampen in allen Räumen aus.
     */
    public void turnAllOff() {
        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];
            Lamp[] lamps = room.getLamps();
            for (int j = 0; j < lamps.length; j++) {
                Lamp lamp = lamps[j];
                lamp.turnOff();
            }
        }
    }

    /**
     * Wählt einen zufälligen Raum im Haus und schaltet alle
     * Lampen in diesem Raum ein und die restlichen im Haus
     * aus. Die Helligkeit der eingeschalteten Lampen wird
     * auf einen zufälligen Wert zwischen 0.5 und 1.0 gesetzt.
     */
    public void randomize() {
        int room_i = this.getRandomNumber(0, this.rooms.length);
        double random_brightness = this.getRandomNumber(50, 100) / 100.0;

        IO.println("Random room: " + this.rooms[room_i].getName());

        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];
            Lamp[] lamps = room.getLamps();
            for (int j = 0; j < lamps.length; j++) {
                Lamp lamp = lamps[j];

                if (i == room_i) {
                    lamp.turnOn();
                    IO.println("Setting brightness to: " + random_brightness);
                    lamp.setBrightness(random_brightness);
                } else {
                    lamp.turnOff();
                }
            }
        }
    }

    /**
     * Findet den ersten Raum im Haus, in dem nicht alle Lampen
     * eingeschaltet und auf voller Helligkeit sind. In diesem
     * Raum werden alle Lampen eingeschaltet und auf volle
     * Helligkeit (1.0) gesetzt. Sind bereits in allen Räumen
     * alle Lampen eingeschaltet und auf voller Helligkeit,
     * passiert nichts.
     */
    public void turnNextRoomBright() {
        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];
            Lamp[] lamps = room.getLamps();

            boolean had_to_change = false;

            IO.println(room.getName());

            for (int j = 0; j < lamps.length; j++) {
                Lamp lamp = lamps[j];

                if (!lamp.isOn()) {
                    lamp.turnOn();
                    had_to_change = true;
                }

                if (lamp.getBrightness() != 1.0) {
                    lamp.setBrightness(1.0);
                    had_to_change = true;
                }
            }

            if (had_to_change) return;
        }
    }

    /**
     * Findet in jedem Raum die Lampe mit dem jeweils kleinsten
     * Stromverbrauch. Diese Lampen werden eingeschaltet und auf
     * eine Helligkeit von 0.8 gesetzt; alle anderen Lampen werden
     * ausgeschaltet.
     */
    public void saveEnergy() {
        this.turnAllOff();

        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];
            Lamp[] lamps = room.getLamps();

            Lamp lowest_power_consumption_lamp = lamps[0];
            for (int j = 1; j < lamps.length; j++) {
                Lamp lamp = lamps[j];

                if (lamp.getPowerConsumption() < lowest_power_consumption_lamp.getPowerConsumption()) {
                    lowest_power_consumption_lamp = lamp;
                }
            }

            lowest_power_consumption_lamp.turnOn();
            lowest_power_consumption_lamp.setBrightness(0.8);
        }
    }

    /**
     * Findet den Raum im Haus, der den Namen "Hallway" hat und
     * gibt ihn zurück. Es wird davon ausgegangen, dass immer
     * genau eine Hallway existiert.
     */
    public Room findHallway() {
        Room hallway = null;

        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];

            if (room.getName() == "Hallway") {
                hallway = room;
            }
        }

        return hallway;
    }

    /**
     * Findet alle Räume im Haus, welche irgendwo im Namen den
     * String "Bedroom" enthalten, und gibt diese in einem Array
     * zurück. Das Array darf auch grösser als nötig sein und
     * null-Einträge enthalten. Es darf aber maximal so gross
     * sein wie die Gesamtanzahl der Räume im Haus.
     */
    public Room[] findBedrooms() {
        Room[] bedrooms = new Room[this.rooms.length];

        for (int i = 0; i < this.rooms.length; i++) {
            Room room = this.rooms[i];
            if (room.getName().indexOf("Bedroom") != -1) {
                bedrooms[i] = room;
            }
        }

        // TODO
        return bedrooms;
    }

    /**
     * Schaltet den "Nachtmodus" ein, welcher in allen Bedrooms
     * und in der Hallway je eine (beliebige) Lampe einschaltet
     * und die Helligkeit auf 0.3 setzt. Alle anderen Lampen
     * werden ausgeschaltet.
     * <p>
     * Verwendet die Methoden findHallway und findBedrooms.
     */
    public void nightMode() {
        this.turnAllOff();

        Room hallway = findHallway();
        Room[] bedrooms = findBedrooms();

        hallway.getLamps()[0].turnOn();
        hallway.getLamps()[0].setBrightness(0.3);

        for (int i = 0; i < bedrooms.length; i++) {
            Room bedroom = bedrooms[i];
            if (bedroom == null) continue;

            bedroom.getLamps()[0].turnOn();
            bedroom.getLamps()[0].setBrightness(0.3);
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
