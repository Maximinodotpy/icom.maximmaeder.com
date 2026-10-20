---
title: PROG1 Lektion 1
date: 2026-09-14
published: true
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w01-programmieren/#_lernziele
Woche: "1"
---

Der Besuch der Montagslektion ist optional, die Themen dort könnte man sich auch im Selbstudium beibringen. Die Gruppenanlässe also am Dienstag bei mir sind obligatorisch.

- [https://prog1.pages.fhnw.ch/2026hs/docs/](https://prog1.pages.fhnw.ch/2026hs/docs/)
- [https://codingbat.com/prob/p138990](https://codingbat.com/prob/p138990)

die logischen operaten && und || können auch als & und | verwendet werden, der unterschied bei den doppelten Zeichen ist das

```java
int i = 0;
while(i < a.length && a[i] != x) {i++
}
```

## Binäre Suche

```java
int binSearch(int[] a, int val) {
    int l = -1, h = a.length;
    while (l + 1 != h) {
        int m = (l + h) / 2;
        if (a[m] < val)
            l = m;
        else
            h = m;
    }
    return h;
}
```

^binarysearchjavacode


## Lernziele

- [ ] **verstehen, wie wir Modul _Programmieren 1_ zusammenarbeiten wollen.**
- [ ] **verschiedene grundlegende Arten von Fragestellungen beim Programmieren unterscheiden können.**
- [ ] **erklären können, warum Programmieren vor allem auch heisst, einen Lösungsansatz nachvollziehbar darzustellen und warum dafür eine formale Sprache wichtig ist.**
- [ ] **die logischen bzw. Boolschen Operationen kennen und sinnvoll anwenden können.**
- [ ] **Bedingungen an den Programmzustand bzw. die Werte von Variablen mit Zeichnungen bzw. Skizzen visualisieren daraus exakte Programmschritte ableiten können.**
- [ ] **das Verfahren der sequenziellen Suche verstehen, es für verschiedene Muster von Fragestellungen angepasst anwenden und einem Muster folgend in Java formulieren können.**
- [ ] **das Verfahren der binären Suche verstehen, es auf spezifische Fragestellungen anwenden und mithilfe einer Skizze fehlerfrei in Java formulieren können.**


