---
title: "MGLI Lektion 7: Graphen"
date: 2026-09-21
published: true
video:
  - https://tube.switch.ch/videos/unIdm39GFA
sources:
Woche: "8"
übungs_serie:
schriftliche_notizen: "[[7-graphen-übungen]]"
folien: "[[7-Graphen.pdf]]"
---

## Graphen

![[Graph#^definition]]

![[Graph#^beispiel]]

## Wege

![[Graphen Wege]]

## Königsberger Brückenproblems

Existiert ein Weg, der alle Brücken genau einmal überquert?

![[7-graphen_königsbergerbrückenproblem]]

* Für jeden Weg, der in einen Knoten rein führt, muss eine Kante aus dem Knoten heraus führen (Ausser beim Endknoten)
* Weil wir nicht mehr zum Start zurückkehren müssen, darf auch der Startknoten eine ungerade Anzahl an Kanten haben
* Also müssen alle Zwischenknoten eine gerade Anzahl an Kanten haben.
* Zu jedem Knoten in diesem Graphen führen eine ungerade Anzahl von Kanten. Deshalb existiert in diesem Graphen kein Eulerweg.

## Eulerweg

> [!abstract] Eulerbedienung für Eulerweg
> In einem ungerichteten Graphen, in dem ein Eulerweg existiert, haben alle Knoten bis auf höchsten zwei (Start- und Endknoten des Weges) einen geraden Grad.
>
> Notwendige Bedingung für Eulerwege:
> ein ungerichteter Graph kann nur einen Eulerweg besitzen, wenn
> * er zusammenhängend ist (bis auf isolierte Knoten) und
> * die Euelerbedingung erfüllt ist, d.h. höchsten 2 Knoten einen ungeraden Grad haben

> [!abstract] Algorithmus von Hierholzer
> Eingabe: Graph $G = (V,E)$ zusammenhängend bis auf isolierte Knoten, höchstens zwei Knoten mit ungeradem Grad.
>
> 1. Wähle $v \in V$ mit ungeradem Grad (falls existent) (und nicht isoliert)
> 2. Wähle ausgehen von $v$ unbesuchte Kanten, bis dies nicht mehr möglich ist. Nenne diesen Weg $K_0$. Dieser Weg endet im zweiten Knoten mit ungeradem Grad (falls existent), sonst in $v$.
> 3. Wenn $K_0$ Eulerweg: Gib $K_0$ aus.
> 4. Es sei $K_1 = K_0$. Wähle beliebigen Knoten $w$ in $K_1$, der noch eine unbesucht Kante besitzt (So ein Knoten existiert, da $K_0$ sonst Eulerweg wäre)
> 5. Konstruiere wie in 2. einen $K_2$ der nur unbesuchte Kanten enthält. Dieser Weg endet in $w$ (Wenn man aus $G$ die Kanten $K_1$ entfernt, hat jeder Knoten geraden Grad)
> 6. Füge $K_1$ und $K_2$ zu $K_0$ wie folgt zusammen: Durchläufe $K_1$ von $v$ bis $w$, dann $K_2$ dann den Rest von $K_1$.
> 7. Gehe zu Schritt 3. (Der Algorithmus terminiert, da $K$ in jeder Iteration grösser wird, und es nur endlich viele Kanten gibt.)
>    
>    ![[7-graphen 2026-11-04 15.04.42.excalidraw||100%]]

## Eulerkreis

> [!abstract] Definition
> Es sei <span style='color: var(--custom-word-green, green)'>G = (V,E)</span> ein (Multi-)Graph. Ein Weg heisst <span style='color: var(--custom-word-green, green)'>Kreis</span>, falls der Startknoten gleich dem Endknoten ist.
>
> Wenn ein Eulerweg ein Kreis ist, nennt man ihn <span style='color: var(--custom-word-green, green)'>Eulerkreis</span>.
> Ein Graph, in dem ein Eulerkreis existiert, heisst <span style='color: var(--custom-word-green, green)'>Eulergraph</span>.
>
> Da bei einem Eulerkreis der Startknoten und der Endknoten gleich sein müssen, fällt im Vergleich zu den Eulerwegen der Fall weg, dass genau zwei Knoten ungeraden Grad haben. Es müssen nun alle Knoten geraden Grad haben.
>
> Somit gilt also:
> Ein ungerichteter Graph hat genau dann einen Eulerkreis, wenn
> * er zusammenhängend ist (bis auf isolierte Knoten) und
> * alle Knoten einen geraden Grad haben
>   
> Mit dem Algorithmus von Hierholzer kann ein Eulerkreis konstruiert werden.

## Multimengen

![[Multimenge#^definition]]

![[Multimenge#^beispiel]]

## Adjazenz

![[Graphen Adjazenz#^definition]]

![[Graphen Adjazenz#^beispiel]]

## Lernziele

- [ ] ==🟢Sie verstehen die Fragestellung des Königsberger Brückenproblems.
- [ ] ==🟢Sie können den Unterschied einer Menge und einer Multimenge erklären.
- [ ] ==🟢Sie kennen die Definition von – einfachen Graphen, – Multigraphen und – gerichteten Graphen.
- [ ] Sie können geeignete Probleme mit Hilfe von Graphen modellieren.
- [ ] Sie können anhand der Graphentheorie das Königsberger Brückenproblem untersuchen.
- [ ] Sie kennen die Definition des Eulerwegs, die besagt, dass jede Kante in einem Weg genau einmal besucht wird.
- [ ] Sie wissen, dass der Grad eines Knotens die Anzahl Kanten ist, die diesen Knoten enthalten.
- [ ] Sie verstehen, wieso es in einem Graphen nur eine gerade Anzahl von Knoten mit ungeradem Grad geben kann.
- [ ] Sie wissen, wie zusammenhängende Graphen definiert sind.
- [ ] Sie kennen die Eulerbedingung für Eulerwege und können bestimmen, ob es in einem gegebenen Graphen einen Eulerweg gibt.
- [ ] Sie kennen den Algorithmus von Hierholzer und können damit Eulerwege bestimmen.
- [ ] Sie wissen, dass ein geschlossener Weg bzw. Eulerweg ein Kreis bzw. Eulerkreis ist und kennen die Definition des Eulergraphen.
- [ ] Sie kennen die Eulerbedingung für Eulerkreise und können den Algorithmus von Hierholzer erweitern, um Eulerkreise zu bestimmen.
- [ ] Sie kennen die Darstellung eines Graphen formal als 2-Tupel und die graphische Darstellung.
- [ ] Sie wissen, dass durch eine Kante verbundene Knoten adjazent heissen und dass mit einem bestimmten Knoten verbundene Kanten inzident zu diesem Knoten sind.
- [ ] Sie wissen, dass Graphen [[Graphen Spannbäume|gewichtet]] sein können.
- [ ] Sie können Graphen in Matrixschreibweise, nämlich als Adjazenzmatrix, darstellen und kennen einige wichtige Eigenschaften von Adjazenzmatrizen.
- [ ] Sie können bestimmen ob zwei kleine Graphen isomorph sind.
- [ ] Sie kennen die Definition eines Baums und seinen Blättern.
- [ ] Sie verstehen, dass je zwei Knoten in einem Baum durch genau einen Weg verbunden sind
- [ ] Die Definition des Zusammenhangs ergänzen Sie durch die Zusammenhangskomponente.
- [ ] Sie wissen, was ein [[Graphen Spannbäume|Spannbaum]] (aufspannender Baum) ist.
- [ ] Sie verstehen, was passsiert, wenn man in einem Baum eine Kante entfernt oder dazufügt.
- [ ] Sie können erklären, wieso die Anzahl der Kanten in einem Baum mit n Knoten immer n − 1 ist.
- [ ] Sie können mit der Cayley-Formel die Anzahl der aufspannenden Bäume für einen vollständigen Graphen mit n Knoten bestimmen.
- [ ] Sie können zu einem Baum einen Prüfercode bestimmen und Sie können auch anhand des Prüfer- codes den dazugehörigen Baum aufzeichnen.
- [ ] Sie können Teilgraphen eines Graphen bestimmen und testen, ob dieser einen [[Graphen Spannbäume|Spannbaum]] definiert.
- [ ] Sie können die Kosten eines Spannbaums bestimmen, was vor allem bei gewichteten Graphen verwendet wird.
- [ ] Mittels der Algorithmen von Kruskal und Prim können Sie einen minimalen [[Graphen Spannbäume|Spannbaum]] bestimmen.