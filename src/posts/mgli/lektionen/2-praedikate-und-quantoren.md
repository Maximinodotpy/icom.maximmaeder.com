---
title: "MGLI Lektion 2: Prädikate und Quantoren"
date: 2026-09-21
published: true
video: https://tube.switch.ch/videos/OBnsdSWRgx
---
## Prädikate

**Definition**
Ein Satz `A(x1, ..., xn)` der durch Einsetzen von Elementen für die `n` Variablen zu einer Aussage wird, heisst *n-stelliges Prädikat* oder *Aussageform*.

**Beispiele**

`A(x): "x ist ein Land in Europa"` ist ein 1-stelliges Prädikat
`A(Italien)` ist wahr, `A(USA)` ist falsch.

`A(x, y): "x ist eine Stadt in y"` ist ein 2-stelliges Prädikat
`A(Rom, Italien)` ist wahr, `A(Bern, Italien)` ist falsch.

## Quantoren

### Definition ∃ (Existenzquantor)
Es sei `A(x)` ein 1-stelliges Prädikat und `M` eine Menge. Dann ist `∃x ∈ M: A(x)` eine Aussage, die genau dann wahr ist, wenn ein Element in `M` existiert, so das `A(x)` wahr wird, wenn man dieses Element für x einsetzt. ∃ heisst *Existenzquantor*.

**Beispiel**
Es sei A(x): "x ist ein Land in Europa"

```
M1 = {Italien, Schweiz, USA}
M2 = {Kenia, Japan, USA}
```

Dann ist die Aussage `∃x ∈ M1: A(x)` (Es existiert ein x aus M1) **wahr**, weil es hier mindestens eine Sache in der Liste gibt die Stimmt.
Dann ist die Aussage `∃x ∈ M2: A(x)` (Es existiert ein x aus M2) **falsch**, weil es hier keine einzige Sache gibt in der Liste mit der das Prädikat stimmt.

### Defintion ∀ (Allquantor)
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
<!-- 1. Beispiel -->
<!-- 2. Beispiel -->
<!-- 3. Beispiel -->
## Negation quantifzierter Prädikate
x ist ein Land in Europa

dann ist: Alle Länder aus M liegen in Europa.
<!--  -->

## Quantoren: Distributivgesetze
<!--  -->


<!-- ∪ ∩ ∖ △ ᶜ × 𝒫
∈ ∉ ⊆ ⊂ ⊄ ⊇ ⊃
∅ ℕ ℤ ℚ ℝ ℂ
∀ ∃ ¬ ∧ ∨ ⇒ ⇔ -->


