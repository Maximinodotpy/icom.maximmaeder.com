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