# Event-basierte Integration (SBB Ausbildungscamp, 2019)

## Vorbereitung
* Team Fahrzeit: Dieses Repo clonen. 
* Team Alert: Das [Alert Repo]( https://github.com/kguelseven/ausbildungscamp-alert-kafka) clonen.
* Beide: Sicherstellen, dass die Spring Boot App im IntelliJ gestartet werden kann. 

## Ziele 
1. Fahrzeit-App publiziert laufend Fahrzeiten für einen Zugfahrtpunkt. Die Alert-App konsumiert die Fahrzeiten von Kafka.
    * Kafka-Infrastruktur & Spring Boot Konfiguration verstehen
    * Fahrzeit modellieren: Key, Sollzeit, Istzeit
    * Fahrzeit-App: Fahrzeit publizieren 
    * Alert-App: Fahrzeit konsumieren
2. Alert-App publiziert Alerts wenn die Abweichung zwischen Sollzeit und Istzeit einen bestimmten Wert überschreitet. Die Fahrzeit-App konsumiert die Alerts und gibt sie aus. 
    * Alert modellieren: Key, Abweichung
    * Alert-App: Alert publizieren
    * Fahrzeit-App: Alert konsumieren
3. Fahrzeit wird um ein neues Attribut erweitert. Alert-App kann die neuen Fahrzeiten weiterhin verarbeiten. 
    * Diskussion: Lösungsansatz für diesen Beispiel? Allgemeine Lösungsansätze (JSON, XML, Binär..)?
4. Nach dem Hochskalieren des Topics kann die korrekte Verarbeitungsreihenfolge der Fahrzeiten weiterhin garantiert werden. 
    * Kafka Partitionen verstehen
    * Probleme mit der Reihenfolge verstehen: Konkret mit Kafka, allgemein im verteilten Systemen
    * Umsetzung der Lösung 
   
