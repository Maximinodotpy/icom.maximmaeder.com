---
aliases:
  - Eulerweg
  - Eulerwege
  - Eulerbedingung
  - Eulerbedingungen
---

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
> 2. Wähle ausgehen von $v$ unbesuchte Kanten, bis dies nicht mehr möglich ist. Nenne diesen [[Graphen Wege|Weg]] $K_0$. Dieser [[Graphen Wege|Weg]] endet im zweiten Knoten mit ungeradem Grad (falls existent), sonst in $v$.
> 3. Wenn $K_0$ Eulerweg: Gib $K_0$ aus.
> 4. Es sei $K_1 = K_0$. Wähle beliebigen Knoten $w$ in $K_1$, der noch eine unbesucht Kante besitzt (So ein Knoten existiert, da $K_0$ sonst Eulerweg wäre)
> 5. Konstruiere wie in 2. einen $K_2$ der nur unbesuchte Kanten enthält. Dieser [[Graphen Wege|Weg]] endet in $w$ (Wenn man aus $G$ die Kanten $K_1$ entfernt, hat jeder Knoten geraden Grad)
> 6. Füge $K_1$ und $K_2$ zu $K_0$ wie folgt zusammen: Durchläufe $K_1$ von $v$ bis $w$, dann $K_2$ dann den Rest von $K_1$.
> 7. Gehe zu Schritt 3. (Der Algorithmus terminiert, da $K$ in jeder Iteration grösser wird, und es nur endlich viele Kanten gibt.)
>    
>    ![[Graphen Eulerweg_beispiel||100%]]
