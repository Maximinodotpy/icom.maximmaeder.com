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
aliases:
  - quantoren
  - quantor
  - Quantoren
  - Quantor
---
## Definition [[Prädikat|Prädikate]]

![[Prädikat#^definition]]

![[Prädikat#^beispiel]]
## Quantoren
### Definition $\exists$ (Existenzquantor)

![[Existensquantor#^definition]]

![[Existensquantor#^beispiel]]
### Definition $\forall$ ([[Allquantor]])

![[Allquantor#^definition]]

![[Allquantor#^beispiel]]

![[Prädikat#2-Stellige Prädikate]]
## Konventionen
### Innere Klammer weglassen
Wie oben gesehen haben wir verschachtelte Klammern gemacht für die verschachtelten Quantoren, dies ist aber nicht nötig, man kann es auch gleich einfach hintereinander schreiben.
### Zusammenschreiben
Das hier ist ebenfalls möglich $\forall x,y \in M_1: A(x, y)$ man muss nicht zwei mal "Für alle schreiben".
## Die Reihenfolge der Quantoren ist nicht egal!
Es sei denn die Quantoren sind alle vom gleichen Typ.

**Beispiel:**
Es sei $M$ die [[4-mengen|Menge]] aller Studierenden der FHNW, $F$ ein [[4-mengen|Menge]] von Filmen un $K(x,y)$ das [[Prädikat]] definiert durch "Die Person $x$ hat schon einmal den Film $y$ gesehen."

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
Wollen wir sicherstellen dass es **genau** ein Element gibt mit dem die [[1-aussagen|Aussage]] stimmt gibt es mehrere Möglichkeiten:

### 1. Beispiel
$$
∃x ∈ M: (P(x) ∧ ∀y ∈ M: (P(y) ⇒ (x = y)))
$$
<span style='color: var(--custom-word-gesproche-blue)'>gesprochen: Es [[Existensquantor|existiert]] ein x aus M sodass P(x) gilt und auch für alle y aus M sodass wenn P(y) gilt  x ist gleich y</span>

Die letztere Überprüfung mit dem [[Allquantor]] schaut mithilfe der Implikation dass auch wirklich nur dieses eine $x$ zur Richtigkeit führt.
### 2. Beispiel
$$
∃x ∈ M: P(x) ∧ ∀x,y ∈ M: ((P(x) ∧ P(y)) ⇒ (x = y))
$$
Hier wird ebenfalls die Implikation mit einem [[Allquantor]] genutzt, der zweite Teil besagt wenn es eine 2er Kombination gibt dann ging das nur weil es die selbe Zahl wahr.
### 3. Beispiel
$$
\exists x \in M, \forall y \in M: (P(y) ⇔ (y = x))
$$
Das ist die am wenigsten offensichtliche.

![[2-praedikate-und-quantoren 2026-10-21 14.56.44.excalidraw||100%]]
## Negation (quantifizierter) [[Prädikat|Prädikate]]
$A(x): \text{"}x \text{ ist eine Land in Europa"}$ und $M$ die [[4-mengen|Menge]] von Ländern.
### Allquantoren
Dann ist die Negation der [[1-aussagen|Aussage]] **"Alle Länder aus $M$ liegen in Europa"**
**"Nicht alle Länder aus $M$ liegen in Europa"**

Oder anders ausgedrückt: "Es gibt ein Land in $M$, welches nicht in Europa liegt"

Also $\neg(\forall x \in M : (x))$ hat den selben Wahrheitswert wie $\exists x \in M: (\neg A(x))$

### Existenzquantoren
Dann ist die Negation der [[1-aussagen|Aussage]] **"Es [[Existensquantor|existiert]] ein Land aus $M$, welches in Europa liegt"**
**"Es [[Existensquantor|existiert]] kein Land in $M$, welches in Europa liegt"**


Oder anders ausgedrückt: "Alle Länder liegen nicht in Europa"

Also $\neg (\exists x \in M: A(x))$ hat denselben Wahrheitswert wie $\forall x \in M: (\neg A(x))$

### Quantifizierte [[1-aussagen|Aussagen]]

> [!abstract] Definition
> Quantifizierte [[1-aussagen|Aussagen]] negiert man, in dem man aus jedem Existenzquantor einen [[Allquantor]] macht und umgekehrt die Aussageform negiert.

> [!example]+ Beispiel
> Es sei $A(x,y): \text{"Person } x \text{" war schon einaml im Land } x \text{"}$

![[Pasted image 20261019134430.png]]
^negationeinfacherquantor

## Quantoren: Distributivgesetze
![[Pasted image 20261019134552.png]]
^distributivgesetzevonquantoren


