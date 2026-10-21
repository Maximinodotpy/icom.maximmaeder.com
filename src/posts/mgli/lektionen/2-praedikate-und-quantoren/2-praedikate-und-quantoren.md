---
title: "MGLI Lektion 2: Prädikate und Quantoren"
date: 2026-09-21
published: true
video: https://tube.switch.ch/videos/OBnsdSWRgx
sources:
  - "[[1-Aussagenlogik.pdf]]"
Woche: "2"
schriftliche_notizen: "[[2-praedikate-und-quantoren-übungen]]"
übungs_serie: "[[serie02.pdf]]"
---
## Definition Prädikate

> [!abstract] Definition
> Ein Satz $A(x1, ..., xn)$ der durch Einsetzen von Elementen für die $n$ Variablen zu einer [Aussage](1-aussagen.md) wird, heisst <span style='color: var(--custom-word-green, green)'>$n$-stelliges Prädikat</span> oder <span style='color: var(--custom-word-green, green)'>Aussageform</span>.

> [!example]+ Beispiele
> $A(x): \text{"} x \text{ ist ein Land in Europa"}$ ist ein 1-stelliges Prädikat
> $A(\text{Italien})$ ist wahr, $A(\text{USA})$ ist falsch.
> $A(x, y): \text{"} x \text{ ist eine Stadt in y"}$ ist ein 2-stelliges Prädikat
> $A(\text{Rom}, \text{Italien})$ ist wahr, $A(\text{Bern}, \text{Italien})$ ist falsch.
## Quantoren
### Definition $\exists$ (Existenzquantor)

> [!abstract] Definition
> Es sei $A(x)$ ein 1-stelliges Prädikat und $M$ eine [[4-mengen|Menge]]. Dann ist $\exists x \in M: A(x)$ eine [[1-aussagen|Aussage]], die genau dann wahr ist, wenn ein Element in $M$ existiert, so das $A(x)$ wahr wird, wenn man dieses Element für x einsetzt. $\exists$ heisst <span style='color: var(--custom-word-green, green)'>Existenzquantor</span>.

> [!example] Beispiel
> Es sei A(x): "x ist ein Land in Europa"
>
>$M_1 = \{\text{Italien}, \text{Schweiz}, \text{USA}\}$
>$M_2 = \{\text{Kenia}, \text{Japan}, \text{USA}\}$
>
> Dann ist die Aussage $\exists x \in M_1: A(x)$ <span style='color: var(--custom-word-gesproche-blue)'>gesprochen: (Es existiert ein x aus $M_1$)</span> **wahr**, weil es hier mindestens eine Sache in der Liste gibt die Stimmt.
> Dann ist die Aussage $\exists x \in M2: A(x)$ <span style='color: var(--custom-word-gesproche-blue)'>gesprochen: (Es existiert ein x aus $M_1$)</span> **falsch**, weil es hier keine einzige Sache gibt in der Liste mit der das Prädikat stimmt.
### Definition $\forall$ (Allquantor)

> [!abstract] Definition
> Es sei $A(x)$ ein 1-stelliges Prädikat und $M$ eine [[4-mengen|Menge]]. Dann ist $\forall x \in M: A(x)$ eine [[1-aussagen|Aussage]], die genau dann wahr ist, wenn jedes Element in $M$, so das $A(x)$ wahr wird, wenn man dieses Element für $x$ einsetzt. $\forall$ heisst <span style='color: var(--custom-word-green, green)'>Allquantor</span>.

> [!example]+ Beispiel
> Es sei A(x): "x ist ein Land in Europa"
>
> $M_1 = \{Italien, Schweiz, USA\}$
> $M_2 = \{Italien, Schweiz\}$
>
> Dann ist die Aussage $\forall x \in M_1: A(x)$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alle $x$ aus $M_1$)</span> **falsch**, weil es hier mindestens eine Sache in der Liste gibt die nicht Stimmt und es müssten alle stimmen.
> Dann ist die Aussage $\forall x \in M2: A(x)$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alle $x$ aus $M_2$)</span> **wahr**, weil hier alle (2) stimmen.
### 2-Stellige Prädikate
Es sei A(x, y): "x ist ein Land in y"

