---
aliases:
Woche: "9"
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w09-rekursion-backtracking/#_lernziele
---
Du erkennst Ähnlichkeiten und korrespondierende Elemente in den Versionen mit Schleife bzw. mit Rekursion. (Die Code-Beispiele in Klammern sind dem vorangegangenen `binarySearch`-Beispiel entnommen.)

1. Es braucht ein **Ende-Kriterium**, ob ein weiterer Schleifendurchlauf bzw. ein weiterer Rekursionsschritt nötig ist. Das ist das Schleifenkriterium (z. B. `while (left + 1 < right)`) bzw. der Basisfall (z. B. `if (left + 1 >= right)`). Die Lösung für den Basisfall lässt sich direkt programmieren (`return right;`) ohne weitere Rekursion. Ohne Basisfall würde eine Rekursion genauso unendlich lange laufen, wie eine Schleife ohne Ende-Kriterium.

2. Die Berechnung muss **Fortschritte** machen. Jeder Schleifendurchlauf muss die noch zu lösende Aufgabe verkleinern, im Allgemeinen durch Zuweisung neuer Werte an Variablen (z. B. `left = m;`), was den Zustand im Speicher näher an das Ziel des Programms heranbringt. Genauso muss jeder rekursive Aufruf eine kleinere noch zu lösende Aufgabe beschreiben (z. B. `binarySearchRec(a, x, m, right);`).

3. Die Lösung der verkleinerten Aufgabe(n) muss ausgelöst werden. Bei Schleifen passiert das bereits automatisch durch die **Wiederholungsanweisung** selbst. In einem rekursiven Programm musst Du den oder die rekursiven Aufrufe explizit aufschreiben.

4. Die Variablen müssen zu Beginn mit den richtigen **Startwerten** initialisiert werden. Bei einer Schleife kannst Du das einfach im Programmtext _davor_ hinschreiben (z. B. `int left = -1, right = a.length;`), denn dieser Programmteil ist klar ausserhalb des wiederholt ausgeführten Blocks.

   Wenn Du nicht möchtest, dass Benutzer Deiner Programme die Startwerte für diese Parameter korrekt setzen müssen, programmierst Du eine "Fassaden-Methode" oder "Wrapper-Methode", die mit weniger Parametern aufgerufen werden kann und dann die rekursive Methode mit den richtigen Startwerten aktiviert:

   `public int binarySearch(double[] a, double x) {     return binarySearchRec(a, x, -1, a.length); }`

   Das ist ein häufig anzutreffendes Muster bei rekursiven Programmen.

## Unterschied von `i++`, `++i` und `i + 1`
![[W09-Rekursion 2026-11-09 10.00.38.excalidraw||100%]]
## Basisfall

## Stackoverflow

## Fassadenmethode

## Backtracking

## Pruning

## Branch and Bound

## Lernziele

- …​ verstehen, dass Methoden "sich selbst aufrufen" können und was dabei mit lokalen Variablen passiert.
- …​ wissen, dass eine Rekursion nicht nur bei fehlendem Basisfall mit einem _Stack Overflow_ abbricht, sondern auch bei sehr grosser Rekursionstiefe, und für konkrete Programme einschätzen können, ob das realistischerweise droht.
- …​ das Zusammenspiel der wesentlichen Aspekte eines rekursiven Programms (Basisfall mit Ende-Kriterium, Fortschritt durch Verkleinerung der zu lösenden Aufgabe, Startwerte mit Fassadenmethode) verstehen und darauf achten, dass jeweils alle davon programmiert sind.
- …​ wichtige Anwendungsgebiete rekursiver Programmierung kennen, wie _Divide and Conquer_, _Backtracking-Algorithmen_ sowie _Branch-and-Bound_ und diese Lösungsstrategien in bestehenden Programmen erkennen sowie selbst situationsgerecht einsetzen.
- …​ das _Rucksack-Problem_ und den Lösungsansatz mit _Pruning_ erläutern können.