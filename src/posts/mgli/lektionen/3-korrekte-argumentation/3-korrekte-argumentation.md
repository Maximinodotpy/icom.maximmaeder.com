---
title: "MGLI Lektion 3: Korrekte Argumentation"
date: 2026-09-21
published: true
video: https://tube.switch.ch/videos/UgyedmTeMo
übungs_serie: "[[serie03.pdf]]"
sources:
  - "[[3-korrekteArgumentation.pdf]]"
---
Das Ziel eines Beweises ist es, eine Aussage $Z$, die sogenannte *Zielaussage*, beweisen.
## Direkter Beweis
Beim direkten Beweis starten wir dabei mit einer wahren [[1-aussagen|Aussage]] $A$, Das kann ein [Axiom](https://de.wikipedia.org/wiki/Axiom) der Mathematik sein oder eine Aussage, die schon früher bewiesen wurde.

Nun finden wir eine Folge von wahren [[1-aussagen#Implikation ⇒|Implikationen]].

$$
A \Rightarrow B_1, B_1 \Rightarrow B_2, ..., B_{k-1} \Rightarrow B_k ,B_k \Rightarrow Z
$$
**Warum muss dan $Z$ wahr sein?**
Weil bei einer Schlange von [[1-aussagen#Implikation ⇒|Implikationen]] jeder Wert wahr sein muss wenn es am Anfang mal wahr war.

### Teilbarkeit
Eine Zahl $a \in  \mathbb{Z}$ teilt eine Zahl $b \in \mathbb{Z}$, wenn eine [[koma/formelblatt#Zahlen|ganze Zahl]] $i \in \mathbb{Z}$ existiert, so dass $b=i*a$.

Wir schreiben dann $a|b$ und nennen die Zahl $a$ einen Teiler von $b$, und das $b$ ein Vielfachens von $a$

Kompakt: $a|b \Leftrightarrow \exists i \in \mathbb{Z}: b = i * a$ (gesprochen: $a$ teilt $b$ genau dann wenn es (mindestens) eine Zahl gibt welche $b = i * a$)

* $2|10$ da $10 = 5*2$ und $5 \in \mathbb{Z}$ (Das Prädikat stimmt und 5 ist eine [[koma/formelblatt#Zahlen|ganze Zahl]])
* $3|7$ gilt nicht. Es ist zwar $7 = \frac{7}{3} * 3$, aber $\frac{7}{3} \notin \mathbb{Z}$ (Das Prädikat könnte stimmen aber $\frac{7}{3}$ ist keine [[koma/formelblatt#Zahlen|ganze Zahl]])

#### Gerade
Eine Zahl $a\in\mathbb{Z}$ heisst gerade, wenn sie durch 2 teilbar ist, also $2|a$.
Andernfalls heisst $a$ ungerade.

$a$ ist somit gerade, wenn eine Zahl $i \in \mathbb{Z}$ existiert mit $a = 2i$
$a$ ist somit ungerade, wenn eine Zahl $i \in \mathbb{Z}$ existiert mit $a = 2i + 1$

#### Primzahlen
Eine [[koma/formelblatt#Zahlen|natürliche Zahl]] $n > 1$ heisst Primzahl, wenn sie in $\mathbb{N}$ (positive ganze Zahlen) nur 1 und sich selber als Teiler hat.
Also: 1, 2, 3, 5, 7, 11, 13 ...

### Beweisen wir das 6 keine Primzahl ist.
Satz: 6 ist keine Primzahl.
Beweis: wir beginnen mit der wahren Aussage, dass $6 = 2*3$

1. $6 = 2*3$
2. $\Rightarrow \exists i \in \mathbb{Z}: 6 = i * 3$ (Das heisst es gibt eine [[koma/formelblatt#Zahlen|ganze Zahl]] welche mit 3 multipliziert 6 ergibt, nämlich $i = 2$)
3. $\Rightarrow 3|6$ (als teilt drei 3 6: Definition der Teilbarkeit)
4. $\Rightarrow$ 3 ist Teiler von 6 (Definition Teiler)
5. $\Rightarrow$ 6 hat einen Teiler, der verschieden von $1$ und $6$ ist. (da $1 \neq 3$ und $6 \neq 3$)
6. $\Rightarrow$ 6 ist keine Primzahl

Hier ist bei jeder Implikation glasklar, warum sie richtig ist. Da die Startaussage offensichtlich auch richtig ist, damit auch die Zielaussage richtig.

### Beweisen von [[2-praedikate-und-quantoren#Defintion ∀ (Allquantor)|All-Aussagen]]
Oft gelten Aussagen nicht nur für ein Objekt sondern für eine ganze Menge.


zb.

## Beweise durch Kontraposition


## Indirekter Beweis