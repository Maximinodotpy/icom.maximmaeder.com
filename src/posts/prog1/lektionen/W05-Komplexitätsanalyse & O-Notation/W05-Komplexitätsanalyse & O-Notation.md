---
sources:
  - https://prog1.pages.fhnw.ch/2026hs/docs/w05-o-notation/lernprogramm.html
lernziele: https://prog1.pages.fhnw.ch/2026hs/docs/w05-o-notation/#_lernziele
Woche: "5"
---
  ![[prog1/lektionen/W05-Komplexitätsanalyse & O-Notation/Basisaufgaben]]

## Anzahl Anweisungen/Instruktionen

### Summenformel

## O-Notationen/Komplexitätsklassen

Das sind die gängigsten Komplexitätsklassen.

| Klasse                | Bezeichnung   | Beispiel                                | Zuwachs<br>$$\frac{f(2n)}{f(n)}$$                | Wachstum     |
| --------------------- | ------------- | --------------------------------------- | ------------------------------------------------ | ------------ |
| $O(1)$                | Konstant      | Array Access                            | 1                                                | sublinear    |
| $O(\text{log } n)$    | Logarithmisch | Binäre Suche                            | 1 + $\frac{\text{log } 2}{\text{log } n}$        | sublinear    |
| $O(n)$                | Linear        | Sequenzielle Suche                      | 2                                                | polynomial   |
| $O(n \text{ log } n)$ | Log-Linear    | Mergesort                               | 2 + $\frac{2\times\text{log } 2}{\text{log } n}$ | polynomial   |
| $O(n^2)$              | Quadratisch   | Selectionsort                           | 4                                                | polynomial   |
| $O(n^3)$              | Kubisch       | naive Matrix Multiplikation             | 8                                                | polynomial   |
| $O(2^n)$              | Exponentiell  | Brute Force Knapsack                    | $2^n$                                            | exponentiell |
| $O(3^n)$              | Exponentiell  | Brute Force Coloring Problem (3 Colors) | $3^n$                                            | exponentiell |
| $O(n!)$               | Fakultät      | Naive Traveling Salesman                | $\prod$                                          | exponentiell |

^tabellekomplexitaetsklassen

## Rechenregeln

1. **Konstante Faktoren darf man streichen.**
   es gilt zb. $k * f \in O(f)$.
   Der konstante Faktor ändert nichts an der Komplexitätsklasse. Beispielsweise gilt sowohl. $\frac{n^3}{1000} \in O(n^3)$ als auch $15 * n^3 \in O(n^3)$

2. **Bei Summen kommt es nur auf den am schnellsten wachsenden Term an.**
   Falls $f \in O(g)$ folg, dass auch $f + g \in O(g)$
   Beispielsweise $n^2 + 50n + 1'000'000 \in O(n^2)$ und $n + \text{log} n \in O(n)$

3. **Von [[Polynom|Polynomen]] ist nur der (grösste) Grad Ausschlaggebend.**
   Beispiel: $15n^5 + 20n^4 + 30n^3 + 50n^2 + 50n + 60 \in O(n^5)$
   Diese oft Nutzbare Regel ergibt sich aus der Kombination der beiden vorangegangenen Regeln.

4. **Die Basis von Logarithmen ist bei der O-Notation egal und wird weggelassen.**
   Beispiele $\log_{2}n$, $\log_{10}n$ oder $\log_{42}n$ sind alle in der Klasse $O(\log n)$

5. **[[2-Exponentialgleichungen|Exponentialfunktionen]] mit grösserer Basis wachsen schneller.**
   Das bedeutet beispielweise $3^n \in O(2^n)$ aber $2^n \in O(3^n)$
   Exponentialfunktionen sind die [[2-Umkehrfunktionen|Umkehrfunktionen]] von Logarithmen. Im Gegensatz zu diesen sind bei Exponentialfunktionen die Basen für die asymptotische Komplexitätsklasse relevant.

6. **Exponentialfunktionen wachsen schneller als jedes [[Polynom]].**
   $b^n \in O(n^k)$ für beliebige Wert von $b > 0$ und $k > 0$.
   Merke: Wenn die Problemgrösse $n$ in einem Exponenten sitzt, dann handelt es sich um eine Exponentialfunktion.

7. **Produkte von Funktionen bilden jeweils eigene Klassen.**
   $n * \log(n) \in O(n * \log(n))$
   $2^n * n^2 \in O(2^n * n^2)$
   Produkte von Funktionen sind in der Komplexitätsklasse der Produkts. Das heisst, Du kannst daran nichts vereinfachen, es wird aber auch nicht komplexer: $f * g \ in O(f * g)$

^rechenregeln