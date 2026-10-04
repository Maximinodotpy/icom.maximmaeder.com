---
title: "MGLI Lektion 1: Aussagen"
date: 2026-09-14
published: true
video: https://tube.switch.ch/channels/52REtfybgj?return_to=
drehbuch: https://fhnw365.sharepoint.com/:b:/r/teams/E-mgli-HS26_M365/Kursmaterialien/Drehbuch_mgli.pdf?d=w0cbbae40615c47edb1c354550733a6c0&csf=1&web=1&e=1od0J8
---
## Symbole für Aussagen

### Zweistellige Operatoren

#### Und $\wedge$
Wenn beides (/alles) richtig ist ...

#### Oder $\lor$ 
Wenn mindestens eines richtig ist ...

#### Implikation $\Rightarrow$
Ist nur falsch wenn A wahr ist und B falsch sonst richtig

In Zahlen ausgedrückt muss also die rechte Seite mindestens gleich oder mehr sein als links. Oder anders gesagt wenn links richtig ist dann muss es rechts auch richtig sein.

| $A$ | $B$ | $A \Rightarrow B$          |
| --- | --- | -------------------------- |
| 0   | 0   | 1                          |
| 0   | 1   | 1                          |
| 1   | 0   | 0 (Einziger falscher Fall) |
| 1   | 1   | 1                          |
Wird beim [[3-korrekte-argumentation|Argumentieren respektive beweisen]] gebraucht weil eine Schlange aus Implikationen immer Wahr sein muss wenn nur die erste Instanz wahr war.
#### Logische Äquivalenz $\Leftrightarrow$
Wenn die beiden werte gleich sind, unabhängig davon ob sie wahr oder falsch sind ...

| $A$ | $B$ | $A \Leftrightarrow B$ |
| --- | --- | --------------------- |
| 0   | 0   | 1                     |
| 0   | 1   | 0                     |
| 1   | 0   | 0                     |
| 1   | 1   | 1                     |
### Einstellige Operatoren
#### Negation $\neg$
Kehrt den Wert um also von wahr zu falsch und von falsch zu wahr. Geht vor, respektive wird als erstes evaluiert

| $A$ | $\neg A$ |
| --- | -------- |
| 1   | 0        |
| 0   | 1        |

## Weitere Begriffe
### Logische Formel
Etwas wie das hier $(\neg A \lor B) \land C$ nennen wir **logische Formel**.
### Belegungen
Weisen wir jeder Variabel einer [[#Logische Formel|logischen Formel]] einen Wert zu nennt man das eine **Belegung**. Führt diese dazu dass die logischer Formel wahr wird nennen wir sie **erfüllende Belegung** (oder natürlich andersherum **nicht erfüllende Belegung**)
Bei grossen logischen Formeln kann es je nachdem sehr lange gehen herauszufinden ob sie eine erfüllende Belegung haben (Erfüllbarkeitsproblem).
## Syntaxbaum
Einen Syntaxbaum kann man nutzen um auf visuelle Art und Weise eine [[#Logische Formel|logische Formel]] darzustellen. Es kann auch helfen verschiedene Belegungen zu prüfen.
```mermaid
flowchart TD
	AND --> NOT1
	AND --> IMPLIES
	IMPLIES --> NOT2
	NOT2 --> A
	IMPLIES --> B
	
	NOT1 --> C
``` 
### Tautologie
Wenn eine [[#Logische Formel|logische Formel]] für alle Belegungen stets den Wahrheitswert 1 hat, dann nennt man diese Formel Tautologie: zb. $A \implies (A ∨ B)$ oder $(A ⇒ B) ⇔ (¬B ⇒ ¬A)$ (diese zweite logische Formel wird noch eine Rolle spielen bei der [[3-korrekte-argumentation|korrekten Argumentation]])
### Kontradiktion
Wenn eine [[#Logische Formel|logische Formel]] für alle Belegungen stets den Wahrheitswert 0 hat, dann nennt man diese Formel Kontradiktion: zb. $A ∧ ¬A$ (gesprochen: A und nicht A)
### Semantische Äquivalenz
Zwei logische Formeln heissen semantisch äquivalent, falls sie dieselbe Wahrheitstafel haben. d.h. wenn sie für alle Belegungen stets den selben Wahrheitsgehalt haben.
Notation: $f \equiv g$
Aus dem Beispiel $A \Rightarrow B \equiv \neg A \lor B$ lernen wir auch dass man die [[#Implikation]] aus einer [[#Negation $ neg$|Negation]] und dem [[#Oder $ lor$|Oder]] zusammenbauen kann.

| $A$ | $B$ | $A \Rightarrow B$ | $\neg A \lor B$ |
| --- | --- | ----------------- | --------------- |
| 0   | 0   | 1                 | 1               |
| 0   | 1   | 1                 | 1               |
| 1   | 0   | 0                 | 0               |
| 1   | 1   | 1                 | 1               |
### Rechenregeln

| Name                  | $\lor$                                                  | $\land$                                                  |
| --------------------- | ------------------------------------------------------- | -------------------------------------------------------- |
| Assoziativgesetze     | $(f \lor g) \lor h \equiv f \lor g \lor h$              | $(f \land g) \land h \equiv f \land g \land h$           |
| Kommutativgesetze     | $f \lor g \equiv g \lor f$                              | $f \land g \equiv g \land f$                             |
| Distributivgesetze    | $f \lor (g \land h) \equiv (f \lor g) \land (f \lor h)$ | $f \land (g \lor h) \equiv (f \land g) \lor (f \land h)$ |
| Absorbtionsgesetze    | $f \lor (f \land g) \equiv f$                           | $f \land (f \lor g) \equiv f$                            |
| Identitätsgesetze     | $f \lor 0 \equiv f$<br>$f \lor 1 \equiv 1$              | $f \land 0 \equiv 0$<br>$f \land 1 \equiv f$             |
| Idempotenzgesetze     | $f \lor f \equiv f$                                     | $f \land f \equiv f$                                     |
| Negationgesetze       | $f \lor \neg f \equiv 1$<br>$\neg\neg f \equiv f$       | $f \land \neg f  \equiv 0$                               |
| De Morgansche Gesetze | $\neg(f \lor g) \equiv \neg f \land \neg g$             | $\neg(f \land g) \equiv \neg f \lor \neg g$              |

## Normalformen
<!-- -->

### Konjunktive Normalform
<!-- -->

### Disjunktive Normalform
<!-- -->