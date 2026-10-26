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
cssclasses:
  - hide-embedded-headers
---
## Definition der Funktion

![[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion]]

> [!example]+ Beispiel 1
> Es seien  $A = \{\text{Alle Studierenden dieser Klasse}\}$ und $B = \{\text{alle möglichen Noten}\}$
> Dann ist $F$ mit $xFy$ wenn $y$ die Note von $x$ in diesem Modul ist, eine Funktion von $A$ nach $B$.
> Für einen Studierenden $x$ ist $F(x)$ also die zugehörige Note.

^beispiel1

> [!example]+ Beispiel 2
> Es sei $F = \{ (x,y) \in \mathbb{R} \times \mathbb{R} | y = 2*x \}$
> Dann ist das eine $F$ eine [[1-Einführung, Definition, Steigung und y-Achsenabschnitt|(lineare) Funktion]] von $\mathbb{R}$ nach $\mathbb{R}$
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

![[6-funktionen_studi_beispiel||100%]]

Hier erkennt man das jeder Studierende ein Wert zugewiesen wird, heisst aber nicht dass mehrere Studierende nicht die selbe Note haben könnte.

Somit wären folgende Darstellungen keine Funktionen.

![[6-funktionen_invalide_bipartite_graphen||100%]]

Wenn Definitions- und Wertebereich einer Funktion $F$ aus Zahlen besteht, stellt man die Funktionen oft in einem [[Kartesisches Koordinatensystem]] dar, wobei die horizontale Achse ([[Abszissenachse]]) den Definitionsbereich und die vertikale Achse ([[Ordinatachse]]) den Wertebereich enthält.

