---
aliases:
  - Eulerkreis
  - eulerkreis
---

> [!abstract] Definition
> Es sei <span style='color: var(--custom-word-green, green)'>G = (V,E)</span> ein (Multi-)[[Graph]]. Ein [[Graphen Wege|Weg]] heisst <span style='color: var(--custom-word-green, green)'>Kreis</span>, falls der [[Graphen Knoten|Startknoten]] gleich dem [[Graphen Knoten|Endknoten]] ist.
>
> Wenn ein [[Graphen Eulerweg]] ein Kreis ist, nennt man ihn <span style='color: var(--custom-word-green, green)'>Eulerkreis</span>.
> Ein Graph, in dem ein Eulerkreis existiert, heisst <span style='color: var(--custom-word-green, green)'>Eulergraph</span>.
>
> Da bei einem Eulerkreis der Startknoten und der Endknoten gleich sein müssen, fällt im Vergleich zu den Eulerwegen der Fall [[Graphen Wege|weg]], dass genau zwei Knoten ungeraden Grad haben. Es müssen nun alle Knoten geraden Grad haben.
>
> Somit gilt also:
> Ein ungerichteter Graph hat genau dann einen Eulerkreis, wenn
> * er zusammenhängend ist (bis auf isolierte Knoten) und
> * alle Knoten einen geraden Grad haben
>   
> Mit dem Algorithmus von Hierholzer kann ein Eulerkreis konstruiert werden.
