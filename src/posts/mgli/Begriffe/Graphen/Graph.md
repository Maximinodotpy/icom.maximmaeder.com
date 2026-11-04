---
aliases:
  - graph
  - Graphen
  - Knoten
  - knoten
  - Kanten
  - kanten
---
> [!abstract] Definition
> Es sei $E$ eine endliche [[4-mengen|Menge]] von Knoten
>
> Ein Tupel $G = (V,E)$ mit einer [[4-mengen|Menge]] $R \subseteq V \times V$ von Kanton heisst <span style='color: var(--custom-word-green, green)'>gerichteter Graph</span>. Eine [[4-mengen|Menge]] aus Tupeln, weil die Reihenfolge der Tupel keine Rolle spielt aber in welche Richtung die Verbindung geht.
>
> Ein Tupel $G = (V,E)$ mit einer [[4-mengen|Menge]] $E \subseteq \{\{u,v\}|u,v \in V\}$ von Kanten heisst <span style='color: var(--custom-word-green, green)'>ungerichteter Graph</span>. Eine [[4-mengen|Menge]] aus [[4-mengen|Mengen]], weil die Richtung ebenfalls keine Rolle spielt.
>
> Wenn $E$ eine [[Multimenge]] ist, d.h. einige Elemente mehrfach vorkommen, heisst $G$ <span style='color: var(--custom-word-green, green)'>gerichteter bzw. ungerichteter Multigraph</span>.

^definition

> [!example]+ Beispiel
> Es sei $V = \{A,B,C,D\}$
>
>Graphen
> ![[Graphen_beispiele#^frame=EmpKIyH5||100%]]
>
> ![[Graphen_beispiele#^frame=0wy13_nq9ykWd9fkgx2vI||100%]]
>
> Multigraphen
>![[Graphen_beispiele#^frame=0uPa7h9Bj0_Hdk5K2uR53||100%]]
>
>![[Graphen_beispiele#^frame=FYsNNP5-FjwKbLlxttuu2||100%]]

^beispiel

Bei einem ungerichteten (Multi-)Graphen können die [[4-mengen|Mengen]], die eine Kante definieren, ebenfalls [[Multimenge|Multimengen]] mit zweimal dem selben Knoten sein. Dann spricht man von einem <span style='color: var(--custom-word-green, green)'>Loop</span>.

> [!note]+ Bemerkung
> Graphen sind durch ihre Knoten- und Kantenmengen eindeutig definiert. Graphisch gesehen bedeutet das, dass es keine Roll spiel, wo die Knoten aufgezeichnet werden.

> [!example]- Weitere Beispiele
> ![[5-relationen_eigenschaften#^group=qlcjXDDv|reflexiv|100%]]
>
> ![[5-relationen_eigenschaften#^group=OmbiZLLyz66rkvYXIUbSq|symmetrisch|100%]]
>
> ![[5-relationen_eigenschaften#^group=XecPXh6r3WEk7hElEWZbo|antisymmetrisch|100%]]
>
> ![[5-relationen_eigenschaften#^group=wK-TmWsDN41zMf_0kbrOG|transitiv|100%]]
>
> ![[mgli/lektionen/5-relationen/zeichnungen/5-relationen_eigenschaften.md#^group=FA9bgMYMnrOMHFhcSPq4G|transitiv_beispiel_mit_zahlen|100%]]

^weiterebeispiele
## Wege

![[Graphen Wege]]

## Grad

![[Graphen Grad]]

## Zusammenhang

![[Graphen Zusammenhang]]

## Isolation

![[Graphen Isolation]]

## Isomorphismus von Graphen

![[Graphen Isomorphismus]]

## Teilgraphen

![[Graphen Teilgraphen]]

## Bäume

![[Graphen Baum]]

## Spannbäume

![[Graphen Spannbäume]]

> [!NOTE]- Sonstiges
> [Gerichteter Graph – Wikipedia](https://de.wikipedia.org/wiki/Gerichteter_Graph)
> ![[Pasted image 20261019134953.png]]
