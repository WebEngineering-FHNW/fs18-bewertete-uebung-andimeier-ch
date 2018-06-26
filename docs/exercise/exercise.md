# WebEngineering Module, Graded Exercise

## Commit Proposal

Matriculation Number: 16-666-018

Project idea short description: 

Ich habe mehrere Ideen:

### Noch wieviel mal schlafen
Meine Kinder fragen ständig, wie viel mal sie noch schlafen müssen, bis sie Geburtstag haben.
Die Idee ist es, eine App zu machen, mit der man die entsprechende Anzahl schnell und einfach nachschauen kann.

Mögliche Erweiterungen:
- Als Erweiterung kann irgendein Anlass/Termin erfasst werden, um die Anzahl verbleibende Nächte anzuzeigen.
- Die Termine können einem Familienmitglied zugeordnet werden.
- Liste mit den nächsten Terminen anzeigen.
- ...

### Timetracker
Eine App, um die Arbeitszeit von einzelnen Tasks/Projekten/Kunden zu tracken.

- Es kann ein Kunde erfasst werden.
- Es kann ein Projekt zu einem Kunden erfasst werden.
- Ev. kann ein Task zu einem Projekt erfasst werden.

Workflow:
- Kunden, Projekte (und Tasks) erfassen
- Tracker für einen bestimmten Task starten
  - Es kann nur für einen Task gleichzeitig getrackt werden. D.h. wenn man den Tracker für einen Task startet,
  werden alle anderen gestoppt.
  - Es können bemerkungen zu jedem Task erfasst werden.
- Die Total-Arbeitszeit pro Tag wird angezeigt
- Die gearbeitete Zeit sowie die Bemerkungen für einen Task werden pro Tag gespeichert.

### Persönliche Finanzen App
Ansichten:
- Konten (wo mein Geld liegt)
- Kategorien (von Ausgaben und Einnahmen)
- Bewegungen
- ev. Budget

Features:
- Erfassen und Anzeigen von Konten und Kategorien
- Bewegungen erfassen mit Datum, Beschreibung, +/- Betrag, Kategorie und Konto
- Budget erstellen aufgrund der Kategorien
- Verhältnis von Budget und tatsächlichen Bewegungen anzeigen

### meine Präferenz
Ich persönlich würde das erste (Noch wieviel mal schlafen) wählen, weil es mir am einfachsten erscheint.
Falls Sie denken, dass das zu einfach ist, können Sie aussuchen :-)


## Project confirmation

confirmed.

Sie können gerne das wieviel-schlafen angehen. Man soll immer das machen, wo das Herz dran hängt.
Es hat genügend features um eine gute Note zu erreichen: Geburtstage oder andere Ereignisse bewirtschaften,
kindgerechte Auswahl für die Anzeige (evtl. per Bild?), graphische Anzeige der Tage? ...

Have fun
D. König


## Project delivery <to be filled by student>

How to start the project: (if other than `grailsw run-app`)

How to test the project:  (if other than `grailsw test-app`)

Hand-written, static HTML project description: (if other than `index.html` in project root directory)

External contributions:
- [Bulma](https://bulma.io): CSS Framework (assets/stylesheets/bulma.min.css)
- [Fontawesome 4](https://fontawesome.com/v4.7.0/): Icons (über CDN in views/layouts/main.gsp)

Other comments: 

I'm particular proud of:

Das responsive Verhalten des Details Panel: auf dem Desktop erscheint es neben der List, auf Mobile ist es ein Overlay, 
das erscheint und wieder geschlossen werden kann. Für beides wird das gleiche HTML benutzt.


## Project grading 

Static html description given and fully valid.

The application works fine.

Functionality is CRUD operations over one domain class Event with many-to-one relation to Person, which cannot
be managed through the application (good: the controller actively prevents url spoofing).
This comes with a very nice responsive master-detail view.

Commit log over 6 days is ok but could be more fine-granular.
Very nice UI integration tests, no unit tests.
HTML validity has a number of issues. First and foremost: Duplicate ID _method.

I award you two extra points, one for the artistic value and one for the really nice solution
to create a responsive master-detail view with bare html/css.
Its a small app but it is nicely done!

Grade: 5.6
