[Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 4)](https://tube.switch.ch/videos/17XX0bpa2E)

Nun geht es um <span style='color: green'>Bruchgleichungen</span> (welche auf lineare bzw. quadratisch Gleichungen führen).

Definition: Eine Gleichung, bei welcher die gesuchte Grösse $x$ im Nenner eines Bruches steht.

Das könnte Beispielsweise so gelöst werden.
$$
\begin{alignat*}{1}
\frac{x^2 - 2}{x-2} + 1 &= \frac{2}{x-2} &\quad & | -\frac{2}{x-2} \quad& \text{eine Seite Null setzen} \\
\frac{x^2 - 2}{x-2} + 1 - \frac{2}{x-2} &= 0 & & | & \text{andere Seite umformen,\\ vereinfache und faktorisieren} \\
\frac{x^2 - 2}{x-2} + \frac{x-2}{x-2} - \frac{2}{x-2} &= 0 & & | & \text{wir wandeln die 1 um damit es \\denn gleichen Nenner hat \\ was } \frac{x-2}{x-2} \text{ ist} \\
\frac{x^2 - 2 + x-2 - 2}{x-2} &= 0 & & | & \text{Dann können wir das ganze im \\ selben Bruch schreiben} \\
\frac{x^2 + x - 6}{x-2} &= 0 & & | & \text{und vereinfachen} \\
\frac{(x + 3)(x - 2)}{x-2} &= 0 & & | & \text{Den Zähler faktorisieren} \\
\frac{(x + 3)(x - 2)}{x-2} &= 0 & & | & \text{Dann können wir \\ das } (x-2) \text{ kürzen} \\
(x + 3) &= 0 & & | & \text{Und somit erkennen wir\\ die Lösung} \\
x &= -3
\end{alignat*}
$$
Das ist aber viel Schreibarbeit daher wäre es besser wenn wir mit den Nenner Multiplizieren.
$$
\begin{alignat*}{1}
\frac{x^2 - 2}{x-2} + 1 &= \frac{2}{x-2} &\quad & | *(x-2) \quad& \text{Mit Hauptnenner\\ multiplizieren (beidseitig)} \\
(x-2)* (\frac{x^2 - 2}{x-2} + 1) &= (x-2) * \frac{2}{x-2} &\quad & | \quad& \text{} \\
x^2 - 2 + x - 2 &= 2 &\quad & | \quad& \text{} \\
x^2 - 2 + x - 2 &= 2 &\quad & |-2 \quad& \text{} \\
x^2 + x - 6 &= 0 &\quad & | \quad& \text{} \\
(x + 3)(x - 2) &= 0 &\quad & | \quad& \text{} \\
x_1 &= -3 &\quad & | \quad& \text{} \\
x_2 &= 2 &\quad & | \quad& \text{Nun ist aber duch die \\ Multiplikation vom Anfang \\ eine Scheinlösung entstanden; \\ setzen wir nun 2 beim ursprung ein \\würden wir durch 0 teilen,\\ was nicht geht} \\
L &= \{3\} &\quad & | \quad& \text{\{3\} ist somit unsere Lösungsmenge} \\
\end{alignat*}
$$
Dies hätten wir aber schon von Anfang ermitteln/sehen können und in die Definitionsmenge einfliessen lassen: $\mathbb{D} = \mathbb{R} \setminus \{2\}$

Ist der Hauptnenner nicht ganz klar müssen wir einfach das gemeinsame Vielfache finden und dort wo es fehlt noch den Zähle erweitern.

$$
\begin{alignat*}{2}
\frac{1-4x}{(x-2)(x-1)} - \frac{3(x-1)}{(x-2)(x-6)} + \frac{7}{x-6} &= 0 &\quad & | \quad \text{HN= (x-2)(x-2)(x-6)} \\
\frac{(1-4x)(x-6)}{(x-2)(x-1)(x-6)} - \frac{3(x-1)(x-1)}{(x-2)(x-6)(x-1)} + \frac{7(x-1)(x-2)}{(x-6)(x-1)(x-2)} &= 0 &\quad & | \quad \text{brüche auflösen} \\
(1-4x)(x-6) - 3(x-1)(x-1) + 7(x-1)(x-2) &= 0 &\quad & | \quad \text{} \\
\end{alignat*}
$$