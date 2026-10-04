---
title: "MGLI Lektion 2: Prädikate und Quantoren"
date: 2026-09-21
published: true
video: https://tube.switch.ch/videos/OBnsdSWRgx
---
## Prädikate

**Definition**
Ein Satz `A(x1, ..., xn)` der durch Einsetzen von Elementen für die `n` Variablen zu einer [Aussage](./1-aussagen) wird, heisst *n-stelliges Prädikat* oder *Aussageform*.

**Beispiele**

`A(x): "x ist ein Land in Europa"` ist ein 1-stelliges Prädikat
`A(Italien)` ist wahr, `A(USA)` ist falsch.

`A(x, y): "x ist eine Stadt in y"` ist ein 2-stelliges Prädikat
`A(Rom, Italien)` ist wahr, `A(Bern, Italien)` ist falsch.

## Quantoren

### Definition $\exists$ (Existenzquantor)
Es sei `A(x)` ein 1-stelliges Prädikat und $M$ eine Menge. Dann ist `∃x ∈ M: A(x)` eine Aussage, die genau dann wahr ist, wenn ein Element in $\exists$ existiert, so das `A(x)` wahr wird, wenn man dieses Element für x einsetzt. $\exists$ heisst *Existenzquantor*.

**Beispiel**
Es sei A(x): "x ist ein Land in Europa"

```
M1 = {Italien, Schweiz, USA}
M2 = {Kenia, Japan, USA}
```

Dann ist die Aussage `∃x ∈ M1: A(x)` (Es existiert ein x aus M1) **wahr**, weil es hier mindestens eine Sache in der Liste gibt die Stimmt.
Dann ist die Aussage `∃x ∈ M2: A(x)` (Es existiert ein x aus M2) **falsch**, weil es hier keine einzige Sache gibt in der Liste mit der das Prädikat stimmt.

### Definition $\forall$ (Allquantor)
für den *Allquantor* müssen **alle** Aussagen mit den Werten aus der Menge wahr sein.

**Beispiel**
Es sei A(x): "x ist ein Land in Europa"

```
M1 = {Italien, Schweiz, USA}
M2 = {Italien, Schweiz}
```

Dann ist die Aussage `∀x ∈ M1: A(x)` (gesprochen: Für alle x aus M1) **falsch**, weil es hier mindestens eine Sache in der Liste gibt die nicht Stimmt und es müssten alle stimmen.
Dann ist die Aussage `∀x ∈ M2: A(x)` (gesprochen: Für alle x aus M2) **wahr**, weil hier alle (2) stimmen.

### 2-Stellige Prädikate
Es sei A(x, y): "x ist ein Land in y"

Dann ist zb. `∀x ∈ M1: A(x, y)` noch keine Aussage, weil wir noch einen Wert für `y` einfüllen müssen. Dazu können wir noch einen weiteren Quantor (egal welchen) darüber stülpen zb. `∀x ∈ M1: ( ∀y ∈ M2: A(x, y))` (gesprochen: für alle x aus M1 und für alle y aus M2 gilt A(x, y))

## Konventionen
### Innere Klammer weglassen
Wie oben gesehen haben wir verschachtelte Klammern gemacht für die verschachtelten Quantoren, dies ist aber nicht nötig, man kann es auch gleich einfach hintereinander schreiben.

### Zusammenschreiben
Das hier ist ebenfalls möglich `∀x,y ∈ M1: A(x, y)` man muss nicht zwei mal "Für alle schreiben".

## Die Reihenfolge der Quantoren ist nicht egal!
Es sei denn die Quantoren sind alle vom gleichen Typ.

**Beispiel:**
Es sei M dei Menge aller Studierenden der FHNW, F ein Menge von Filmen un K(x,y) das Prädikat definiert durch "Die Person x hat schon einmal den Film y gesehen."

Dann bedeutet
```
∀x ∈ M, ∃y ∈ F: K(x,y)
```
Jeder Studierende der FHNW hat schon einmal einen Film geschaut.
oder anders gesagt: "Für jedes x gibt es mindestens ein (oder mehr) y"

Umgekehrt dann
```
∃y ∈ F, ∀x ∈ M: K(x,y)
```

Es gibt (mindestens) einen spezifischen Film, welchen alle gesehen haben.
oder anders gesagt: "Für ein (mindestens) ein x müssen alle y stimmen."

## Genaue Quantoren
Wollen wir sicherstellen dass es **genau** ein Element gibt mit dem die Aussage stimmt gibt es mehrere Möglichkeiten:

### 1. Beispiel

```
∃x ∈ M: (P(x) ∧ ∀y ∈ M: (P(y) ⇒ (x = y)))
```

gesprochen: Es existiert ein x aus M sodass P(x) gilt und auch für alle y aus M sodass wenn P(y) gilt  x ist gleich y

Die letztere Überprüfung mit dem Allquantor schaut mithilfe der Implikation dass auch wirklich nur dieses eine x zur Richtigkeit führt.
### 2. Beispiel

```
∃x ∈ M: P(x) ∧ ∀x,y ∈ M: ((P(x) ∧ P(y)) ⇒ (x = y))
```
Hier wird ebenfalls die Implikation mit einem Allquantor genutzt, der zweite Teil besagt wenn es eine 2er Kombination gibt dann ging das nur weil es die selbe Zahl wahr.

### 3. Beispiel

```
∃x ∈ M ∀y ∈ M: (P(y) ⇔ (y = x)
```

Das ist die am wenigsten offensichtliche. 
## Negation quantifzierter Prädikate
x ist ein Land in Europa

dann ist: Alle Länder aus M liegen in Europa.
<!--  -->

## Quantoren: Distributivgesetze
<!--  -->



