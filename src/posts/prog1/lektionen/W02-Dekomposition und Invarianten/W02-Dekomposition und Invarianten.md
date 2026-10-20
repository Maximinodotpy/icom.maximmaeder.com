---
title: "Prog1 Lektion 3: Dekomposition und Invarianten"
date: 2026-09-21
published: true
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w02-dekomposition_und_invarianten/#_lernziele
Woche: "2"
---

- [Dekomposition und Invarianten](https://prog1.pages.fhnw.ch/2026hs/docs/w02-dekomposition_und_invarianten/)

## Schleifeninvarianten

Eine _Invariante_ ist eine Aussage über den Programm-Zustand (die Werte der Variablen), die _wahr ist, auch wenn sich der Zustand selbst möglicherweise verändert_.

Eine _Schleifen-Invariante_ ist eine invariante, die _vor und nach jeder Ausführung_ des Blocks innerhalb der Schleife gilt.

> [!example]+ Beispiel
> Im Summen-Beispiel wäre der Wert einer int-Variablen i die Anzahl bereits addierter Elemente. In einem Array, das ab 0 indiziert ist, entspricht das zugleich dem Index des als Nächstes zu addierenden Elements.
>
> Dieser Zusammenhang zwischen den Werten von i und einer Summen-Variablen sum, in der die Elemente aufaddiert werden, gilt für alle Zwischenzustände gleichermassen.
>
> Der Wahrheitsgehalt der Aussage "sum enthält die Summe der ersten i Elemente im Array" ändert sich nicht von Schritt zu Schritt. Die Aussage gilt invariant. Man bezeichnet eine solche Aussage daher als Invariante dieser Schleife.

## Stabilität von Sortieralgorithmen

Man nennt ein Sortierprogramm stabil, wenn die Reihenfolge von Elementen, die gemäss der Ordnungsrelation als gleich gelten, nicht verändert wird. Soll z.B. nacheinander nach verschiedenen Kriterien sortiert werden, ist Stabilität wichtig.

![[Pasted image 20261020085043.png]]

## Insertion-Sort

```java
void insertionSort(int a[]) {
	int n = a.length;
	for (int i = 1; i < n; ++i) {
		int k = a[i];
		int j = i - 1;

		// Move elements of arr[0..i-1], that are
		// greater than key, to one position ahead
		// of their current position
		while (j >= 0 && a[j] > k) {
			a[j + 1] = a[j];
			j = j - 1;
		}
	  
		a[j + 1] = k;
	}
}
```

## Selection-Sort

```java
void selectionSort(int a[]) {
	int n = a.length;

	// Move boundary of unsorted subarray
	for (int i = 0; i < n - 1; i++) {
		int min_idx = i;

		// Find the minimum element in unsorted array
		for (int j = i + 1; j < n; j++) {
			if (a[j] < a[min_idx])
				min_idx = j;
		}

		// Swap the found minimum element with the first element
		int temp = a[min_idx];
		a[min_idx] = a[i];
		a[i] = temp;
	}
}
```
## Lernziele

- [ ] ==🟢Dekomposition als grundlegende Technik zur Lösung von Programmieraufgaben anwenden.
- [ ] ==🟢die Blockstruktur eines Lösungsansatzes oder eines Programms überblicken und ggf. mit Struktogrammen visualisieren können.
- [ ] ==🟢Blockstrukturen verstehen und anwenden, um Teillösungen sinnvoll zu kombinieren.
- [ ] ==🔵wissen, was eine _Schleifen-Invariante_ ist.==
- [ ] ==🔵verstehen, wie Dir eine _Schleifen-Invariante_ sowohl beim Lesen als auch Schreiben von Programmen helfen kann, eine Aufgabe in einzelne, separat zu überlegende Teilaufgaben aufzuteilen.
- [ ] ==🔵die Algorithmen _Insertion-Sort_ und _Selection-Sort_ kennen, mit Invarianten beschreiben und erläutern sowie korrekt programmieren können.==
- [ ] ==🟢erläutern können, was es bedeutet, dass ein Sortierprogramm _stabil_ sortiert.
