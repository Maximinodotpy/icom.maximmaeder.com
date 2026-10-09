[Nugget 6 (Gleichungen 2 - Lineare Gleichungssysteme - Teil 3)](https://tube.switch.ch/videos/ri39Dh8gKh)

Nun kommen wir zur <span style='color: green'>Cramer'schen Regel</span>.

Wenn ein $2\times2$-Gleichungssystem auf folgende Art und Weise daher kommt.
$$
\begin{equation}
	\left| \quad
		\begin{aligned}
			a_{11}x + a_{12}y = b_1 \\
			a_{21}x + a_{22}y = b_1
		\end{aligned} 
	\quad \right|
\end{equation}
$$
Wobei $x$ und $y$ die Unbekannten sind. Die $a_{xx}$ sind die jeweiligen [[Koeffizient|Koeffizienten]] und $b$ sollte einfach ein konstanter Wert sein.

Daraus lässt sich dann folgende Formel ableiten.
$$
x = \frac{b_1a_{22} - b_2a_{12}}{a_{11}a_{22} - a_{12}a_{21}}
$$
und
$$
x = \frac{
	a_{11}b_{2}-a_{21}b_{1}
}{
	a_{11}a_{22} - a_{12}a_{21}
}
$$
Schauen wir uns das Beispiel mit dem Bierglass an.
![[1-Einführung Lineare Gleichungssysteme#^bierbeispielgleichungssystem]]
also haben wir folgende Werte:
 $a_{11} = 1$, $a_{12} = 1$, $b_1 = 700$
 $a_{21} = 1$, $a_{22} = \frac{1}{2}$, $b_2 = 500$

Setzen wir ein

$$
\frac{700 \times \frac{1}{2} - 500 \times 1}{1 \times \frac{1}{2} \times - 1 \times 1}
$$
Was uns auch zu $300$ für $x$ bringt.

Diese Formel ist aber nicht gut merkbar und ist daher vor allem für automatisiertes Rechnen nützlich.