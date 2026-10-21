---
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w06-listen-sets-maps/#_lernziele
Woche: "6"
---



```java
class Room {private Lamp[] lamps;
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

## ArrayList

```java
import java.util.ArrayList;
```

Die folgende Tabelle zeigt, die wesentlichen Entsprechungen zwischen einem Array `arr` und einer `ArrayList` `lst`.

|           | Array         | ArrayList                |
| --------- | ------------- | ------------------------ |
| Typ       | `Lamp[]`      | `ArrayList<Lamp>`        |
| erzeugen  | `new Lamp[n]` | `new ArrayList<Lamp>(n)` |
| lesen     | `l = arr[i]`  | `l = lst.get(i)`         |
| schreiben | `arr[i] = l`  | `lst.set(i, l)`          |
| Grösse    | `arr.length`  | `lst.size()`             |
* Erlaubt Duplikate, behält Reihenfolge bei.
* `remove("element")` entfernt das *erste* Vorkommen und gibt `boolean` zurück.
* System.out.println zeigt: `[one, two]`.
## HashSet

```java
private final HashSet<String> validTickets = new HashSet<>();
```

* Keine Duplikate! `add()` auf existierendes Element wird ignoriert.
* Keine garantierte Reihenfolge.
* `.remove("nicht vorhanden")` gibt `false` zurück.
## HashMap

```java
HashMap<String, Lamp> lampDirectory = new HashMap<>();

// fill the map with many method calls like this:
lampDirectory.put("Hallway/Ceiling-Lamp", hallway.lamp[0]);

// to find a certain `Lamp` by name use
Lamp l = lampDirectory.get("Hallway/Ceiling-Lamp");
```

* Schlüssel-Wert-Paare (Keys sind eindeutig).
* `map.put(key, val)`: Bei doppeltem Key wird der alte Wert **überschrieben**.
* `.keySet()` = Set aller Keys, `.values()` = Collection aller Werte.
* **Achtung `Map.of(...)**`: Erzeugt eine **unveränderliche (immutable)** Map.
* `map.get(key)` liefert `null`, wenn der Key nicht existiert (wirft **keine** Exception!).
## Lernziele

- [ ] ==🟢die Unterschiede und Gemeinsamkeiten der Datenstrukturen _Array_ und _ArrayList_ verstehen und erklären können.
- [ ] ==🟢die Notwendigkeit und die Funktionsweise der Wrapper-Klassen für elementare Datentypen in Java verstehen und erklären können.
- [ ] die spezifischen Eigenschaften der Datenstrukturen für _Listen_ und für _Mengen_ kennen, insbesondere die jeweils für diese Datenstrukturen definierten Operationen.
- [ ] die asymptotische Komplexität der Laufzeit der Operationen auf _ArrayList_ kennen und begründen können und die der Operationen auf _HashSet_ kennen.
- [ ] die spezifischen Eigenschaften, Operationen und deren asymptotischer Laufzeitkomplexität der Datenstruktur _HashMap_ kennen.
- [ ] im Kontext konkreter Aufgaben zwischen _Array_, _ArrayList_, _HashSet_ und _HashMap_ begründet auswählen und die entsprechenden Datenstrukturen situationsgerecht einsetzen sowie in vorhandenen Programmen den Einsatz dieser Datenstrukturen kritisch beurteilen.