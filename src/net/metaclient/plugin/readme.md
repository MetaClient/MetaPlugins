# Meta Plugins

Meta hat seine eigene API um Programmierern die Möglichkeit den Client zu erweitern.
Anspruchsvolle Plugins können auch hier landen und frei zum Download gestellt werden.

## Meta Plugins Programmierung

Um Meta Plugins zu programmieren musst du erstmal MetaPremium.jar als Libary hinzufügen.
Das erledigt erstellst du eine Klasse, die dann Meta sagt das ich da bin und auch benutzt werden möchte.

Dazu erstellst du eine Klasse mit einem Namen deiner Wahl.
In meinem Fall TestPlugin.

Nun implementierst du der Klasse das MetaPluginInterface.

![alt text](http://metaclient.net/InterfacePic.png)

Nun wird dir je nach Benutzeroberfläche jetzt schon gemeldet das irgendwas fehlt.
Wenn du dir Option hast dann füge die fehlenden Sachen hinzu.
Am Ende sollte es dann so aussehen:

![alt text](http://metaclient.net/FullClass.png)

Nun kannst du beginnen.
Die start Methode wird kurz vor dem Erscheinen des Hauptmenüs ausgelößt
Die stop Methode wird derzeit noch nicht verwendet.

Mit der "metaApi" Variable kannst du viele Methoden aufrufen und benutzen.
Hier kurz aufgelistet:

![alt text](http://metaclient.net/interfaceMethods.png)

Nun ist dir der Rest überlassen.
Aber etwas habe ich noch für dich.
In [Link] hast du ein komplettes Beispiel.
Du kannst dich daran orientieren und auch sicher ein sehr schönes Plugin daraus machen.
