---
Woche: "8"
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w08-collections-iteratoren/#_lernziele
---
## `List` zu einer `ArrayList`

```java
ArrayList<ObjectType> arrList = new ArrayList<ObjectType>(Arrays.asList(list));
```
## `ArrayList` zu einer `List`

```java
tasks.toArray(new Task[0]);
```

oder

```java
tasks.toArray(Task[]::new)
```


## Basisaufgaben

```java
int sumOfAll (HashSet<Integer> set) {
    int sum = 0;
    while (set.iterator().hasNext()) {
        sum = sum + set.iterator().next();
    }
    return sum;
}
```

==🔴`set.iterator()` startet jedes mal einenen neuen Iterator so kommt die while schlaufe nicht voran bzw. sie läuft ewig==

```java
int sumOfPositive (HashSet<Integer> set) {
    int sum = 0;
    var it = set.iterator();
    while (it.hasNext()) {
        if (it.next() > 0) {
            sum = sum + it.next();
        }
    }
    return sum;
}
```

==🔴hier wird der iterator immerhin gespeichert aber es wir immer ein wert zur summe dazu getan welcher gar nicht geprüft ist, weil next() geht einen index weiter und gibt gleichzeit den Wert dort mit, daher sollte man next pro schleifen durchgang nur einmal verwenden und den return daraus zwischenspeichern==



## Lernziele

- …​ die `toArray`-Methode von Sammlungs-Klassen kennen und situationsgerecht benutzen.
- …​ das Konzept von _Iteratoren_ und dessen Umsetzung in Java verstehen und nutzen, sowie Programme analysieren können, die das tun.
- …​ die _for-each_-Form der `for`-Anweisung in Java situationsgerecht einsetzen.
- …​ verstehen, wie _for-each_-Anweisungen basierend auf _Iteratoren_ arbeiten und so Fallstricke vermeiden.
- …​ die Datenstruktur `LinkedList` zusammen mit der asymptotischen Laufzeitkomplexität ihrer wichtigsten Operationen kennen.
- …​ zwischen verschiedenen _Listen_- und _Mengen_-Datentypen mit geeigneten Kriterien begründet auswählen bzw. eine von anderen getroffene Wahl kritisch hinterfragen.