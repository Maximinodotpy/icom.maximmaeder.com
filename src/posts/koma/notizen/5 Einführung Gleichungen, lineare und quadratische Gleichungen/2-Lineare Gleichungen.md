---
title: KOMA Lektion 2; Einführung Gleichungen, lineare und quadratische Gleichungen
date: 2026-09-22
published: true
video:
übungs_serie:
schriftliche_notizen:
sources:
moodle_section: https://moodle.fhnw.ch/course/section.php?id=704181
---

[Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 2)](https://tube.switch.ch/videos/dAjg6ONBaL)

Form: $a * x + b = 0$ wobei $a,b \in \mathbb{R}$ und $x$ ist unbekannt.

Beispiele:
* $2x - 4 = 0$ dann ist $a = 2$ und $b = -4$
* $3x + 5 = x - 1$ kann man umformen zu $2x + 6 = 0$ dann ist $a = 2$ und $b = 6$
* $(x-1)(x+2) = x^2 + x - 2$ kann man umformen zu $x^2 + x - 2 = x^2 + x - 2$ was das gleiche ist wie $0 = 0$ und das ist auch Linear ($a,b = 0$).

Die Lösungsmenge für eine lineare Gleichung $ax + b = 0$ finden wir:
* Wenn $a \neq 0$ (<span style='color: green'>Regulär</span>)
  $$
\begin{alignat*}{3}
ax + b &= 0 &\quad & | -b \\
ax &= -b &\quad & | :a \\
x &= \frac{-b}{a} &\quad & \\
\end{alignat*}
  $$
  Somit ist die Lösung in dieser Form immer $\mathbb{L} = \{\frac{-b}{a}\}$ (man kann nicht durch $0$ dividieren)

* Wenn $a = 0$ gibt es zwei weitere Fälle. (<span style='color: green'>Singulär</span>)
	* $a=0$ und $b=0$ (<span style='color: green'>Unterbestimmt</span>)
	  In diesem Fall kann man jede beliebige Zahl einsetzen also $\mathbb{L} = \mathbb{R}$
	* $a = 0$ und $b \neq 0$ (§)
	  Hier ergibt sich immer eine Falsche Aussage also $\mathbb{L} = \{\}$

#### graphische Interpretation
Bei einer regulären linearen Gleichung würde dann so aussehen.
$$
y = 2x - 4
$$
```desmos-graph
y = 2x - 4
(2,0)|label:Unsere Lösung=2
```

Wir suchen also die sogenannte <span style='color: green'>Nullstelle</span> (Dort wo die Linie die X-Achse auf Höhe $0$ schneidet). Wie wir sehen gibt es genau einen solchen Punkt (nämlich $2$).

Bei einem <span style='color: green'>singulär widersprüchlichen</span> Beispiel sehen wir dass die Linie die X-Achse nie schneidet, sie verläuft Parallel dazu.
$$
y = 0x + 5
$$
```desmos-graph
y = 0x + 3
```

Und bei einem <span style='color: green'>singulär unterbestimmten</span> Beispiel sehen wir dass die Linie auf der X-Achse verläuft was uns dann $\mathbb{L} = \mathbb{R}$
$$
y = 0x + 0
$$
```desmos-graph
y = 0x + 0
```

## Lineare Gleichungen 
[Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 2)](https://tube.switch.ch/videos/dAjg6ONBaL)

Form: $a * x + b = 0$ wobei $a,b \in \mathbb{R}$ und $x$ ist unbekannt.

Beispiele:
* $2x - 4 = 0$ dann ist $a = 2$ und $b = -4$
* $3x + 5 = x - 1$ kann man umformen zu $2x + 6 = 0$ dann ist $a = 2$ und $b = 6$
* $(x-1)(x+2) = x^2 + x - 2$ kann man umformen zu $x^2 + x - 2 = x^2 + x - 2$ was das gleiche ist wie $0 = 0$ und das ist auch Linear ($a,b = 0$).

Die Lösungsmenge für eine lineare Gleichung $ax + b = 0$ finden wir:
* Wenn $a \neq 0$ (<span style='color: green'>Regulär</span>)
  $$
\begin{alignat*}{3}
ax + b &= 0 &\quad & | -b \\
ax &= -b &\quad & | :a \\
x &= \frac{-b}{a} &\quad & \\
\end{alignat*}
  $$
  Somit ist die Lösung in dieser Form immer $\mathbb{L} = \{\frac{-b}{a}\}$ (man kann nicht durch $0$ dividieren)

* Wenn $a = 0$ gibt es zwei weitere Fälle. (<span style='color: green'>Singulär</span>)
	* $a=0$ und $b=0$ (<span style='color: green'>Unterbestimmt</span>)
	  In diesem Fall kann man jede beliebige Zahl einsetzen also $\mathbb{L} = \mathbb{R}$
	* $a = 0$ und $b \neq 0$ (§)
	  Hier ergibt sich immer eine Falsche Aussage also $\mathbb{L} = \{\}$

#### graphische Interpretation
Bei einer regulären linearen Gleichung würde dann so aussehen.
$$
y = 2x - 4
$$
```desmos-graph
y = 2x - 4
(2,0)|label:Unsere Lösung=2
```

Wir suchen also die sogenannte <span style='color: green'>Nullstelle</span> (Dort wo die Linie die X-Achse auf Höhe $0$ schneidet). Wie wir sehen gibt es genau einen solchen Punkt (nämlich $2$).

Bei einem <span style='color: green'>singulär widersprüchlichen</span> Beispiel sehen wir dass die Linie die X-Achse nie schneidet, sie verläuft Parallel dazu.
$$
y = 0x + 5
$$
```desmos-graph
y = 0x + 3
```

Und bei einem <span style='color: green'>singulär unterbestimmten</span> Beispiel sehen wir dass die Linie auf der X-Achse verläuft was uns dann $\mathbb{L} = \mathbb{R}$
$$
y = 0x + 0
$$
```desmos-graph
y = 0x + 0
```

## Quadratische Gleichungen
[Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 3)](https://tube.switch.ch/videos/lZWt8mJz0m)

Jetzt kommen wir zu den <span style='color: green'>quadratischen Gleichungen</span>.

Form: $ax^2 + bx + c = 0$ wobei $a,b,c \in \mathbb{R}$ und $a\neq0$ und $x$ ist die unbekannte.

Hier können wir in der Regel nicht die Umformungstechniken anwenden.

Es gibt aber zwei spezielle Situationen.

1. $x^2 + 3x - 10 = 0$
   können wir faktorisieren zu $(x + 5)(x - 2) = 0$
   Und so sehen wir wieder welche Werte wir einfügen müssen damit es null gibt (siehe [[1-Grundlagen Gleichungen#^produktgleichnull|Produkt gleich Null]])
   Graphisch dargestellt sehen wir auch warum es zwei Werte gibt. Diese beiden Faktoren können wir auch als einzelne Funktionen sehen welche die selben X-Achsenschnittpunkte haben einfach jeweils nur einen (Grün und Violet)
```desmos-graph
left=-10;
right=10;
top=20;
bottom=-20
---
	y = x^2 + 3x - 10
	
	y = x + 5
	y = x - 2
```

2. $x^2 - 16 = 0$ ($b$ ist also $0$)
   Könnte man so umforen $x^2= 16$ 
   würden wir nun aber die Wurzel ziehen ginge uns wieder ein Ergebnis verloren.
   Graphisch sehen wir aber es gäbe wieder zwei Lösungen.
   
   Wir müssen bedenken die $+\sqrt{\quad}$ und die $-\sqrt{\quad}$ zu ziehen respektive die negation der Lösung ist ebenfalls eine Lösung. In diesem Fall $\mathbb{L} = \{-4, 4\}$ 
```desmos-graph
left=-10;
right=10;
top=20;
bottom=-20
---
x^2 - 16
```

Hierbei kommt die [[koma/formelblatt#Mitternachtsformel (abc-formel)|Mitternachtsformel]] ins spiel.

![[koma/formelblatt#Mitternachtsformel (abc-formel)|Mitternachtsformel]]

Man muss auch die [[koma/formelblatt#Diskriminante der Mitternachtsformel|Diskriminante]] beachten.

![[koma/formelblatt#Diskriminante der Mitternachtsformel|Diskriminante]]

Graphisch erkennen wir wieso dem so ist.

**$D > 0$** (Zwei Ergebnisse)
```desmos-graph
y = x^2 - 2
```

**$D = 0$** (Ein Ergebnis)
```desmos-graph
y = x^2
```

**$D < 0$** (Keine Ergebnisse)
```desmos-graph
y = x^2 + 1
```
