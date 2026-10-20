---
Woche: "3"
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w02-dekomposition_und_invarianten/#_lernziele
---
## Beispiel einer Klasse mit Konstruktor, einem Attribut und einer Methode

```java
class MyClass {
    int x;

    // Constructor
    MyClass(int value) {
        x = value;
    }
    
    public int getX() {
	    return x;
    }
}
```

## Klasse mit overloaded Methoden

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```
## Lernziele

- [ ] ==🟢verstehen und erläutern können, was _Objekte_ auszeichnet in der echten Welt wie in Software.
- [ ] ==🟢Eigenschaften und Operationen von konkreten Objekten sowie die Beziehungen untereinander mit einfachen Diagrammen darstellen und kommunizieren.
- [ ] ==🟢einfache Anwendungsfälle wo sinnvoll mit Objekten modellieren.
- [ ] ==🟢zwischen _Objekten_ und _Klassen_ klar unterscheiden.
- [ ] ==🔵_Klassen_ samt _Attributen_, _Methoden_ und _Konstruktoren_ in der Programmiersprache Java lesen und selbst programmieren können.
- [ ] ==🔵_Overloading_ in der Programmiersprache Java verstehen und anwenden können.
- [ ] ==🟢den Unterschied verstehen zwischen Methoden und Attributen, die zu Objekten gehören und solchen, die zu Klassen gehören. (static)
- [ ] ==🟢Objekte sinnvoll einsetzen, um in Programmen inhaltlich zusammengehörige Daten zu gruppieren.
