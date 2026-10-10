[Nugget 10 (Funktionen 1 - Einführung, Begriffe, Eigenschaften - Teil 3)](https://tube.switch.ch/videos/nVyceQ9GLH)

## Monotonie
Eine Funktion nennt man <span style='color: var(--custom-word-green, green)'>monoton steigend</span> wenn für alle $x_1, x_2 \in \mathbb{D}$ mit $x_1 < x_2$ immer $f(x_1) \leq f(x_2)$

Oder anders gesagt, grössere $x$-Werte sorgen auch immer für grössere $y$-Werte (respektive zumindest nicht für kleinere).

Oder graphisch heisst das, dass es immer von unten links nach oben rechts gehen muss (respektive es könnte auch eine horizontale Linie sein).

```desmos-graph
y = x
y = 2x
y = 2x -5
y = 5
```

Wenn $f(x_1) < f(x_2)$ dann nennt man $f$ <span style='color: var(--custom-word-green, green)'>streng monoton</span>.

Gilt $f(x_1) \ge f(x_2)$ dann nennt man die Funktion <span style='color: var(--custom-word-green, green)'>monoton fallend</span> (Oder wenn $f(x_1) > f(x_2)$ dann <span style='color: var(--custom-word-green, green)'>streng monoton fallend</span>).
$$
y = -x
$$
```desmos-graph
y = -x
```
## Beschränktheit
Existiert ein Wert $y_0 \in \mathbb{W}$, so dass für alle $x$-Werte des Definitionsbereichs $f(x) \leq y_0$ gilt, so nennt man die Funktion $f$ nach <span style='color: var(--custom-word-green, green)'>oben beschränkt</span>
 (und $y_0$ nennt man die <span style='color: var(--custom-word-green, green)'>obere Schranke</span>)

```desmos-graph
top=10;
---
y = -x^2 + 2x + 5
y = 6
(1,6)|label:Obere Schranke
```

Analog dazu gibt es dann natürlich Funktionen welche nach <span style='color: var(--custom-word-green, green)'>unten beschränkt</span> sind respektive <span style='color: var(--custom-word-green, green)'>untere Schranken</span>.

```desmos-graph
top=10;
---
y = x^2 + 2x + 5
y = 4
(-1,4)|label:Untere Schranke
```

und es geht natürlich auch beides gleichzeitig, wie z.b. bei der [Sinus](https://de.wikipedia.org/wiki/Sinus_und_Kosinus).

```desmos-graph
y = \sin(x)
```
## Stetigkeit
Eine Funktion nennt man auf einem Intervall stetig, wenn kleine Änderungen bei der unabhängigen Variablen nur kleine Änderungen bei den Funktionswerten bewirkt.
Oder: Eine Funktion ist auf einem Intervall stetig, wenn der Funktionsgraph ohne absetzen gezeichnet werden kann (keine Lücken und keine Sprünge aufweist).

$y = x^2$ ist stetig.

```desmos-graph
y = x^2
```

$y = \frac{x^2 - 1}{x - 1}$ ist nicht stetig weil für $x = 1$ eine Lück entsteht wo man keinen Wert ausrechnen kann.

```desmos-graph
y = \frac{x^2 - 1}{x - 1}
```

$y = \frac{1}{(x-1)^2}$ ist ebenfalls nicht stetig, weil bei $x = 1$ wieder keine Berechnung möglich ist.

```desmos-graph
y = \frac{1}{(x-1)^2}
```

Der Begriff der Stetigkeit wird aber erst später im Studium vertieft.

## Steigung
Die Steigung einer Funktion wird über die Steigung der Tangenten an einem Kurvenpunkt definiert.

Wird in der Differenzialmathematik noch vertieft.

## Krümmungsverhalten
Hier wird das Steigungsverhalten der Steigung untersucht (Steigung nimmt zu bzw. ab).

Damit zusammen hängt auch der Wendepunkt.

## Symmetrie

Wir nennen eine Funktion <span style='color: var(--custom-word-green, green)'>gerade (symmetrisch)</span> wenn $f(-x) = f(x)$.

Bei der klassischen Parabel ist das so.

```desmos-graph
y = x*x
```

Gilt nun aber $f(-x) = -f(x)$ dann ist die Funktion <span style='color: var(--custom-word-green, green)'>ungerade (symmetrisch)</span>.

also Beispiel wieder die Sinus Kurve.

```desmos-graph
y = \sin(x)
```

## Periodisch
Eine Funktion $f$ nennt man periodisch, wenn sich die Funktionswerte nach $T$ wiederholen.

$$
f(x + T) = f(x)
$$

