---
title: "KOMA Lektion 1: Variablen, Terme, Rechenoperationen, Gesetze und Termumformungen"
date: 2026-09-15
published: true
video:
  - https://tube.switch.ch/videos/sdgwWrGTLm
übungs_serie:
schriftliche_notizen:
sources:
moodle_section: https://moodle.fhnw.ch/course/section.php?id=704181
---
## [Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 1)](https://tube.switch.ch/videos/sdgwWrGTLm)

Beispiel Anzahl der Sprossen: $(n-1) * 26 = (n+1) * 22$

Das ist eine Gleichung/Aussageform.

Um den wert von $n$ herauszufinden könnte man jetzt viele verschiedene Zahlen einsetzen, was je nachdem möglich ist aber bei den meisten Rechnungen viel zu lange gehen würde. daher wenden wir sogenannte <span style='color: green'>Äquivalenzumformungen</span> an.

Das heisst wir machen auf beiden Seiten das gleiche zb.
$$
\begin{alignat*}{2}
(n-1) * 26 &= (n+1) * 22 &\quad & | T \\
26n - 26 &= 22n + 22 & & | -22n+26 \\
26n - 26 - 22n + 26 &= 22n + 22 + -22n + 26 & & |T \\
4n &= 48 & & |:4 \\
\frac{4n}{4} &= \frac{48}{4} & & |T \\
n &= 12 & &  \\
\end{alignat*}
$$
Wir haben die Gleichung so umgeformt dass man die Lösung direkt ablesen kann, was in diesem Fall $\mathbb{L} = \{12\}$ ist.

Es kann aber sein dass wir aus versehen neue Lösungen der Lösungsmenge hinzufügen, welche aber nicht gehen sollten sogenannte <span style='color: green'>Scheinlösungen</span>.
$$
\begin{alignat*}{2}
x &= 1 &\quad |& +3 \\
x + 3 &= 4 & |& *(x-3) \\
(x + 3)(x - 3) &= 4(x-3) & |& T \\
x^2 - 9 &= 4x - 12 & |& -x + 9 \\
x^2 - x &= 3x - 3 & |& T \\
x(x - 1) &= 3(x - 1) & |& :(x-1) \\
x &= 3 & & \\
\end{alignat*}
$$
Durch die Umformung $*(x-3)$ haben wir Gleichzeit mit $0$ multipliziert. und auch durch $:(x-1)$ haben wir ebenfalls mit 0 multipliziert, sofern $x = 1$ was es ursprünglich war.

Also folgende Gleichungsumformungen verändern die Lösungsmenge **nicht**:
1. Beidseitiges addieren oder subtrahieren einer beliebigen Zahl.
   $T_1(x) = T_2(x) \Leftrightarrow T_1(x) + a = T_2(x) + a$
2. Beidseitiges multiplizieren mit $a \neq 0$ bzw. dividieren durch $a \neq 0$
   $T_1(x) = T_2(x) \Leftrightarrow T_1(x) * a = T_2(x) * a$
   Durch eine Multiplikation kommen neue Scheinlösungen hinzu, wenn eine Variable involviert war wie zb. $*(x + 7)$ (das wäre $0$ wenn $x = 7$)
   oder durch eine Division gehen Lösungen verloren.
3. Eine Gleichung der Form "<span style='color: green'>Produkt gleich Null</span>" hat die Lösungsmenge als Vereinigung der Lösungsmengen die durch Nullsetzen der einzelnen Faktoren entstehen.
   zb.$$
	   \begin{alignat*}{2}
	   x(x-1) &= 3(x-1) &\quad & | -3(x-1) \\
	   x(x-1) - 3(x - 1) &= 0 & & | T \\
	   x^2 - x - 3x + 3 &= 0 & & | T \\
	   x^2 - 4x + 3 &= 0 & & | T \\
	   (x - 1)(x - 3) &= 0 & & | T \\
	   x_1 &= 1 \quad \text{oder} \quad x_2 = 3 & & | T \\
	   \end{alignat*}
   $$Wenn nun eine dieser Klammern $0$ ergibt wird das ganze $0$ und daher können wir ablesen dass die erste Klammer $0$ wäre wenn $x = 1$ und die zweite wenn $x = 3$ somit kennen wir die Lösungsmenge. ^produktgleichnull

> [!NOTE] Übrigens
> Hier im vierten Schritt wurde bereits eine [[koma/formelblatt#Binomische Formeln|Binomische Formel]] respektive der [[koma/formelblatt#PQ-Formel und Zwei-Klammer-Ansatz|Zwei Klammer Ansatz verwendet]].

## [Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 2)](https://tube.switch.ch/videos/dAjg6ONBaL)

### Lineare Gleichungen
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

## [Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 3)](https://tube.switch.ch/videos/lZWt8mJz0m)

Jetzt kommen wir zu den <span style='color: green'>quadratischen Gleichungen</span>.

Form: $ax^2 + bx + c = 0$ wobei $a,b,c \in \mathbb{R}$ und $a\neq0$ und $x$ ist die unbekannte.

Hier können wir in der Regel nicht die Umformungstechniken anwenden.

Es gibt aber zwei spezielle Situationen.

1. $x^2 + 3x - 10 = 0$
   können wir faktorisieren zu $(x + 5)(x - 2) = 0$
   Und so sehen wir wieder welche Werte wir einfügen müssen damit es null gibt (siehe [[#^produktgleichnull|Produkt gleich Null]])
   Graphisch dargestellt sehen wir auch warum es zwei Werte gibt.
```desmos-graph
left=-10;
right=10;
top=20;
bottom=-20
---
	y = x^2 + 3x - 10
```

2. 
