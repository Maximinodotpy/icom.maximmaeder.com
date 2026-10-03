---
title: "MGLI Lektion 1: Aussagen"
date: 2026-09-14
published: true
video: https://tube.switch.ch/channels/52REtfybgj?return_to=
drehbuch: https://fhnw365.sharepoint.com/:b:/r/teams/E-mgli-HS26_M365/Kursmaterialien/Drehbuch_mgli.pdf?d=w0cbbae40615c47edb1c354550733a6c0&csf=1&web=1&e=1od0J8
---
## Symbole für Aussagen

### Zweistellige Operatoren

#### Und ∧
Wenn beides (/alle) richtig ist ...

#### Oder ∨
Wenn mindestens eines richtig ist ...

#### Implikation ⇒
Ist nur falsch wenn A wahr ist und B falsch sonst richtig

```
Falsch ⇒ Falsch (Richtig)
Falsch ⇒ Richtig (Richtig)
Richtig ⇒ Falsch (Falsch)
Richtig ⇒ Richtig (Richtig)
```

In Zahlen ausgedrückt muss also die rechte Seite mindestens gleich oder mehr sein als links. Oder anders gesagt wenn links richtig ist dann muss es rechts auch richtig sein.

| $A$ | $B$ | $A \Rightarrow B$          |
| --- | --- | -------------------------- |
| 0   | 0   | 1                          |
| 0   | 1   | 1                          |
| 1   | 0   | 0 (Einziger falscher Fall) |
| 1   | 1   | 1                          |

#### Logische Äquivalenz ⇔
Wenn die beiden werte gleich sind, unabhängig davon ob sie wahr oder falsch sind ...

| $A$ | $B$ | $A \Leftrightarrow B$ |
| --- | --- | --------------------- |
| 0   | 0   | 1                     |
| 0   | 1   | 0                     |
| 1   | 0   | 0                     |
| 1   | 1   | 1                     |
### Einstellige Operatoren

#### Negation ¬ 
geht vor, respektive wird als erstes evaluiert

## Weitere Begriffe

### Tautologie
Wenn eine Logische Formel für alle Belegungen stets den Wahrheitswert 1 hat, dann nennt man diese Formel Tautologie

zb.
```
A ⇒ (A ∨ B)
```

oder

```
(A ⇒ B) ⇔ (¬B ⇒ ¬A)
```

### Kontradiktion
Wenn eine Logische Formel für alle Belegungen stets den Wahrheitswert 0 hat, dann nennt man diese Formel Kontradiktion

zb.
```
A ∧ ¬A
```

## Normalformen

<!-- -->

### Konjunktive Normalform
<!-- -->

### Disjunktive Normalform
<!-- -->