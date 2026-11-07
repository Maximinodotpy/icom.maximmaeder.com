---
aliases:
  - prädikat
  - prädikate
  - Prädikat
  - Prädikate
---
> [!abstract] Definition
> Ein Satz $A(x1, ..., xn)$ der durch Einsetzen von Elementen für die $n$ Variablen zu einer [Aussage](1-aussagen.md) wird, heisst <span style='color: var(--custom-word-green, green)'>$n$-stelliges Prädikat</span> oder <span style='color: var(--custom-word-green, green)'>Aussageform</span>.

^definition

> [!example]+ Beispiele
> $A(x): \text{"} x \text{ ist ein Land in Europa"}$ ist ein 1-stelliges Prädikat
> $A(\text{Italien})$ ist wahr, $A(\text{USA})$ ist falsch.
> $A(x, y): \text{"} x \text{ ist eine Stadt in y"}$ ist ein 2-stelliges Prädikat
> $A(\text{Rom}, \text{Italien})$ ist wahr, $A(\text{Bern}, \text{Italien})$ ist falsch.

^beispiel
### 2-Stellige Prädikate
Es sei A(x, y): "x ist ein Land in y"

> [!example]+ Beispiel
> Dann ist zb. $\forall x \in M1: A(x, y)$ noch keine Aussage, weil wir noch einen Wert für $y$ einfüllen müssen. Dazu können wir noch einen weiteren [[2-praedikate-und-quantoren|Quantor]] (egal welchen) darüber stülpen zb. $\forall x \in M_1: ( \forall y \in M_2: A(x, y))$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: für alle $x$ aus $M_1$ und für alle $y$ aus $M_2$ gilt A(x, y))</span>