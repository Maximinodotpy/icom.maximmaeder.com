---
title: "MGLI Lektion 5: Relationen"
date: 2026-10-12
published: true
video: https://tube.switch.ch/videos/Kcgb5G6wNs
sources:
  - "[[5-Relationen.pdf]]"
---
## Binäre Relation

## Eigenschaften

- Eine Relation ist <span style='color: var(--custom-word-green, green)'>reflexiv</span>, falls $\forall x \in M : xRx$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Alle $x$ aus $M$ stehen in relation mit sich selber)</span>
  ^relationreflexiv
- Eine Relation ist <span style='color: var(--custom-word-green, green)'>symmetrisch</span> falls $\forall x,y \in M: xRy \Rightarrow yRx$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: für alle $x$ aus $M$ gilt dass wenn $x$ in einer relation mit $y$ steht dann steht aber $y$ in einer relation mit $x$)</span>
  ^relationsymmetrisch
- Eine Relation ist <span style='color: var(--custom-word-green, green)'>antisymmetrisch</span> falls $\forall x,y \in M: xRy \Rightarrow (\neg(yRx)\lor x = y)$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alles $x$ und $y$ Tupel aus $M$ gilt dass wenn wenn $x$ in relation zu $y$ steht dann darf $y$ nicht in relation mit $x$ stehen oder $x$ sollte gleich $y$ sein)</span>
  ^relationantisymmetrisch
- eine Relation ist <span style='color: var(--custom-word-green, green)'>transitiv</span> falls
  ^relationtransitiv

> [!example]+ Beispiel 1
> $R = \{(a, b), (b, a), (a, c), (b, b), (b, c)\}$ auf $M = \{a,b,c\}$
> 
> nicht reflex:
> usw 

> [!example]+ Beispiel 2
> $R = \{(x,y) \in M \times M | x \text{ und } y \text{ haben eine gemeinsame Grossmutter}\}$

> [!example]+ Beispiel 3:
> $R = \{(x, y) \in \mathbb{N} \times \mathbb{N}|x = y\}$
## Verknüpfen

> [!warning] Warnung
> Umgekehrte Notation in der Literatur
## Inverse Relation

## Äquivalenzrelationen

falls [[#^relationreflexiv|reflex]], [[#^relationsymmetrisch|symmetrisch]] und [[#^relationtransitiv|transitiv]].

### Äquivalenzklassen