> [!example]+ Beispiel
> Dann ist zb. $\forall x \in M1: A(x, y)$ noch keine Aussage, weil wir noch einen Wert für $y$ einfüllen müssen. Dazu können wir noch einen weiteren Quantor (egal welchen) darüber stülpen zb. $\forall x \in M_1: ( \forall y \in M_2: A(x, y))$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: für alle $x$ aus $M_1$ und für alle $y$ aus $M_2$ gilt A(x, y))</span>
## Konventionen
### Innere Klammer weglassen
Wie oben gesehen haben wir verschachtelte Klammern gemacht für die verschachtelten Quantoren, dies ist aber nicht nötig, man kann es auch gleich einfach hintereinander schreiben.
### Zusammenschreiben
Das hier ist ebenfalls möglich $\forall x,y \in M_1: A(x, y)$ man muss nicht zwei mal "Für alle schreiben".
## Die Reihenfolge der Quantoren ist nicht egal!
Es sei denn die Quantoren sind alle vom gleichen Typ.

**Beispiel:**
Es sei $M$ die Menge aller Studierenden der FHNW, $F$ ein Menge von Filmen un $K(x,y)$ das Prädikat definiert durch "Die Person $x$ hat schon einmal den Film $y$ gesehen."

Dann bedeutet
$$
∀x ∈ M, ∃y ∈ F: K(x,y)
$$
<span style='color: var(--custom-word-gesproche-blue)'>Jeder Studierende der FHNW hat schon einmal einen Film geschaut.</span>
oder anders gesagt Für <span style='color: var(--custom-word-gesproche-blue)'>jedes $x$ gibt es mindestens ein (oder mehr) $y$</span>
Umgekehrt dann
$$
\exists y \in F, \forall x ∈ M: K(x,y)
$$
<span style='color: var(--custom-word-gesproche-blue)'>Es gibt (mindestens) einen spezifischen Film, welchen alle gesehen haben.</span>
oder anders gesagt <span style='color: var(--custom-word-gesproche-blue)'>Für  (mindestens) ein ein $x$ müssen alle $y$ stimmen.</span>

## Genaue Quantoren
Wollen wir sicherstellen dass es **genau** ein Element gibt mit dem die Aussage stimmt gibt es mehrere Möglichkeiten:

### 1. Beispiel
$$
∃x ∈ M: (P(x) ∧ ∀y ∈ M: (P(y) ⇒ (x = y)))
$$
<span style='color: var(--custom-word-gesproche-blue)'>gesprochen: Es existiert ein x aus M sodass P(x) gilt und auch für alle y aus M sodass wenn P(y) gilt  x ist gleich y</span>

Die letztere Überprüfung mit dem Allquantor schaut mithilfe der Implikation dass auch wirklich nur dieses eine $x$ zur Richtigkeit führt.
### 2. Beispiel
$$
∃x ∈ M: P(x) ∧ ∀x,y ∈ M: ((P(x) ∧ P(y)) ⇒ (x = y))
$$
Hier wird ebenfalls die Implikation mit einem Allquantor genutzt, der zweite Teil besagt wenn es eine 2er Kombination gibt dann ging das nur weil es die selbe Zahl wahr.
### 3. Beispiel
$$
\exists x \in M, \forall y \in M: (P(y) ⇔ (y = x))
$$
Das ist die am wenigsten offensichtliche.

![[2-praedikate-und-quantoren 2026-10-21 14.56.44.excalidraw||100%]]
## Negation (quantifizierter) Prädikate
$A(x): \text{"}x \text{ ist eine Land in Europa"}$ und $M$ die Menge von Ländern.
### Allquantoren
Dann ist die Negation der Aussage **"Alle Länder aus $M$ liegen in Europa"**
**"Nicht alle Länder aus $M$ liegen in Europa"**

Oder anders ausgedrückt: "Es gibt ein Land in $M$, welches nicht in Europa liegt"

Also $\neg(\forall x \in M : (x))$ hat den selben Wahrheitswert wie $\exists x \in M: (\neg A(x))$

### Existenzquantoren
Dann ist die Negation der Aussage **"Es existiert ein Land aus $M$, welches in Europa liegt"**
**"Es existiert kein Land in $M$, welches in Europa liegt"**


Oder anders ausgedrückt: "Alle Länder liegen nicht in Europa"

Also $\neg (\exists x \in M: A(x))$ hat denselben Wahrheitswert wie $\forall x \in M: (\neg A(x))$

### Quantifizierte Aussagen

> [!abstract] Definition
> Quantifizierte Aussagen negiert man, in dem man aus jedem Existenzquantor einen Allquantor macht und umgekehrt die Aussageform negiert.

> [!example]+ Beispiel
> Es sei $A(x,y): \text{"Person } x \text{" war schon einaml im Land } x \text{"}$

![[Pasted image 20261019134430.png]]
^negationeinfacherquantor

## Quantoren: Distributivgesetze
![[Pasted image 20261019134552.png]]
^distributivgesetzevonquantoren


