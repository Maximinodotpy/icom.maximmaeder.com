---
tags:
  - eigenschaft_einer_funktion
---
> [!abstract] Definition der Montonie
> Eine [[1-Einführung Funktionen|Funktion]] $f: A \rightarrow B$ mit $A,B \subseteq \mathbb{R}$ nennt man <span style='color: var(--custom-word-green, green)'>monoton steigend</span> wenn für alle $x_1, x_2 \in \mathbb{D}$ mit $x_1 < x_2$ immer $f(x_1) \leq f(x_2)$ gilt.
>
> Oder anders gesagt, grössere $x$-Werte können nur für grössere oder zumindest gleichbleibenden $y$-Werte sorgen.
>
> Oder graphisch heisst das, dass es immer von unten links nach oben rechts gehen muss (respektive es könnte auch eine horizontale Linie sein oder kurz abschnittweise nicht Wachsen).
>
> ```desmos-graph
> y = x
> y = 2x
> y = 2x -5
> y = 5
> ```
>
> Wenn $f(x_1) < f(x_2)$ dann nennt man $f$ <span style='color: var(--custom-word-green, green)'>streng monoton</span>, hier muss es immer steigen.
>
> Gilt $f(x_1) \ge f(x_2)$ dann nennt man die [[6-funktionen|Funktion]] <span style='color: var(--custom-word-green, green)'>monoton fallend</span> (Oder wenn $f(x_1) > f(x_2)$ dann <span style='color: var(--custom-word-green, green)'>streng monoton fallend</span>).
> $$
> y = -x
> $$
> ```desmos-graph
> y = -x
> ```

^definition