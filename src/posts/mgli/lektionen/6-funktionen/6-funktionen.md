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

## Inverse Funktionen

## Asymptotisches Verhalten von Funktionen

siehe prog1 [[W05-Komplexitätsanalyse & O-Notation]]

![[W05-Komplexitätsanalyse & O-Notation#Rechenregeln]]