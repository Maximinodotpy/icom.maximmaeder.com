---
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w04-objekte-verbinden-kapseln/#_lernziele
Woche: "4"
---

## Aliasing

Objekte werden in Java nicht kopiert, wenn sie einer Variable zugewiesen oder als Argument einer Methode oder einem Konstruktor übergeben werden – nur die _Referenz_ wird kopiert.

Je nach dem kann dies gewollt sein, es kann aber auch zu ungewollten Effekten führen.

Dem entgegenwirken kann man entweder mit **Defensive Copying** oder **Immutability**.

## Immutability
* **Unveränderliche Objekte (Immutable Classes)**:
* Deklariere Attribute als `private final`.
* **Keine Mutatoren/Setter** anbieten!
* **Verändernde Methoden (wie `plus`, `add`)**: Verändern **nie** `this`, sondern geben immer ein **neues Objekt** zurück:
`return new Amount(this.galleons + other.galleons, ...);`

## Preconditions & Exceptions
* Vorbedingungen prüfen und bei Verletzung explizit werfen:
`if (bedinguingVerletzt) throw new IllegalArgumentException("Text");`

## Javadoc-Kommentare

```java
/**
 * An energy meter with a certain capacity and current level. The
 * capacity is non-negative and constant. The level is always
 * between 0 and the capacity, inclusive.
 */
public class EnergyMeter {
    // ...
}
```

## Lernziele

- [ ] ==🟢ein Programm, dass mehrere verknüpfte Objekte verschiedener Klassen erzeugt, lesen und die entstandenen Objekte samt ihren Verknüpfungen in einem Objektdiagramm zeichnen können.
- [ ] ==🟢das Verhalten eines Programms, das auf verknüpften Objekten arbeitet, mithilfe eines Objektdiagramms nachvollziehen und die erzeugten Resultate angeben können.
- [ ] ==🟢ein Programm in Java notieren können, das in einem Objektdiagramm dargestellte Objekte und deren Verknüpfung im Speicher erzeugt.
- [ ] ==🟢selbst zu einfachen konkreten Aufgaben objektorientierte Entwürfe machen und Entwürfe anderer analysieren können.
- [ ] ==🟢verstehen, was der Begriff _Komposition_ speziell im Zusammenhang mit verknüpften Objekten meint und Komposition situationsgerecht in eigenen Entwürfen einsetzen.
- [ ] ==🔵verstehen, was der Begriff _Aliasing_ meint und zu welchen Problemen Aliasing führen kann, sowie Programme auf negative Effekte von Aliasing überprüfen und _Defensive Copying_ oder _Immutability_ als Strategien zur Vermeidung situationsgerecht anwenden.
- [ ] ==🔵_Klasseninvarianten_, _Pre-_ und _Postconditions_ nutzen, um über das Verhalten von Objekten und mögliche Fehlerquellen zu argumentieren, sowie Fehlerquellen zu reduzieren.
- [ ] ==🟢Datenkapselung als Mittel nutzen, um Klasseninvarianten durchzusetzen bzw. zu schützen und dabei die in Java wichtigen Sichtbarkeitsmodifikatoren `private` und `public` verwenden.
- [ ] ==🟢wo vorteilhaft Objekte als unveränderlich entwerfen und programmieren.
- [ ] ==🔵Grundzüge der Dokumentation mit _Javadoc_ kennen, die Dokumentation von Bibliotheken nutzen und wo sinnvoll Deine eigenen Programme dokumentieren.