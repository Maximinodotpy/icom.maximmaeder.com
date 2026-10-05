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
siehe: [[4-mengen|Mengen]]
## Grundlegende Gesetze der Algebra

### Kommutativ-, Distributiv- und Assoziativgesetz

| Name                                                                          | Beispiele                                                                                                                                                                                                                                                                               | Erklärung                                                                                                                                                                                                                           |
| ----------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Kommutativgesetz der Addition/Multiplikation**^Kommutativgesetz             | *Algebra*<br>$a+b=b+a$<br>$a*b=b*a$<br><br>*Mengen*<br>$A \cup B = B \cup A$ (Vereinigung)<br>$A \cap B = B \cap A$ (Schnitt)<br><br>*Aussagen*<br>$A \wedge B = B \wedge A$ (Und)<br>$A \vee B = B \vee A$ (Oder)<br>$A \Leftrightarrow B = B \Leftrightarrow A$ (Logische Äquivalenz) | Bei der Addition, Multiplikation, [[4-mengen\|Vereinigung]], [[4-mengen\|Schnitt]], [[1-aussagen\|Und und Oder]] spielt die Reihenfolge keine Rolle.                                                                                |
| **Distributivgesetz**<br>Siehe [[#Binomische Formeln]].<br>^Distributivgesetz | $a * (b + c) = a*b + a*c$                                                                                                                                                                                                                                                               | Eine Summe (oder Differenz) wird mit einem Faktor, indem man jeden einzelnen Summanden (Minuend) mit diesem Faktor Multipliziert und die Produktwerte addiert. (nennt sich Ausklammern, Herausheben oder Faktorisieren).            |
| **Assoziativgesetz**<br>^Assoziativgesetz                                     | $a * (b * c) = a * b * c$<br>$a + (b + c) = a + b + c$                                                                                                                                                                                                                                  | Wenn es sich nur um Additionen oder Multiplikationen handelt dann spielt es keine Rolle in welcher Reihenfolge diese ausgeführt werden, heisst: Wir können die Klammer weglassen. Für Subtraktionen und Divisionen gilt dies nicht. |
### Potenzregeln
https://de.wikipedia.org/wiki/Potenz_(Mathematik)#Potenzgesetze

| Beispiel                                            | Anmerkung                                                                                     |
| --------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| $a^0 = 1$                                           | Sofern $a$ nicht $0$ ist dann ergibt die 0te Potenz von jeder Basis $1$.                      |
| $a^{-r} = \frac{1}{a^r}$                            | Sofern $a$ nicht $0$ ist dann ist die minus $R$-te Potenz das gleich wie $1$ über der Potenz. |
| $a^{\frac{m}{n}} = \sqrt[n]{a^m} = (\sqrt[n]{a})^m$ |                                                                                               |
| $a^{r + s} = a^r + a^s$                             | Sofern $a > 0$.                                                                               |
| $a^{r-s} = \frac{a^r}{a^s}$                         | Sofern $a > 0$.                                                                               |
| $(a * b)^r = a^r * a^r$                             | Sofern $a * b \neq 0$.                                                                        |
| $(\frac{a}{b})^r = \frac{a^r}{b^r}$                 | Sofern $a \neq 0 \wedge b \neq 0$.                                                            |
| $a^{r^{s}} = a^{r*s}$                               | Sofern $a \neq 0$.                                                                            |
Potenzieren ist weder [[koma/formelblatt#^Assoziativgesetz|Kommutativ]] noch [[koma/formelblatt#^Assoziativgesetz|Assoziativ]].

## Binomische Formeln
| Name              | Formel                          |
| ----------------- | ------------------------------- |
| Plus-Formel       | $(a + b)^2 = a^2 + 2ab + b^2$   |
| Plus-Minus-Formel | $(a - b)^2 = a^2 - 2ab + b^2$   |
| Minus-Formel      | $(a + b) * (a - b) = a^2 - b^2$ |
Die Binomischen Formeln können auch genutzt werden um eine Anzahl von Brüchen auf den selben Nenner zu bringen zb: $\frac{x}{x-3} - \frac{10}{x+3} = \frac{18}{x^2 - 9}$ Hier können wir bei $x^2 - 9$ die Plus-Minus-Formel anwenden und so dann relativ einfach die anderen Brüche erweitern.
## Mitternachtsformel (abc-formel)
Die abc-formel kann verwendet werden um quadratische Gleichungen in der Form $ax^2 + bx + c$ zu lösen (geht auch wenn die Zeichen $-$ sind).
$$
x =\frac{-b \pm \sqrt{b^2 - 4ac}}{2a}
$$
über die Diskriminante wird entschieden ob und wie viel Lösungen es gibt.
$$
D = b^2 - 4ac
$$
```
D > 0: zwei Lösungen
D = 0: eine Lösung
D < 0: keine reele Lösung
```
Möchte man zb. wissen mit welchem bestimmten Parameter es genau eine Lösung gäbe kann man man Diskriminanten formell auch etwas umbauen. (In diesem Beispiel würde man für D; 0 einsetzen.)
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
### Steigung anhand von zwei Punkten herausfinden
$$
\frac{yb - ya}{xb - xa}
$$
Also Höhenunterschied geteilt durch Breitenunterschied
