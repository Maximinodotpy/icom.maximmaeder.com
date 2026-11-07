---
aliases:
  - Spannbaum
  - Spannbäume
  - gewichteter Graph
  - gewichtet
---
> [!abstract] Definition Spannbaum
> Es sei $G = (V,E)$ ein ungerichteter zusammenhängender [[Graph]]. Ein Teilgraph $T$ heisst <span style='color: var(--custom-word-green, green)'>Spannbaum</span>, falls $T$ ein [[Graphen Baum|Baum]] ist und jeden [[Graphen Knoten|Knoten]] von $G$ enthält.

> [!example]+ Beispiel
> ![[Graphen Spannbäume 2026-11-07 11.59.29.excalidraw||100%]]

> [!abstract] Definition gewichteter [[Graph]]
> Ein [[Graph]] $G = (V,E)$ zusammen mit einer <span style='color: var(--custom-word-green, green)'>Gewichtsfunktion</span> $c : E \rightarrow \mathbb{R}$ heisst <span style='color: var(--custom-word-green, green)'>gewichteter [[Graph]]</span>.
>
> Je nach Anwendungskontext könnte dies etwas die Länge der [[Graphen Kanten|Kante]] oder die Kosten für das Benutzen der [[Graphen Kanten|Kante]] sein.

> [!abstract] Definition minimaler Spannbaum
> Es sei $G = (V,E)$ ein ungerichteter zusammenhängender [[Graph]].
> Ein Spannbaum $T$ heisst <span style='color: var(--custom-word-green, green)'>minimaler Spannbaum</span>, wenn die Summe der Kantengewichte minimal ist.

> [!example]+ Beispiel
> ![[Graphen Spannbäume 2026-11-07 12.09.17.excalidraw||100%]]
>
> Es kann also durchaus auch mehrere minimale Spannbäume geben (die dann alle dieselbe minimale Kantengewichtsumme haben)

## Algorithmus von Prim

> [!abstract] Definition
> *Eingabe*: zusammenhängender [[Graph]] $G = (V,E)$,  Gewichtsfunktion $c$
> 1. $T \leftarrow \emptyset$
> 2. Markiere einen beliebigen [[Graphen Knoten|Knoten]] $v \in V$
> 3. Solange es noch unmarkierte [[Graphen Knoten|Knoten]] gibt:
> 	a. Wähle eine [[Graphen Kanten|Kante]] von einem markierten zu einem unmarkierten [[Graphen Knoten|Knoten]] mit minimalem Gewicht
> 	b. Füge diese [[Graphen Kanten|Kante]] zu $T$ hinzu
> 	c. Markiere den neuen [[Graphen Knoten|Knoten]]

> [!example]+ Beispiel
> ![[Graphen Spannbäume_Prim||100%]]

## Algorithmus von Kruskal

> [!abstract] Definition
> *Eingabe*: zusammenhängender [[Graph]] $G = (V,E)$, Gewichtsfunktion $c$
> 1. $T \leftarrow \emptyset$
> 2. Solange T noch weniger als $|V| - 1$ [[Graphen Kanten|Kanten]] enthält
> 	a. Markiere eine billigste unmarkierte [[Graphen Kanten|Kante]] $e \in E$
> 	b. Falls diese [[Graphen Kanten|Kante]] keinen Kreis schliesst, füge diese [[Graphen Kanten|Kante]] zu $T$ hinzu.

> [!example]+ Beispiel
> ![[Graphen Spannbäume_Kruskal||100%]]



