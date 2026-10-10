[Nugget 5 (Gleichungen 1 - Einführung, lin. und quad. Gleichungen - Teil 1)](https://tube.switch.ch/videos/sdgwWrGTLm)

Beispiel Anzahl der Sprossen: $(n-1) * 26 = (n+1) * 22$

Das ist eine Gleichung/Aussageform.

Um den wert von $n$ herauszufinden könnte man jetzt viele verschiedene Zahlen einsetzen, was je nachdem möglich ist aber bei den meisten Rechnungen viel zu lange gehen würde. daher wenden wir sogenannte <span style='color: var(--custom-word-green, green)'>Äquivalenzumformungen</span> an.

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

Es kann aber sein dass wir aus versehen neue Lösungen der Lösungsmenge hinzufügen, welche aber nicht gehen sollten sogenannte <span style='color: var(--custom-word-green, green)'>Scheinlösungen</span>.
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
3. Eine Gleichung der Form "<span style='color: var(--custom-word-green, green)'>Produkt gleich Null</span>" hat die Lösungsmenge als Vereinigung der Lösungsmengen die durch Nullsetzen der einzelnen Faktoren entstehen.
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