---
title: "MGLI Lektion 6: Funktionen"
date: 2026-09-21
published: true
video:
  - https://tube.switch.ch/videos/eEoF9I8TI0
sources:
Woche: "6"
übungs_serie:
schriftliche_notizen: "[[6-funktionen-übungen]]"
---
![[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion]]

> [!example]+ Beispiel 1
> Es seien  $A = \{\text{Alle Studierenden dieser Klasse}\}$ und $B = \{\text{alle möglichen Noten}\}$
> Dann ist $F$ mit $xFy$ wenn $y$ die Note von $x$ in diesem Modul ist, eine Funktion von $A$ nach $B$.
> Für einen Studierenden $x$ ist $F(x)$ also die zugehörige Note.

^beispiel1

> [!example]+ Beispiel 2
> Es sei $F = \{ (x,y) \in \mathbb{R} \times \mathbb{R} | y = 2*x \}$
> Dann ist das $F$ eine [[1-Einführung, Definition, Steigung und y-Achsenabschnitt|(lineare) Funktion]] von $\mathbb{R}$ nach $\mathbb{R}$
> Für $x \in \mathbb{R}$ ist $F(x) = 2 * x$

^beispiel2

> [!example]+ Beispiel 3
> Es sei $F = \{ (x,y) \in \mathbb{R} \times \mathbb{R}|y^2 = x\}$
> Dann ist $F$ ==🔴keine Funktion==, da etwas $(1,-1) \in F$ und auch $(1,1) \in F$
>
> Geometrisch würde dies gehen.
> ```desmos-graph
> y^2 = x
> ```
> Es erfüllt aber die Bedienung, dass es für ein $x$ immer nur ein $y$ geben darf nicht.

^beispiel3
## Darstellung von Funktionen

