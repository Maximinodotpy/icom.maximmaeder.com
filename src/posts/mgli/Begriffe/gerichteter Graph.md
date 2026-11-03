> [!abstract] Definition
> Es sei $E$ eine endliche Menge von Knoten
> Ein Tupel $G = (V,E)$ mit einer Menge $R \subseteq V \times V$ von Kanton heisst <span style='color: var(--custom-word-green, green)'>gerichteter Graph</span>.
>
> Ein Tupel $G = (V,E)$ mit einer Menge $E \subseteq \{\{u,v\}|u,v \in V\}$ von Kanten heisst <span style='color: var(--custom-word-green, green)'>ungerichteter Graph</span>.
>
> Wenn $E$ eine Multimenge ist, d.h.einige Elemente mehrfach vorkommen, heisst $G$

^definition

> [!example]+ Beispiel
> Es sei $V = \{A,B,C,D\}$
>
>Graphen
> ![[Excalidraw/gerichteter Graph 2026-11-03 15.46.10.excalidraw.md#^frame=EmpKIyH5||100%]]
>
> ![[Excalidraw/gerichteter Graph 2026-11-03 15.46.10.excalidraw.md#^frame=0wy13_nq9ykWd9fkgx2vI||100%]]
>
> Multigraphen
>![[Excalidraw/gerichteter Graph 2026-11-03 15.46.10.excalidraw.md#^frame=0uPa7h9Bj0_Hdk5K2uR53||100%]]
>
>![[Excalidraw/gerichteter Graph 2026-11-03 15.46.10.excalidraw.md#^frame=FYsNNP5-FjwKbLlxttuu2||100%]]

^beispiel

Bei einem ungerichteten (Multi-)Graphen können die Mengen, die eine Kante definieren, ebenfalls Multimengen mit zweimal dem selben Knoten sein. Dann spricht man von einem <span style='color: var(--custom-word-green, green)'>Loop</span>.

> [!note]+ Bemerkung
> Graphen sind durch ihre Knoten- und Kantenmengen eindeutig definiert. Graphisch gesehen bedeutet das, dass es keine Roll spiel, wo die Knoten aufgezeichnet werden.

> [!example]+ Weitere Beispiele
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

> [!abstract] Definition Graphen Wege
> Es sei $G = (V,E)$ ein (Multi-)Graph mit $V = \{v_1,...,v_n\}$ und $E = \{e_1,...,e_m\}$
>
> eine Folge von abwechselnd Knoten und Kanten. $v_{i_1}, e_{j_1}, v_i{_2}, e_{j_2},...,e_{j_k},v_{i_k}$
>
> wobei $e_{j_l}$ eine Kante zwischen $v_{j_l}$ und $v_{j_{l+1}}$ ist, heisst <span style='color: var(--custom-word-green, green)'>Weg</span>.
>
> Wird in einem Weg jede Kante des Graphens genau einmal besucht, heisst der Weg <span style='color: var(--custom-word-green, green)'>Eulerweg</span>.
>
> ![[gerichteter Graph 2026-11-03 17.53.59.excalidraw||100%]]
>
> In einem Graphen ohne Mehrfachkanten zwischen zwei Knoten kann ein Weg auch eindeutig durch die Angabe einer Folge von Knoten angegeben werden.

^definitionweg
## Grad

> [!abstract] Definition Graphen Grad
> Der <span style='color: var(--custom-word-green, green)'>Grad</span> eines Knotens in einem ungerichteten Graphen ist die Anzahl der Kanten, die diesen Knoten enthalten. Loop werden dabei doppelt gezählt. Wir bezeichnen den Grad es Knotens $v$ im Graphen $G$ mit $deg_G(v)$ (oder mit $deg(v)$, wenn $G$ aus dem Kontext klar ist)
>
> ![[gerichteter Graph 2026-11-03 18.22.43.excalidraw||100%]]
>
> Die Anzahl der Knoten mit ungeradem Grad ist hier jeweils gerade. Das gilt immer.

^definitiongrad

> [!note] Satz
> In einem ungerichteten Graphen $G$ kann es nur eine gerade Anzahl von Knoten mit ungeraden Grad geben.
>
> **Begründung:**
> Jede Kante trägt 2 zu der Summe aller Knotengerade bei. Also ist die Summe aller Knotengrade



[Gerichteter Graph – Wikipedia](https://de.wikipedia.org/wiki/Gerichteter_Graph)

![[Pasted image 20261019134953.png]]
