## Getting home

Eine Mobile App welche einem Schnell zeigt wann man das nächste Mal oder das letzte Mal heute nachhause kommt.

Es könnte als Notifications oder als Widget angezeigt werden.

Man sollte können verschiedenen Orte hinzufügen mit Label

Das ganze würde die ÖV API von der SBB (search.ch) nutzen

es könnte auch den ersten Zug der durch das GA Night valide wäre anzeigen.

### Daten

**Destinationen**

| Name                       | Beschreibung                                                                                             | Typ         |     |
| -------------------------- | -------------------------------------------------------------------------------------------------------- | ----------- | --- |
| Name                       | Ein Custom name für diesen Eintrag, wenn Leer dann wird einfach ein Wert aus der Konfiguration Computed. | String?     |     |
| from                       |                                                                                                          | Koordinaten |     |
| from_is_current_location   |                                                                                                          | boolean     |     |
| to                         |                                                                                                          | Koordinaten |     |
| to_is_current_location     |                                                                                                          | boolean     |     |
| show_last_today_connection |                                                                                                          |             |     |
| show_last_cycle_connection |                                                                                                          |             |     |
| show_next_connection       |                                                                                                          |             |     |

