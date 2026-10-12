[Nugget 11 (Funktionen 2 - Lineare Funktionen - Teil 4)](https://tube.switch.ch/videos/YwjpoljeqQ)

## Beispiel 1: Ein Dreieck
... sei durch die drei Seitengeraden
- a: $y = -2x + 14$
- b: $y = x+2$
- c: $y = - -\frac{1}{3}x+\frac{2}{3}$
gegeben, Bestimmen sie die Eckpunkte des Dreiecks.

```desmos-graph
y = -2x + 14
y = x+2
y = - -\frac{1}{3}x+\frac{2}{3}
```

Hier könnte man die Punkte herausfinden in dem wir jeweils ein [[1-Einführung Lineare Gleichungssysteme|Gleichungssystem]] erschaffen.

Hier merkt man auch das Funktionen und [[1-Grundlagen Gleichungen|Gleichungen]] ein enges Verhältnis haben.

## Beispiel 2: Handyabos vergleichen

- Mini: keine Abogebühr, 0.4Fr./min (Gespräche)
- Midi: 18 Fr. pro Monat und nur noch 0.25Fr./min
- Maxi: 45 Fr. pro Monat, 60 Minuten gratis danach 0.15Fr./min
- Flat: 57Fr. pro Monat, Gespräche inklusive

In diesem Fall wäre das Abo der $y$-Achsenabschnitt und die Kosten pro Telefonminute sind das $m$ also der [[Koeffizient]] des $x$.

Daraus ergeben sich folgende Gleichungen:

- $K_{Mini} = 0.4*t$
- $K_{Midi} = 18 + 0.25 * t$
- $K_{Maxi} =$ $$
\begin{alignat*}{3}
\begin{cases}
& 45 \quad& t\le60 \\
& 45 * 0.15 * (t-60) & t>60
\end{cases}
\end{alignat*}
$$
- $K_{Flat} = 57$

Graphisch würde das so aussehen. Nun erkennen wir dass es wichtig wäre zu wichtig zu wissen wie viel wir telefonieren wollen Monatlich, anhand davon würde man dann entscheiden welcher Tarif am billigsten ist.

Wir erkennen zb. dass bis 120 Minuten Telefonie Mini am billigsten ist.

```desmos-graph
top=100;
left=-0;
right=200;
bottom=-0;
---
y = 0.4*x
y = 18 + 0.25x
y=45\left\{x\le60\right\}|black
y=45+0.15*(x-60)\left\{x>60\right\}|black
y = 57
```


> [!tip] Übrigens
> Man kann auch solche limitierten Geraden respektive Funktionen mit Desmos darstellen.
> Siehe: [Inequalities and Restrictions – Desmos Help Center](https://help.desmos.com/hc/en-us/articles/4407885334285-Inequalities-and-Restrictions) 

## Beispiel 3: Franchisenwahl bei Grundversichung

- Franchise 200 CHF => Jahresprämie 5200
- Franchise 2500 => Jahresprämie 3700

