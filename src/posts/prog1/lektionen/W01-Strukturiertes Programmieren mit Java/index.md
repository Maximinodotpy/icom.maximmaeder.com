---
title: PROG1 Lektion 1
date: '2026-09-14'
published: true
---

Der Besuch der Montagslektion ist optional, die Themen dort könnte man sich auch im Selbstudium beibringen. Die Gruppenanlässe also am Dienstag bei mir sind obligatorisch.

- [https://prog1.pages.fhnw.ch/2026hs/docs/](https://prog1.pages.fhnw.ch/2026hs/docs/)
- [https://codingbat.com/prob/p138990](https://codingbat.com/prob/p138990)

die logischen operaten && und || können auch als & und | verwendet werden, der unterschied bei den doppelten Zeichen ist das

```java
int i = 0;
while(i < a.length && a[i] != x) {
    i++
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