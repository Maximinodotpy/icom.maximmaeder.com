---
aliases:
  - Prüfercode
  - Baum
  - Blatt
  - Blätter
  - Bäume
---
> [!abstract] Definition eines Baumes
> Es sei $G = (V,E)$ ein ungerichteter [[Graph]] (kein Multigraph).
> $G$ heisst <span style='color: var(--custom-word-green, green)'>Baum</span>, falls $G$ [[Graphen Zusammenhang|zusammenhängend]] ist und keinen Kreis enthält.
>
> Äquivalent ist:
> - $G$ ist ein Baum.
> - Zwischen zwei beliebigen Knoten von $G$ existiert genau ein [[Graphen Wege|Weg]]
> - $G$ ist zusammenhängend und $|E| = |V| - 1$ (Euler-Formel: die Menge der Kanten ist um eines kleiner als die Menge der Knoten)
> - $G$ ist zusammenhängend und das Entfernen einer einzigen Kante hebt den Zusammenhang auf.
> - $G$ hat hat keinen Kreis aber durch das Hinzufügen einer neuen Kante entsteht ein Kreis

^definition

> [!abstract] Definition eines Blattes (Graphen Baum)
> Es  sei $G = (V,E)$ ein Baum.
> Ein Knoten $v \in V$ heisst <span style='color: var(--custom-word-green, green)'>Blatt</span>, falls $deg(v) = 1$

^definitionblatt

> [!example]+ Beispiele
> Im folgenden, einige Beispiel von Bäumen, in Blau die Blätter.
> ![[Graphen Baum_beispiel||100%]]

^beispiel

## Prüfercode

Der <span style='color: var(--custom-word-green, green)'>Prüfer-Code</span> nach Heinz Prüfer ist eine eindeutige Darstellung eines beschrifteten Baumes mit $n$ Knoten durch eine Folge von $n - 2$ Zahlen.

Jeder beschriftete Baum (mit den Knoten $\{1,2,3,...,n\}$) kann eindeutig in eine Zahlenfolge der Länge $n - 2$ umgewandelt werden und umgekehrt kann man aus einer solchen Folge den Baum rekonstruieren.

> [!abstract] **Algorithmus** Baum $\rightarrow$ Prüfer-Code:
> 1. Solange mehr als zwei Knoten im Baum sind:
> 	a. Wähle den Knoten mit der kleinsten Nummer, der ein Blatt (Grad = 1) ist.
> 	b. Notiere den Nachbarn dieses Knotens in der Prüfer-Sequenz.
> 	c. Entferne das gewählte Blatt aus dem Baum.
> 2. Widerhole, bis nur zwei Knoten übrig sind.
> ^definitionbaumzupruefercode

> [!example]+ Beispiel
> ![[Graphen Baum_baum zu code||100%]]

> [!abstract] **Algorithmus** Prüfer-Code $\rightarrow$ Baum:
> *Eingabe:* Prüfer-Code = $p = \{p_1, p_2, ..., p_{n-2}\}$
> 1. Initialisiere eine leere Liste $b$
> 2. Für jedes Element $p_i$ in $p$ (von links nach Rechts) wiederhole:
> 	a. Bestimme die kleinste Zahl $k$, die weder in $p$ noch in $b$ enthalten ist.
> 	b. Füge $k$ in $b$ ein.
> 	c. Verbinde $k$ mi $p_1$.
> 	d. Streiche $p_i$ aus $p$.
> 3. Bestimme die zwei Knoten, die nicht in $b$ enthalten sind.
> 4. Verbinde diese beiden Knoten miteinander.
> ^definitionbaumzupruefercode

> [!example]+ Beispiel
> ![[Graphen Baum_code zu baum||100%]]

## Cayley-Formel

Es gibt $n^{n-2}$ verschiedene Bäume mit $n$ Knoten.

Insbesondere gibt es damit auch $n^{n-2}$ verschiedene [[Graphen Spannbäume|Spannbäume]] eines Vollständigen Graphen mit $n$ Knoten.

> [!example]+ Beispiel
> Es gibt $3^{2-1} = 3$ verschiedene Bäume mit drei Knoten.
>
> ![[Graphen Baum_varianten_beispiel||100%]]

