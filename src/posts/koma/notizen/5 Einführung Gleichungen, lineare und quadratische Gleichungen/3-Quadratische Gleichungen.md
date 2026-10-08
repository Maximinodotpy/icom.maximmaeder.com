---
title: KOMA Lektion 2
description: Konvergente Mathematik
date: 2026-09-15
published: true
moodle_section: https://moodle.fhnw.ch/course/section.php?id=704181
---
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
   Könnte man so umformen $x^2= 16$
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
