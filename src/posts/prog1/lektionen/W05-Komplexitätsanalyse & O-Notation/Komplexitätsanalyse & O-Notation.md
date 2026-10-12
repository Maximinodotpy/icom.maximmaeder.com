---
sources:
  - https://prog1.pages.fhnw.ch/2026hs/docs/w05-o-notation/lernprogramm.html
---
  ![[Basisaufgaben]]

## Anzahl Anweisungen/Instruktionen

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
| $O(n!)$               | Fakultät      | Naive Traveling Salesman                |                                                  | exponentiell |
^tabellekomplexitaetsklassen

## Rechenregeln