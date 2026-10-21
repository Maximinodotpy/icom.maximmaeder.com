## Binary Search

%%W01-Strukturiertes Programmieren mit Java%%
![[W01-Strukturiertes Programmieren mit Java#^binarysearchjavacode]]

* **Halboffene Intervalle $[left, right)$**:
* Start: `left = 0`, `right = list.size()` (ohne `-1`).
* Schleife: `while (left < right)` (nicht `<=`!).
* Mitte: `m = left + (right - left) / 2`.

* **Geschlossene Intervalle $[left, right]$**:
* Start: `left = 0`, `right = list.size() - 1`.
* Schleife: `while (left <= right)`.

* **Nützlicher Merksatz für Grenzwert-Fehler**: Wenn `right = list.size()` gewählt ist, führt `while (left <= right)` bei Element-Suchläufen außerhalb zu einem `IndexOutOfBoundsException` für `m = list.size()`.

%%W02-Dekomposition und Invarianten%%
![[W02-Dekomposition und Invarianten#Insertion-Sort]]
![[W02-Dekomposition und Invarianten#Selection-Sort]]

%%W03-Objekte und Klassen%%
![[W03-Objekte und Klassen#Beispiel einer Klasse mit Konstruktor, einem Attribut und einer Methode]]
![[W03-Objekte und Klassen#Klasse mit overloaded Methoden]]

%%W04-Objekte verbinden und kapseln%%
![[W04-Objekte verbinden und kapseln#Aliasing]]
![[W04-Objekte verbinden und kapseln#Immutability]]
![[W04-Objekte verbinden und kapseln#Preconditions & Exceptions]]
%%![[W04-Objekte verbinden und kapseln#Javadoc-Kommentare]]%%

%%W05-Komplexitätsanalyse & O-Notation%%
![[W05-Komplexitätsanalyse & O-Notation#^tabellekomplexitaetsklassen]]
![[W05-Komplexitätsanalyse & O-Notation#Rechenregeln]]

* `for (int i = 0; i * i < n; ++i)` $\rightarrow$ $\mathcal{O}(\sqrt{n})$
* `for (int j = n; j > 0; j /= 2)` $\rightarrow$ $\mathcal{O}(\log n)$
* Schleife mit konstanten Grenzen (z. B. `i < 1000` oder `j <= 42`) $\rightarrow$ $\mathcal{O}(1)$ (beeinflusst die Gesamtlaufzeit nicht).

%%W06-Listen, Sets und Maps%%
![[W06-Listen, Sets und Maps#ArrayList]]
![[W06-Listen, Sets und Maps#HashSet]]
![[W06-Listen, Sets und Maps#HashMap]]

## Sonstiges

Wenn `equals()` in einer Klasse **nicht** überschrieben ist, verhält es sich genau wie `==`.
* **Referenzvergleich (`==`) vs. Inhaltsvergleich (`.equals()`)**:
* `==` vergleicht Speicheradressen. `null == null` ergibt `true`!
* `String`-Vergleich mit `==`: vergleicht Referenzen, nicht den Textinhalt!
* Sobald ein Ausdruck auf `null` zugreift (z.B. `null.getTitle()`), bricht das Programm mit einer Exception/Fehler ab.