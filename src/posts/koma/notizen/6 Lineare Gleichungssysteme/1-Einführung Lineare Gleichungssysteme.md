[Nugget 6 (Gleichungen 2 - Lineare Gleichungssysteme - Teil 1)](https://tube.switch.ch/videos/AEgWQj2OwI)

Beispiel. Ein volles Bier glass wiegt 700gr und ein halbvollen 500gr nun würden wir gerne wissen wie viel das Glass selbst wiegt. Es hat also <span style='color: green'>mehrere Unbekannte</span>.

Die Gleichung dazu könnte so aussehen:

$$
\begin{alignat*}{3}
\begin{cases}
& x+y &= 700 \\
& x+\frac{y}{2} &= 500
\end{cases}
\end{alignat*}
$$ 

^bierbeispielgleichungssystem

wobei $x$ das Gewicht des Glass' ist und $y$ der Inhalt. Nun haben wir zwei Gleichungen mit zwei unbekannten.

Betrachten wir nur die erste Gleichung  gäbe es mehrere Lösungen zb. $600/100$ oder $200/500$ usw. Wir befinden uns also in einem Zwei Dimensionalen Raum. (Hätte es weitere Unbekannte wäre es ein Tripel oder sogar ein $n$-Tupel)

Wir könnten die erste Gleichung nun nach $y$ auflösen und das folgendermassen graphisch darstellen

$$y = 700 - x$$

^1nachyaufgeloest

```desmos-graph
top=800;
bottom=-200;
left=-200;
right=800;
---
y = 700 - x
```

Alle punkte auf dieser geraden wären auch valide Lösungen für die erste Gleichung.

verfahren wir nun analog mit der zweiten Gleichung, also wir lösen nach $y$ auf.
$$

\begin{alignat*}{2}
x + \frac{y}{2} &= 500 &\quad & | *2 &\quad \text{} \\
2x + y &= 1000 &\quad & |-2x  &\quad \text{} \\
y &= 1000 -2x &\quad & |  &\quad \text{} \\
\end{alignat*}
$$
Das ist nun eine weitere Gerade, zeigen gleich beide an.

$$
y = 1000-2x
$$

^2nachyaufgeloest

```desmos-graph
top=800;
bottom=-200;
left=-200;
right=800;
---
y = 700 - x
y = 1000 -2x
```

Somit erkennen wir dass es für beide Gleichung nur eine Gemeinsame Lösung gibt. In diesem Fall $\mathbb{L} = \{\{300,400\}\}$