Hier werden die [[5-relationen#Bipartiter Graph|bipartiten Graphen]] wieder nützlich.

![[#^beispiel1]]
![[6-funktionen 2026-10-23 12.58.07.excalidraw||100%]]
Hier erkennt man das jeder Studierende ein Wert zugewiesen wird, heisst aber nicht dass mehrere Studierende nicht die selbe Note haben könnte.

Somit wären folgende Darstellungen keine Funktionen.

![[6-funktionen 2026-10-23 13.01.43.excalidraw||100%]]

Wenn Definitions- und Wertebereich einer Funktion $F$ aus Zahlen besteht, stellt man die Funktionen oft in einem [[Kartesisches Koordinatensystem]] dar, wobei die horizontale Achse ([[Abszissenachse]]) den Definitionsbereich und die vertikale Achse ([[Ordinatachse]]) den Wertebereich enthält.

![[#^beispiel2]]

```desmos-graph
y = 2x
```

> [!NOTE] Aufgaben: Entscheiden, ob folgende Relationen Funktionen sind.
> ![[Pasted image 20261023131306.png]]
> Ja, weil eine Stadt kann nur zu einem Kanton gehören (Dass es womöglich viele Städte im selben Kanton hat spielt dabei keine Rolle)
>
> ![[Pasted image 20261023131337.png]]
> Nein, weil nicht alle der Städte der Welt können einem Kanton in der Schweiz zugewiesen werden.
>
> ![[Pasted image 20261023131343.png]]
>Nein, weil so von einem $x$ (Kanton) mehrere Relationen zu viele Städten ausgehen können.

## Bildmenge

Die Funktion $F: \mathbb{N} \rightarrow \mathbb{N}$ sei durch $f(x) = 2x$ definiert.

![[6-funktionen 2026-10-23 13.21.03.excalidraw||100%]]
In der [[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion|Wertemenge]] existiert nur für eine gerade Zahl $y \in \mathbb{N}$ ein Urbild (Argument, Input) $x \in \mathbb{N}$, so dass $y = f(x) = 2x$ gilt. Diese Menge wird <span style='color: var(--custom-word-green, green)'>Bildmenge</span> der Funktion $f$ genannt.

> [!abstract] Definition
> Für eine Funktion $f: A \rightarrow B$ heisst die Menge $f(a) = \{y \in B | \exists x \in A : f(x) = y\}$ <span style='color: var(--custom-word-green, green)'>Bildmenge</span> von $f$
## Betragsfunktion

> [!abstract] Definition
> Die Funktion $f: \mathbb{Z} \rightarrow \mathbb{Z}$ mit
> $$
> f(x) = |x| = 
> \begin{cases}
> x,  & \text{für } x \ge 0, \\
> -x, & \text{für } x < 0.
> \end{cases}
> \quad \text{heisst Betragsfunktion.}
> $$
>
> Es ist etwas $|7| = 7$ oder $|-8| = 8$ oder $|0| = 0$. Wir bekommen damit also von jeder Zahl die Positive version davon (absoluten Betrag)
>
> Somit gilt also für die Bildmenge $f(\mathbb{Z}) = \mathbb{N}_0$
### Eigenschaften einer Funktion

![[Monotonie#^definition]]

![[Injektivität#^definition]]

![[Surjektivität#^definition]]

![[Bijektivität#^definition]]

> [!example]+ Beispiel 1
> Es seien $A = \{\text{alle Studierenden dieser Klasse}\}$ und $B = \{\text{alle möglichen Email-Adressen}\}$
>
> es sei $F: A \rightarrow B$ definiert durch $F(x) =$ FHNW-Email-Adresse von $x$
>
> Dann ist $F$ injektiv, da verschiedene Studierende verschiedene FHNW-Email-Adressen haben.
>
> $F$ ist nicht surjektiv, da es kein $x \in A$ gibt mit $F(x) = \text{andreas.vogt@fhnw.ch}$ (Nicht jede Email aus $B$ hat ein $x$ zugewiesen bekommen)
### Alle Eigenschaften von Funktionen

![[Eigenschaften einer Funktion.base]]

## Verknüpfung von Funktionen

Es sei $F: A \rightarrow B$ eine Funktion von $A$ nach $B$ und $G: B \rightarrow C$.

![[6-funktionen 2026-10-25 13.09.21.excalidraw||100%]]

Dann ist die Verknüpfung $G \circ F$ wieder eine Funktion, und zwar von $A$ nach $C$.

Für die Funktion $G \circ F$ gilt $(G \circ F)(a) = G(F(a))$.

Wie bei Programmiersprachen wird die Funktion welche näher am Argument steht zuerst ausgewertet.

Begründen können wir das damit da $F$ eine Funktion ist, existiert zu jedem $a \in A$ genau ein $b \in B$ mit $aFb$ (Es ist also $b = F(a)$)
Und da $G$ eine Funktion ist, existiert genau ein $c \in C$ mit $bGc$ (Es ist also $c = G(b)$)

Definitionsgemäss ist also $a(G \circ F)c$ bzw. $c = (G \circ F)(a)$

Siehe: [[5-relationen#Verknüpfen]]

> [!example]+ Beispiel
> Es seien $F: \mathbb{R} \rightarrow \mathbb{R}$ definiert durch $F(x) = x^2$ und $G: \mathbb{R} \rightarrow \mathbb{R}$ definiert durch $G(x) = x + 1$
>
> Dann gilt $(G \circ F)(x) = G(F(x)) = G(x^2) = x^2 + 1$
>
>![[6-funktionen_richtige_verknüpfung]]
>
> und $(F \circ G)(x) = F(G(x)) = F(x + 1) = (x + 1)^2$
>
>![[6-funktionen_umgekehrte_verknüpfung]]
>
> Somit wäre also zb. $(G \circ F)(3) = 10$ und $(F \circ G)(3) = 16$

> [!warning]+ Beispiel
> Verknüpfungen von [[5-relationen|Relationen]] sind nicht [[kommutativ]]
## Inverse Funktionen

Betrachten wir folgende Relation:
$A = \{\text{alle Städte der Schweiz}\}$ und $B = \{\text{alle Kantone der Schweiz}\}$
$F = \{(x,y) \in A \times B \text{ } | \text{ x liegt in y}\}$

Diese Relation ist ebenfalls eine [[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion|Funktion]].

Ist die inverse Relation auch eine Funktion? $F^{-1} = \{(y,x) \in B \times A \text{ } | \text{ y enthält x}\}$

Nein, jedes $y \in B$, also jeder Kanton, steht mit mehreren Städten in Relation.

![[6-funktionen 2026-10-25 13.57.15.excalidraw]]

Somit stellt sich die Frage: Wann ist die inverse Relation einer Funktion wieder eine Funktion?

Die ursprüngliche [[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion|Funktion]] muss einerseits [[Injektivität|injektiv]] und [[Surjektivität|surjektiv]] (Also [[Bijektivität|bijektiv]]) sein damit man sie umkehren kann und sie immer noch eine Funktion ist.

> [!abstract] Satz
> Es sei $F: A \rightarrow B$ eine [[Bijektivität#^definition|bijektive]] Funktion. Dann ist <span style='color: var(--custom-word-green, green)'>$F^{-1}: B \rightarrow A$</span> eine Funktion, die sogenannte <span style='color: var(--custom-word-green, green)'>inverse Funktion zu $F$</span> oder <span style='color: var(--custom-word-green, green)'>Umkehrfunktion von $F$</span>.

> [!example]+ Beispiel 1
> ![[6-funktionen 2026-10-25 14.18.53.excalidraw||100%]]

> [!example]+ Beispiel 2
> $F: \mathbb{R} \rightarrow \mathbb{R}$ mit $F(x) = 2 * x$ ist [[Bijektivität#^definition|bijektiv]].
> Es ist $F^{-1}: \mathbb{R} \rightarrow \mathbb{R}$ mit $F^{-1}(y) = \frac{1}{2}y$

Die Umkehrfunktion wird bestimmt, in dem man die Gleichung $F(x) = y$ nach $x$ auflöst.
### Winkelhalbierende

Für eine Funktion $F$, deren Definitionsbereich und Wertebereich aus Zahlen bestehen, ergibt sich die Darstellung von $F^{-1}$ im Koordinatensystem aus der von $F$ durch Spiegelung an der ersten Winkelhalbierenden

> [!example]+ Beispiel
> für $F: \mathbb{R} \rightarrow \mathbb{R}$ mit $F(x) = 2x$
> ist $F^{-1}: \mathbb{R} \rightarrow \mathbb{r}$ mit $F^{-1}(y) = \frac{1}{2}y$
>
> ![[6-funktionen 2026-10-25 14.48.40.excalidraw]]

## Asymptotisches Verhalten von Funktionen


siehe prog1 [[W05-Komplexitätsanalyse & O-Notation]]

![[W05-Komplexitätsanalyse & O-Notation#Rechenregeln]]