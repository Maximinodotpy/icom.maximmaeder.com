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
static int binarySearch(int a[], int x){
	int l = 0;
	int r = a.length - 1;
	
	while (l <= r){
		int m = (l + r) / 2;
		if (a[m] == x) {
			return m;
		}
		else if (a[m] > x) {
			r = m - 1;
		}
		else {
			l = m + 1;
		}
	}
	return -1;
}
```

^binarysearchjavacode