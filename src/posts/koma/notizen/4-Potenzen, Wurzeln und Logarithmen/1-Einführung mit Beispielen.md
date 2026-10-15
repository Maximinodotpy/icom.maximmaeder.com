[Nugget 4 (Potenzen, Wuzeln und Logarithmen) - Teil 1](https://tube.switch.ch/videos/QIo7kR1TXY)

## Potenzieren
$$x^n = x_1 * x_2 * ... * x_n$$

> [!example]+ Beispiel
> Vor 1000 Jahren wurden 10 Franken zu einem Zinssatz von 2% angelegt. Welchen Wert hat das Kapital heute?
>
> Dies finden wir mit folgender Formel heraus
> $$
K_n = K_0 * (1+p)^n
> $$
> 
> Wobei $K_n$ das heutige Kapital nach $n$ Jahren ist, $K_0$ ist das ursprüngliche Kapital und $p$ ist der Prozentsatz in Dezimal.

## Radizieren
$$
x = \sqrt[n]{a}
$$

> [!example]+ Beispiel
> Zu welchem Zinssatz $p$ muss ein Kapital angelegt werden, so dass es sich in 50 Jahren verzehnfacht?
>
> $$10 = (1+p)^{50}$$
> $$\sqrt[50]{10} = \sqrt[50]{(1 + p)^{50}}$$
> $$4.71\% = p$$
>
> $10$ ist das gleiche wie $1000\%$ was das gleiche ist wie eine Verzehnfachung.

## Logarithmieren

$$
y = \log_2(4)
$$

> [!example]+ Beispiel
> Nach welcher Zeit verdoppelt sich der Wert eines Kapitals, wenn es zu $5\%$ angelegt wird?
>
> $$\begin{alignat*}{2}
> 2 &= 1.05^n &\quad & | \text{log}_{1.05}(2) &\quad \text{Logarithmus ist \\ eine weitere \\ Umkehroperation \\ der Potenzierung} \\
> \log_{1.05}(2) &= \log_{1.05}(1.05^n) & & &\quad \text{} \\
> n &= \log_{1.05}(2) & & &\quad \text{} \\
> n &= 14.21 & & &\quad \text{} \\
> \end{alignat*}
> $$
>
> Über den Logarithmus fragen wir mit welchem [[Exponenten]] müssen wir eine [[Basis]] potenzieren um das Argument zu erreichen (In unserem Fall mit was muss man $1.05$ potenzieren um $2$ zu erhalten)

