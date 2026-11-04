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
> Jede Kante trägt 2 zu der Summe aller Knotengrade bei. Also ist die Summe aller Knotengrade eine gerade Zahl. Wenn es nun eine ungerade Anzahl an Knoten mit ungeraden Grade geben würde, dann wäre die Summe der Kantengrade auch ungerade.