![[#^beispiel2]]

```desmos-graph
y = 2x
```

> [!NOTE] Aufgaben: Entscheiden, ob folgende [[5-relationen|Relationen]] Funktionen sind.
> ![[Pasted image 20261023131306.png]]
> Ja, weil eine Stadt kann nur zu einem Kanton gehören (Dass es womöglich viele Städte im selben Kanton hat spielt dabei keine Rolle)
>
> ![[Pasted image 20261023131337.png]]
> Nein, weil nicht alle der Städte der Welt können einem Kanton in der Schweiz zugewiesen werden.
>
> ![[Pasted image 20261023131343.png]]
>Nein, weil so von einem $x$ (Kanton) mehrere [[5-relationen|Relationen]] zu viele Städten ausgehen können.

## Definition der Bildmenge

![[Bildmenge#^definition]]

![[Bildmenge#Beispiel]]
## Definition der Betragsfunktion

![[mgli/Begriffe/Betragsfunktion#^definition]]

## Eigenschaften einer Funktion

### Definition der Monotonie

![[Monotonie#^definition]]

### Definition der Injektivität

![[Injektivität#^definition]]

### Definition der Surjektivität

![[Surjektivität#^definition]]

### Definition der Bijektivität

![[Bijektivität#^definition]]

> [!example]+ Beispiel 1
> Es seien $A = \{\text{alle Studierenden dieser Klasse}\}$ und $B = \{\text{alle möglichen Email-Adressen}\}$
>
> es sei $F: A \rightarrow B$ definiert durch $F(x) =$ FHNW-Email-Adresse von $x$
>
> Dann ist $F$ **injektiv**, da verschiedene Studierende verschiedene FHNW-Email-Adressen haben.
>
> $F$ ist nicht **surjektiv**, da es kein $x \in A$ gibt mit $F(x) = \text{andreas.vogt@fhnw.ch}$ (Nicht jede Email aus $B$ hat ein $x$ zugewiesen bekommen)
>
> Somit ist diese Funktion auch nicht [[Bijektivität|bijektiv]].
### Alle Eigenschaften von Funktionen

![[Eigenschaften einer Funktion.base]]


## Verknüpfung von Funktionen

Es sei $F: A \rightarrow B$ eine Funktion von $A$ nach $B$ und $G: B \rightarrow C$.

![[6-funktionen_verknüfpung_von_funktionen||100%]]
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

![[6-funktionen_inverse_funktion_stadt_beispiel]]

Somit stellt sich die Frage: Wann ist die inverse Relation einer Funktion wieder eine Funktion?

Die ursprüngliche [[1-Einführung Funktionen#^allgemeinedefinitioneinerfunktion|Funktion]] muss einerseits [[Injektivität|injektiv]] und [[Surjektivität|surjektiv]] (Also [[Bijektivität|bijektiv]]) sein damit man sie umkehren kann und sie immer noch eine Funktion ist.

> [!abstract] Satz
> Es sei $F: A \rightarrow B$ eine [[Bijektivität#^definition|bijektive]] Funktion. Dann ist <span style='color: var(--custom-word-green, green)'>$F^{-1}: B \rightarrow A$</span> eine Funktion, die sogenannte <span style='color: var(--custom-word-green, green)'>inverse Funktion zu $F$</span> oder <span style='color: var(--custom-word-green, green)'>Umkehrfunktion von $F$</span>.

> [!example]+ Beispiel 1
> ![[6-funktionen_inverse_relation_beispiel||100%]]

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
> ![[6-funktionen_winkelhalbierende]]
## Asymptotisches Verhalten von Funktionen

Die Laufzeit eines Programms hängt typischerweise von der Eingabegrösse ab.

```java
int[] array = {4, 7, 2, 9, 1, 5};

int sum = 0;

for (int i = 0; i < array.length; i++)
	sum = sum + array[i]
	
System.out.println("Die Summe ist: " + sum)
```

Dieser Algorithmus summiert alle Elemente in einem Array auf. Für jedes Element im Array wird eine Addition ausgeführt. Ausserdem haben wir noch drei Schritte ausserhalb der Schleife.

Wenn wir ein Array mit $n$ Elementen haben, dann führt der Algorithmus also $f(n) = n + 3$ Befehle aus.

> [!abstract] Definition
> Die <span style='color: var(--custom-word-green, green)'>Laufzeit</span> eines Programms wird als Anzahl der ausgeführten Befehle in Abhängigkeit der Eingabelänge $n$ durch eine Funktion $f(n)$ definiert.

> [!warning] Problem
> Die genaue Anzahl an Befehlen für Eingaben einer festen Länge n zu zählen ist sehr aufwändig, bzw. fast nicht möglich. Das hängt des weiteren auch von der Programmiersprache ab.
>
> Wir brauchen die genau Anzahl Schritte aber sowieso nicht. Wir fokussieren uns auf das <span style='color: var(--custom-word-green, green)'>Wachstumsverhalten</span> der Funktion, insbesondere für grössere Eingaben.
>
> Damit stellen wir die frage, ob sich die Laufzeit verdoppelt wenn man auch die Eingabe verdoppelt. Oder verzehnfacht sich die Laufzeit bei Verdoppelung der Eingabe.
>
> Somit finden wir die Praktibalität eines Algorithmus.

> [!abstract] Definition
> Es seien $f,g: \mathbb{N} \rightarrow R$ zwei Funktionen. Dann ist
> $$
> f(n) \in \mathcal{O}(g(n))
> $$
> Es existiert ein $n_0 \in \mathbb{N}$ und ein $c \in \mathbb{N}$, so dass für alle $n \ge n_0$ gilt $f(n) \le c * g(n)$
> $f$ wächst also asymptotisch <u>nicht schneller</u> als $g$.
>
> $$
> f(n) \in \Omega(n)
> $$
> Es existiert ein $n_0 \in \mathbb{N}$ und ein $d \in \mathbb{N}$, so dass für alle $n \ge n_0$ gilt $f(n) \ge \frac{1}{d} * g(n)$
> $f$ wächst asymptotisch <u>mindestens</u> so schnell wie g.
>
> $$
> f(n) \in \Theta(n)
> $$
> Es gilt $f(n) \in \mathcal{O}(g(n))$ und $f(n) \in \Omega(g(n))$
> $f$ und $g$ sind asymptotisch <u>gleich</u>.

> [!example]+ Beispiel
> 1. $7n + 4 \in \mathcal{O}(n)$
>    Für alle $n \ge n_0 = 4$ ist $f(n) = 7n + 4 \le 7n + n = 8n = c * g(n)$
> 2. $\frac{1}{2}n^2 + 5n - 4 \in \mathcal{O}(n^2)$
>    Für alle $n \ge 1$ ist $\frac{1}{2}n^2 + 5n - 4 \le n^2 + 5n^2 = 6n^2$
> 3. $n^2 \notin \mathcal(n)$
>    Sonst müssten Zahlen $n_0$ und $c$ existieren mit $n^2 \le c * n$ für alle $n \ge n_0$

Siehe: [[W05-Komplexitätsanalyse & O-Notation]]
## Rechenregeln
![[W05-Komplexitätsanalyse & O-Notation#Rechenregeln]]

## Lernziele

- [ ] ==🟢Sie können prüfen, ob eine Relation eine Funktion ist.
- [ ] ==🟢Sie kennen die Definition der Definitions- und der Wertemenge.
- [ ] Sie kennen übliche Darstellungen von Funktionen, wie z. B. die Darstellung als Funktionsgraph und als Zuordnung f : A → B mit f (x ) = y .
- [ ] Sie kennen die Definition des Arguments (Urbild, Input).
- [ ] Sie können die Bildmenge einer Funktion bestimmen.
- [ ] Sie verstehen die Betragsfunktion.
- [ ] Sie können überprüfen, ob eine Funktion – surjektiv, – injektiv, – bijektiv, – (streng) monoton steigend/fallend ist und erkennen diese Eigenschaften in allen Darstellungen von Funktionen.
- [ ] Sie wissen, wann zwei Funktionen f und g zu g ◦ f verknüpft werden können und können diese Verknüpfung gegebenenfalls bestimmen.
- [ ] Sie wissen, dass die Verknüpfung von Funktionen nicht kommutativ ist.
- [ ] Sie wissen, wann für eine Funktion f die inverse Funktion f −1 existiert und können diese gegebe- nenfalls bestimmen.
- [ ] Sie verstehen, wie die inverse Funktion einer invertierbaren Funktion im Funktionsgraphen graphisch dargestellt werden kann.
 - [ ] Sie haben verstanden, dass die Laufzeit von Programmen als Funktion der Eingabelänge beschrieben werden kann.
 - [ ] Sie verstehen die O -Notation und können Funktionen danach beurteilen.
 - [ ] Sie können die Laufzeit von einfachen Programmen in der O -Notation bestimmen.
 - [ ] Sie kennen die wichtigsten Zeitkomplexitäten: n, log(n), n2, 2n ,. . .
 - [ ] Sie kennen die wichtigsten Rechenregeln für die O -Notation und können diese einsetzen, um Funk- tionen bezüglich ihrer Komplexitätsklasse zu beurteilen.