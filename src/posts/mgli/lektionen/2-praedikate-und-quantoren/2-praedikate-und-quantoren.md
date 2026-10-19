---
title: "MGLI Lektion 2: Prädikate und Quantoren"
date: 2026-09-21
published: true
video: https://tube.switch.ch/videos/OBnsdSWRgx
sources:
  - "[[1-Aussagenlogik.pdf]]"
Woche: "2"
---
## Definition Prädikate
Ein Satz $A(x1, ..., xn)$ der durch Einsetzen von Elementen für die $n$ Variablen zu einer [Aussage](1-aussagen.md) wird, heisst <span style='color: var(--custom-word-green, green)'>$n$-stelliges Prädikat</span> oder <span style='color: var(--custom-word-green, green)'>Aussageform</span>.

> [!example]+ Beispiele
> $A(x): \text{"} x \text{ ist ein Land in Europa"}$ ist ein 1-stelliges Prädikat
> $A(\text{Italien})$ ist wahr, $A(\text{USA})$ ist falsch.
> $A(x, y): \text{"} x \text{ ist eine Stadt in y"}$ ist ein 2-stelliges Prädikat
> $A(\text{Rom}, \text{Italien})$ ist wahr, $A(\text{Bern}, \text{Italien})$ ist falsch.
## Quantoren
### Definition $\exists$ (Existenzquantor)
Es sei $A(x)$ ein 1-stelliges Prädikat und $M$ eine [[4-mengen|Menge]]. Dann ist $∃x ∈ M: A(x)$ eine [[1-aussagen|Aussage]], die genau dann wahr ist, wenn ein Element in $\exists$ existiert, so das $A(x)$ wahr wird, wenn man dieses Element für x einsetzt. $\exists$ heisst <span style='color: var(--custom-word-green, green)'>Existenzquantor</span>.

> [!example] Beispiel
> Es sei A(x): "x ist ein Land in Europa"
>
>$M_1 = \{\text{Italien}, \text{Schweiz}, \text{USA}\}$
>$M_2 = \{\text{Kenia}, \text{Japan}, \text{USA}\}$
>
> Dann ist die Aussage `∃x ∈ M1: A(x)` <span style='color: var(--custom-word-gesproche-blue)'>gesprochen: (Es existiert ein x aus M1)</span> **wahr**, weil es hier mindestens eine Sache in der Liste gibt die Stimmt.
> Dann ist die Aussage `∃x ∈ M2: A(x)` <span style='color: var(--custom-word-gesproche-blue)'>gesprochen: (Es existiert ein x aus M2)</span> **falsch**, weil es hier keine einzige Sache gibt in der Liste mit der das Prädikat stimmt.
### Definition $\forall$ (Allquantor)
für den <span style='color: var(--custom-word-green, green)'>Allquantor</span> müssen **alle** [[1-aussagen|Aussagen]] mit den Werten aus der [[4-mengen|Menge]] wahr sein.

> [!example]+ Beispiel
> Es sei A(x): "x ist ein Land in Europa"
>
> $M_1 = {Italien, Schweiz, USA}$
> $M_2 = {Italien, Schweiz}$
>
> Dann ist die Aussage `∀x ∈ M1: A(x)` <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alle x aus M1)</span> **falsch**, weil es hier mindestens eine Sache in der Liste gibt die nicht Stimmt und es müssten alle stimmen.
> Dann ist die Aussage `∀x ∈ M2: A(x)` <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alle x aus M2)</span> **wahr**, weil hier alle (2) stimmen.
### 2-Stellige Prädikate
Es sei A(x, y): "x ist ein Land in y"

> [!example]+ Beispiel
> Dann ist zb. `∀x ∈ M1: A(x, y)` noch keine Aussage, weil wir noch einen Wert für `y` einfüllen müssen. Dazu können wir noch einen weiteren Quantor (egal welchen) darüber stülpen zb. `∀x ∈ M1: ( ∀y ∈ M2: A(x, y))` <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: für alle x aus M1 und für alle y aus M2 gilt A(x, y))</span>
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
Jeder Studierende der FHNW hat schon einmal einen Film geschaut.
oder anders gesagt: "Für jedes x gibt es mindestens ein (oder mehr) y"
Umgekehrt dann
$$
∃y ∈ F, ∀x ∈ M: K(x,y)
$$
Es gibt (mindestens) einen spezifischen Film, welchen alle gesehen haben.
oder anders gesagt: "Für ein (mindestens) ein x müssen alle y stimmen."

## Genaue Quantoren
Wollen wir sicherstellen dass es **genau** ein Element gibt mit dem die Aussage stimmt gibt es mehrere Möglichkeiten:

### 1. Beispiel
$$
∃x ∈ M: (P(x) ∧ ∀y ∈ M: (P(y) ⇒ (x = y)))
$$
<span style='color: var(--custom-word-gesproche-blue)'>gesprochen: Es existiert ein x aus M sodass P(x) gilt und auch für alle y aus M sodass wenn P(y) gilt  x ist gleich y</span>

Die letztere Überprüfung mit dem Allquantor schaut mithilfe der Implikation dass auch wirklich nur dieses eine x zur Richtigkeit führt.
### 2. Beispiel
$$
∃x ∈ M: P(x) ∧ ∀x,y ∈ M: ((P(x) ∧ P(y)) ⇒ (x = y))
$$
Hier wird ebenfalls die Implikation mit einem Allquantor genutzt, der zweite Teil besagt wenn es eine 2er Kombination gibt dann ging das nur weil es die selbe Zahl wahr.
### 3. Beispiel
$$
∃x ∈ M ∀y ∈ M: (P(y) ⇔ (y = x)
$$
Das ist die am wenigsten offensichtliche.
## Negation quantifzierter Prädikate

![[Pasted image 20261019134430.png]]
^negationeinfacherquantor

## Quantoren: Distributivgesetze
![[Pasted image 20261019134552.png]]
^distributivgesetzevonquantoren


