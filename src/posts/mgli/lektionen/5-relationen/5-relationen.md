---
title: "MGLI Lektion 5: Relationen"
date: 2026-10-12
published: true
video: https://tube.switch.ch/videos/Kcgb5G6wNs
sources:
  - "[[5-Relationen.pdf]]"
---
## Binäre Relation

> [!abstract] Definition
>Es seien $A,B$ Mengen. Eine <span style='color: var(--custom-word-green, green)'>binäre Relation $R$ von $A$ nach $B$</span> ist eine [[4-mengen#Definition Teilmenge ($ subseteq$ und $ supseteq$)|Teilmenge]] von $A \times B$. Es gilt also $R \subseteq A \times B$. (Es ist eine Teilmenge der [[4-mengen#Kartesisches Produkt|geordneten Paare]])
>
> Wenn $A = B$ sagt man dass <span style='color: var(--custom-word-green, green)'>$R$ eine Relation auf $A$</span> ist. Dann heisst $R$ <span style='color: var(--custom-word-green, green)'>homogen</span>, andernfalls <span style='color: var(--custom-word-green, green)'>heterogen</span>.
>
> Anstelle von $(a,b) \in R$ schreibt man oft $aRb$ und sagt: $a$ steht bzgl. $R$ zu $b$ in Relation.

> [!example]+ Beispiel 1: Stammbaum
> Wir haben folgende Menge mit Personen $M = \{Suzanne, Peter, Lisa, Niocle, Hans, Laura, Fritz, Julia\}$
>
> und folgenden Stammbaum.
> ![[5-relationen 2026-10-15 11.08.13.excalidraw||100%]]
>
> Daraus könnten wir nun folgende Relationsteilmengen definieren:
> Es  sei $R = \{(x,y) \in M \times M | x \text{ ist Grossvater von } y\}$
> also $R = \{(\text{Peter}, \text{Fritz}), (\text{Peter}, \text{Julia})\}$
> Peter steht bzgl. $R$ in Relation mit Fritz, aber nicht mit Laura.
>
> Das ist somit auch eine heterogene Relation weil sie sich auf sich selber bezieht.

^grossvaterbeispiel

> [!example]+ Beispiel 2: Natürliche Zahlen
> Es sei $R = \{(x,y) \in \mathbb{N} \times \mathbb{N} | x \text{ ist grösser als } y\}$. $R$ ist eine Relation auf $\mathbb{N}$
> Dann gilt z.b. $(17,4) \in \mathbb{R}$ also $17R4$
> Anstelle $xRy$ schreibt man bei dieser Relation $x \ge y$

^zahlenbeispiel
### Bipartiter Graph
Die beiden Beispiel von eben lassen sich auch als <span style='color: var(--custom-word-green, green)'>[[bipartiter Graph]]</span> darstellen, das kann helfen das ganze zu visualisieren.

**[[#^grossvaterbeispiel|Stammbaum]]**
![[5-relationen 2026-10-15 11.25.26.excalidraw]]

**[[#^zahlenbeispiel|Natürliche Zahlen]]**
![[5-relationen 2026-10-15 11.27.40.excalidraw]]
## Eigenschaften

- Eine Relation ist <span style='color: var(--custom-word-green, green)'>reflexiv</span>, falls $\forall x \in M : xRx$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Alle $x$ aus $M$ stehen in relation mit sich selber)</span> Wenn jedes Element mit sich selbst in Relation steht.
  ^relationreflexiv
- Eine Relation ist <span style='color: var(--custom-word-green, green)'>symmetrisch</span> falls $\forall x,y \in M: xRy \Rightarrow yRx$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: für alle $x$ aus $M$ gilt dass wenn $x$ in einer relation mit $y$ steht dann steht aber $y$ in einer relation mit $x$)</span> Wenn jedes Relation respektive das Prädikat davon auch umgekehrt stimmen würde.
  ^relationsymmetrisch
- Eine Relation ist <span style='color: var(--custom-word-green, green)'>antisymmetrisch</span> falls $\forall x,y \in M: xRy \Rightarrow (\neg(yRx)\lor x = y)$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen: Für alles $x$ und $y$ Tupel aus $M$ gilt dass wenn wenn $x$ in relation zu $y$ steht dann darf $y$ nicht in relation mit $x$ stehen oder $x$ sollte gleich $y$ sein)</span> Wenn zwei Elemente in Relation stehen dann kann es nicht sein dass sie auch umgekehrt in Relation stehen (es sei den sie sind gleich)
  ^relationantisymmetrisch
- eine Relation ist <span style='color: var(--custom-word-green, green)'>transitiv</span> falls $\forall{x,y,z} \in M : ((x,y) \in R \land (y,z) \in R) \Rightarrow (x,z) \in R$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen für alle $x$, $y$ und $z$ gilt wenn $(x, y)$ und $(y, z)$ jeweils in einer Relation stehen dann steht auch $(x, z)$ in einer Relation)</span> Wenn also zwei aneinander stossende Paare in relation stehen auch die noch nicht miteinander verglichenen in einer Relation zu einander.
  ^relationtransitiv

Für das [[#^grossvaterbeispiel|Grossvaterbeispiel]] von oben würde also gelten:
* nicht reflex, da niemand sein eigener Grossvater ist.
* nicht symmetrisch: wenn $x$ der Grossvater von $y$ ist, dann kann nicht $y$ der Grossvater von $x$ sein.
* ist antisymmetrisch: wenn $x$ der Grossvater von $y$ ist, dann ist $y$ nicht der Grossvater von $x$.
* nicht transitiv: Wenn $x$ der Grossvater von $y$ ist, und $y$ der von $z$, dann ist nicht $x$ Grossvater von $z$ (sondern Ururgrossvater)

Und für das [[#^zahlenbeispiel|Natürliche-Zahlenbeispiel]] von oben würde also gelten.
* ist reflexiv: da jedes $x$ grösser oder **gleich** $x$ ist. (das gleich ermöglicht die Reflexivität)
* nicht symmetrisch, da z.b. $17\ge4$ aber nicht $4\ge17$.
* ist antisymmetrisch, da $x \ge y$ bedeutet, dass entweder $x = y$ oder $\neg(y \ge x)$
* ist transitiv: da $x \ge y$ und $y \ge z$ impliziert, dass $x \ge z$ (Wenn $x$ grösser ist als $y$ und $y$ grösser als $z$ dann ist $x$ mit Sicherheit auch grösser als $z$)

> [!example]+ Beispiel 1
> $R = \{(a, b), (b, a), (a, c), (b, b), (b, c)\}$ auf $M = \{a,b,c\}$
>
> nicht reflex: da nur $(b,b)$ aber nicht $(a,a)$ und $(c,c)$ existiert. (Nicht alle Elemente aus $M$ stehen in Relation mit sich selbst.)
> nicht symmetrisch: da nicht alle Kehrwerte vorhanden sind zb. $(c,a)$ oder $(c,b)$
> nicht antisymmetrisch: da es denn umgekehrten Wert $(a, b)$ und $(b, a)$ gibt.
> nicht transitiv: Wenn es $(a,b)$ und $(b,a)$ gibt dann sollte es auch $(aa)$ geben.

> [!example]+ Beispiel 2
> $R = \{(x,y) \in M \times M | x \text{ und } y \text{ haben eine gemeinsame Grossmutter}\}$, wobei $M$ die Menge aller Menschen bezeichne.
>
>  **ist reflex**: da es um eine Gemeinsamkeit geht und die position von $x$ und $y$ keine Rolle spielt im Prädikat.
>  **ist symmetrisch**: ebenfalls wegen der irrelevanten Reihenfolge.
>  **nicht asymmetrisch**: weil die Reihenfolge irrelevant ist kann es dazu kommen das die Implikation falsch ist.
>  **nicht transitiv**: Klappt nicht wenn z.b. in folgendem Fall.
>
>  ![[5-relationen 2026-10-15 12.21.07.excalidraw||100%]]
>
>  Hier haben wir zwei Grössmütter mit jeweils zwei Kindern diese haben dann wieder je ein Kind, das mittlere Kind hat eine gemeinsame Grossmutter mit den beiden Anderen aber die beiden anderen nicht mit einander.

> [!example]+ Beispiel 3:
> $R = \{(x, y) \in \mathbb{N} \times \mathbb{N}|x = y\}$ auf $\mathbb{N}$
>
> **ist reflex**: gleich sich selber
> **ist symmetrisch**: gleich sich selber
> **ist auch antisymmetrisch**: man kann es immer umkehren aber es ist auch immer gleich sich selber.
> **ist transitiv**: aber nur weil es diese zweite Kombinationen sowieso nicht gibt.

## Verknüpfen

> [!abstract] Definition
>
> Es seien $A, B, C$ Mengen, $R$ eine Relation von $A$ nach $B$ und $S$ eine Relation von $B$ nach $C$. Dann ist $S \circ R$ <span style='color: var(--custom-word-gesproche-blue)'>(gesprochen $S$ verknüpft $R$)</span>, die sogenannte <span style='color: var(--custom-word-green, green)'>Verknüpfung von $R$ und $S$</span>, eine Relation von $A$ nach $C$, die so definiert ist:
>
> Für $a \in A$ und $c \in C$ gilt $a(S \circ R)c$ genau dann, wenn ein $b \in B$ existiert mit $aRb$ und $bSc$.
>
> also: $S \circ R = \{(a, c) \in A \times C \quad | \quad \exists b \in B : aRb \land bSc\}$

> [!warning] Warnung
> Umgekehrte Notation in der Literatur: manchmal steht dann $R \circ S$ wobei es aber Sinn macht zuerst das $S$ zu schreiben dann aber trotzdem von hinten nach vorne zu arbeiten.: Mehr dazu in [[6-funktionen|Funktionen]].

> [!example]+ Beispiel
> Es seien
> - $A = \{\text{Peter}, \text{Klaus}, \text{Hans}\}$
> - $B = \{\text{Fortran}, \text{Java}, \text{C}\}$
> - $C = \{\text{Buchhaltungssoftware}, \text{Online-Shop}, \text{Steuersoftware} \}$
> 
> Es sei $R = \{(\text{Peter}, \text{Fortran}), (\text{Peter}, \text{Java}), (\text{Klaus}, \text{Fortran}), (\text{Hans}, \text{Java}), (\text{Hans}, \text{C})\}$ eine Relation, welche angibt, welcher Mitarbeiter welche Programmiersprache beherrscht.
>
> Es sei $S = \{(\text{Fortran}, \text{Buchhaltungssoftware}), \\ (\text{Java}, \text{Online-Shop}), (\text{C}, \text{Online-Shop}), (\text{C}, \text{Steuersoftware})\}$ die Relation, welche angibt, welcher Programmiersprache in welchen Anwendungen verwendet wird.
>
> Dann ist also $R$ eine Relation von $A$ nach $B$ und $S$ ist eine Relation von $B$ nach $C$. Wir bilden also die Verknüpfung von $R$ und $S$ mit $S \circ R$.
>
> Nun haben wir z.b. folgende Überschneidungen:
> - $(\text{Peter}, \text{Fortran})$ zu $(\text{Fortran}, \text{Buchhaltungssoftware})$
> - $(\text{Hans}, \text{Java})$ zu $(\text{Java}, \text{Online-Shop})$
> - usw ...
>   
>   $S\circ R$ ist nun die Zusammenführung dieser Relationen also.
>   $S\circ R = \{(\text{Peter}, \text{Buchhaltungssoftware}), (\text{Peter}, \text{Online-Shop}), (\text{Klaus}, \text{Buchhaltungssoftware}), (\text{Hans}, \text{Online-Shop}), (\text{Hans}, \text{Steuersoftware})\}$
>   
>   Somit gibt also $S \circ R$ an, welcher Mitarbeiter zu welcher Anwendung beitragen kann.
## Inverse Relation

> [!abstract] Definition
> Es seien $A, B$ Mengen und $R$ eine Relation von $A$ von $B$.
>
> Dann ist $R^{-1}$, die sogenannte inverse Relation von $R$, eine Relation von $B$ nach $A$ die so definiert ist:
> Für $b \in B$ und $a \in A$ gilt $bR^{-1}a$ genau dann, wenn $aRb$.

> [!example]+ Beispiel
> Es seien $A = \{(\text{Peter}, \text{Klaus}, \text{Hans})\}$  und $B = \{\text{Fortran}, \text{Java}, \text{C}\}$
>
> Es sei $R = \{(\text{Peter}, \text{Fortran}), (\text{Peter}, \text{Java}), (\text{Klaus}, \text{Fortran}), (\text{Hans}, \text{Java}), (\text{Hans}, \text{C})\}$ die Relation, welche angibt, welcher Mitarbeiter, welche Programmiersprache beherrscht.
>
>Dann ist $R^{-1} = \{(\text{Fortran}, \text{Peter}), (\text{Java}, \text{Peter}), (\text{Fortran}, \text{Klaus}), (\text{Java}, \text{Hans}), (\text{C}, \text{Hans})\}$ die Relation, welche angibt, welche Programmiersprache von welchem Mitarbeiter beherrscht wird.

## Äquivalenzrelationen

> [!abstract] Definition
> Eine Relation $R$ auf einer Menge $M$ heisst <span style='color: var(--custom-word-green, green)'>Äquivalenzrelation</span>, falls $R$ [[#^relationreflexiv|reflexiv]], [[#^relationsymmetrisch|symmetrisch]] und [[#^relationtransitiv|transitiv]] ist. Für $xRy$ heisst $x$ <span style='color: var(--custom-word-green, green)'>äquivalent</span> zu $y$.

### Äquivalenzklassenfasdfa 


ich bin ein coller mann ich bin ein cooler mann ich bin ein cooler mann ich bine cin cooler mann ich bin $fasdfasd$