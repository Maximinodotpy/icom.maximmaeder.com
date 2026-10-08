---
title: Latex
date: 2026-09-28
published: true
description: Latex Notes
sources:
  - https://oeis.org/wiki/List_of_LaTeX_mathematical_symbols
  - https://de.wikipedia.org/wiki/Liste_mathematischer_Symbole
---
gesprochen: latek

Start a inline latex block with \$ ... \$ or a full latex block with double \$\$ ... \$\$.

## Quoting
When Block-quoting a latex block do it like this.

$$
x = y + 17
$$

^examplequote

which looks like this

![[#^examplequote]]

## Basis

| Befehl         | Symbol         | Bedeutung                    |
| -------------- | -------------- | ---------------------------- |
| `=`            | $=$            | Gleich                       |
| `\neq`         | $\neq$         | Nicht gleich                 |
| `\equiv`       | $\equiv$       | Semantisch gleich/äquivalent |
| `\sqrt{4}`     | $\sqrt{4}$     | (Quadrat)Wurzel              |
| `\sqrt[3]{16}` | $\sqrt[3]{16}$ | N-te Wurzel                  |
| `\pm`          | $\pm$          | Plus-Minus (bevorzugen)      |
| `\mp`          | $\mp$          | Minus-Plus                   |

## Logische Operatoren

| Befehl             | Symbol            | Bedeutung                           |
| ------------------ | ----------------- | ----------------------------------- |
| `\wedge` / `\land` | $\wedge$          | Und                                 |
| `\lor`             | $\lor$            | Oder                                |
| `\neg`             | $\neg$            | Negation                            |
| `\bar{A}`          | $\bar{A}$         | Negation direkt über dem Buchstaben |
| `\Rightarrow`      | $\Rightarrow$     | Impliziert (Kurz)                   |
| `\implies`         | $\implies$        | Impliziert (Lang)                   |
| `\iff`             | $\iff$            | Äquivalenz (Lang)                   |
| `\Leftrightarrow`  | $\Leftrightarrow$ | Äquivalenz (Kurz)                   |

### [[2-praedikate-und-quantoren|Quantoren]]

| Befehl    | Symbol    | Bedeutung                                                                   |
| --------- | --------- | --------------------------------------------------------------------------- |
| `\exists` | $\exists$ | [[2-praedikate-und-quantoren#Definition ∃ (Existenzquantor)\|Es existiert]] |
| `\forall` | $\forall$ | [[2-praedikate-und-quantoren#Defintion ∀ (Allquantor)\|Für alle]]           |

## Mengen
| Befehl                | Symbol                | Bedeutung                                                                             |
| --------------------- | --------------------- | ------------------------------------------------------------------------------------- |
| `\mathbb{N}`          | $\mathbb{N}$          | [[koma/formelblatt#Zahlen\|Natürliche Zahlen]]                                        |
| `\mathbb{Z}`          | $\mathbb{Z}$          | [[koma/formelblatt#Zahlen\|Ganze Zahlen]]                                             |
|                       |                       |                                                                                       |
|                       |                       |                                                                                       |
| `\emptyset`           | $\emptyset$           | Leere Menge                                                                           |
| `\in`                 | $\in$                 | In                                                                                    |
| `\notin`              | $\notin$              | Nicht in                                                                              |
| `\cup`                | $\cup$                | [[4-mengen#^vereinigung\|Vereinigung]] (Union)                                        |
| `\cap`                | $\cap$                | [[4-mengen#^durchschnitt\|Schnitt]] (Überschneidung)                                  |
| `\subseteq`           | $\subseteq$           | [[4-mengen#Definition Teilmenge ($ subseteq$ und $ supseteq$)\|Teilmenge]] (Subset)   |
| `\supseteq`           | $\supseteq$           | [[4-mengen#Definition Teilmenge ($ subseteq$ und $ supseteq$)\|Obermenge]] (Superset) |
| `\nsubseteq`          | $\nsubseteq$          | keine Teilmenge                                                                       |
| `\nsupseteq`          | $\nsupseteq$          | keine Obermenge                                                                       |
| `\setminus`           | $\setminus$           | [[4-mengen#^differenz\|Differenz]]                                                    |
| `\|A\|`               | $\|A\|$               | [[4-mengen#Anzahl von Mengen\|Kardinalität]] (**FALSCH**)                             |
| `\mathcal{P}(A)`      | $\mathcal{P}(A)$      | [[4-mengen#Potenzmenge\|Potenzmenge]]                                                 |
| `\overline{A \cup B}` | $\overline{A \cup B}$ | [[4-mengen#^komplement\|Komplement]]                                                  |
## Sonstiges

| Befehl        | Beispiel/Symbol | Bedeutung |
| ------------- | --------------- | --------- |
| `_n`          | $b_1$           |           |
| `\infty`      | $\infty$        | Unendlich |
| `\text{Text}` | $\text{Text}$   | Text      |
| `\quad`       | $\quad$         | Abstand   |
|               |                 |           |

### Mehrstufige Gleichung
```latex
$$
\begin{alignat*}{3}
x &= y &\quad & | -y \\ 
x - y &= 0 &\quad & \\
\end{alignat*}
$$
```
$$
\begin{alignat*}{3}
x &= y &\quad & | -y \\ 
x - y &= 0 &\quad & \\
\end{alignat*}
$$
## Gleichungssysteme
```latex
$$
\begin{alignat*}{3}
	\begin{cases}
		& x+y &= 700 \\
		& x+\frac{y}{2} &= 500
	\end{cases}
\end{alignat*}
$$
```
$$
\begin{alignat*}{3}
	\begin{cases}
		& x+y &= 700 \\
		& x+\frac{y}{2} &= 500
	\end{cases}
\end{alignat*}
$$


