Zwei logische Formeln heissen semantisch äquivalent, falls sie dieselbe Wahrheitstafel haben. d.h. wenn sie für alle Belegungen stets den selben Wahrheitsgehalt haben.
Notation: $f \equiv g$
Aus dem Beispiel $A \Rightarrow B \equiv \neg A \lor B$ lernen wir auch dass man die [[#Implikation]] aus einer [[1-aussagen#Negation $ neg$|Negation]] und dem [[1-aussagen#Oder $ lor$|Oder]] zusammenbauen kann.

| $A$ | $B$ | $A \Rightarrow B$ | $\neg A \lor B$ |
| --- | --- | ----------------- | --------------- |
| 0   | 0   | 1                 | 1               |
| 0   | 1   | 1                 | 1               |
| 1   | 0   | 0                 | 0               |
| 1   | 1   | 1                 | 1               |
