---
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w06-listen-sets-maps/#_lernziele
Woche: "6"
---
![[Listen, Sets und Maps 2026-10-19 09.51.50.excalidraw]]

```java
class Room {
    private Lamp[] lamps;
    public Room(String name, Lamp[] lamps) {
        this.lamps = new Lamp[lamps.length];
        for (int i = 0; i < lamps.length; i++) {
            this.lamps[i] = lamps[i];
        }
    }
    public Lamp[] getLamps() { ... }
    public void installLamp (Lamp l) { ... }
    public void removeLamp (int index) { ... }
}
```
