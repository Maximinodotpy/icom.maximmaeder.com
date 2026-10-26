---
title: Formelblatt Konvergenz Mathematik
date: 2026-09-15
published: true
moodle_section:
---
## Zahlen
Die verschiedenen grundlegenden Zahlenmengen, jede nächste beinhaltet alle vorherigen.

| Name              | Symbol       | Beispiel                                                                 | Beschreibung                                                   |
| ----------------- | ------------ | ------------------------------------------------------------------------ | -------------------------------------------------------------- |
| Natürliche Zahlen | $\mathbb{N}$ | (0), 1, 2, 3, ..., 99                                                    | Alle positiven, ganzen Zahlen (Je nachdem mit der 0 oder ohne) |
| Ganze Zahlen      | $\mathbb{Z}$ | ..., -2, -1, 0, 1, 3, ...                                                | Alle ganzen Zahlen (einschliesslich Negativen Zahlen)          |
| Rationale Zahlen  | $\mathbb{Q}$ | ..., -2, $-\frac{2}{1}$, 0, 1, $\frac{13}{6}$, 5, ...                    | Alle Dezimalzahlen/Brüche                                      |
| Reele Zahlen      | $\mathbb{R}$ | ..., -2, $-\frac{2}{1}$, 0, 1, $\sqrt{2}$, $\frac{13}{6}$, $\pi$, 5, ... | Hier kommen auch noch Zahlen hinzu welche kein Ende haben.     |
| Primzahlen        | $\mathbb{P}$ | 1, 2, 3, 5, 7 ...                                                        | Alle Primzahlen                                                |
| Lösungsmenge      | $\mathbb{L}$ |                                                                          | Die Tatsächlich validen Lösungen einer Gleichung               |
| Definitionmenge   | $\mathbb{D}$ |                                                                          | Die Möglichen Lösungen einer Gleichung                         |
siehe: [[4-mengen|Mengen]]
## Grundlegende Gesetze der Algebra

### Kommutativ-, Distributiv- und Assoziativgesetz

| Name                                                                          | Beispiele                                                                                                                                                                                                                                                                               | Erklärung                                                                                                                                                                                                                           |
| ----------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Kommutativgesetz der Addition/Multiplikation**^Kommutativgesetz             | *Algebra*<br>$a+b=b+a$<br>$a*b=b*a$<br><br>*Mengen*<br>$A \cup B = B \cup A$ (Vereinigung)<br>$A \cap B = B \cap A$ (Schnitt)<br><br>*Aussagen*<br>$A \wedge B = B \wedge A$ (Und)<br>$A \vee B = B \vee A$ (Oder)<br>$A \Leftrightarrow B = B \Leftrightarrow A$ (Logische Äquivalenz) | Bei der Addition, Multiplikation, [[4-mengen\|Vereinigung]], [[4-mengen\|Schnitt]], [[1-aussagen\|Und und Oder]] spielt die Reihenfolge keine Rolle.                                                                                |
| **Distributivgesetz**<br>Siehe [[Binomische Formeln#Binomische Formeln]].<br>^Distributivgesetz | $a * (b + c) = a*b + a*c$                                                                                                                                                                                                                                                               | Eine Summe (oder Differenz) wird mit einem Faktor, indem man jeden einzelnen Summanden (Minuend) mit diesem Faktor Multipliziert und die Produktwerte addiert. (nennt sich Ausklammern, Herausheben oder Faktorisieren).            |
| **Assoziativgesetz**<br>^Assoziativgesetz                                     | $a * (b * c) = a * b * c$<br>$a + (b + c) = a + b + c$                                                                                                                                                                                                                                  | Wenn es sich nur um Additionen oder Multiplikationen handelt dann spielt es keine Rolle in welcher Reihenfolge diese ausgeführt werden, heisst: Wir können die Klammer weglassen. Für Subtraktionen und Divisionen gilt dies nicht. |


![[2-Potenzieren]]

![[Binomische Formeln]]

## Mitternachtsformel (abc-formel)
Die abc-formel kann verwendet werden um quadratische Gleichungen in der Form $ax^2 + bx + c$ zu lösen (geht auch wenn die Zeichen $-$ sind).
![[Mitternachtsformel]]

## Diskriminante der Mitternachtsformel
über die Diskriminante wird entschieden ob und wie viel Lösungen es gibt.
![[Diskriminante der Mitternachtsformel]]
Möchte man zb. wissen mit welchem bestimmten Parameter es genau eine Lösung gäbe kann man man Diskriminanten formell auch etwas umbauen. (In diesem Beispiel würde man für D; 0 einsetzen.)

![[PQ-Formel und Zwei-Klammer-Ansatz]]
## Gleichungssysteme
$$
\begin{align}
mx + 4y = 3 \\
2x - 4y =  6
\end{align}
$$
#### Gleichsetzen
Eine Lösungsweg wäre es sich für eine der beiden Variablen zu entscheiden und diese bei beiden Gleichungen auf die selbe Seite zu bringen, danach kann man die anderen Seiten gleichsetzen und ausrechnen. Mit dem Wert kann dann noch eine der Ursprünglichen Gleichungen gelöst werden.
#### Einsetzen (Bevorzugt)
Hier rechnet man auch wieder eines aus, und man kann dann die andere Seite bei der anderen Gleichung einsetzen. Dies ist bevorzugt weil nur das möglich ist bei Gleichungssystem mit mehr als zwei Gleichungen.
## Funktionen
Eine Funktion wird folgendermassen dargestellt, damit finden wir heraus wo das y eines gegeben x ist oder auch umgekehrt. das $q$ ist die Verschiebung der gesamten Linie in der Höhe um $0$. Ohne $q$ würde die Linie durch den $0/0$ punkt gehen.
$$
y = mx + q
$$
damit könnte man auch jeweils die fehlenden Informationen herausfinden zb $q$.

![[Steigung anhand von zwei Punkten herausfinden]]
