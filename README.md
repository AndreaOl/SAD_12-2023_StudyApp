# SAD_12-2023_StudyApp
**Progetto per l'esame di *Software Architecture Design* di dicembre 2023**
**Autori: Olandese Andrea, Coppola Adriano, Guerrisi Salvatore**

StudyApp è una web-app progettata per facilitare l’organizzazione di sessioni di studio tra studenti con interessi accademici simili. L’applicazione offre un ambiente virtuale in cui gli utenti possono trovare vecchi e nuovi compagni di studio, pianificare e partecipare a sessioni di studio collettive, con lo scopo di condividere conoscenze e risorse pertinenti alle loro materie di studio.
## Compilazione
Avendo prima installato Java JDK 17, per compilare l'applicazione è necessario eseguire da linea di comando:
```
mvn clean vaadin:build-frontend package -Pproduction
```
Questo produrrà un file jar presente nella cartella target
Una versione pre-compilata del progetto è scaricabile come [release](https://github.com/AndreaOl/SAD_12-2023_StudyApp/releases/latest/download/studyapp-1.0.jar)
## Esecuzione
Per eseguire il progetto compilato basta eseguire il comando:
```
java -jar studyapp-1.0.jar
```
Eventualmente, aggiungere al comando gli argomenti per la JVM
