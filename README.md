# SAD_12-2023_StudyApp
**Progetto per l'appello di *Software Architecture Design* di dicembre 2023**

**Autori: Olandese Andrea, Coppola Adriano, Guerrisi Salvatore**

[Documentazione](https://raw.githubusercontent.com/AndreaOl/SAD_12-2023_StudyApp/main/Olandese_Coppola_Guerrisi_Progetto_SAD_12-2023.pdf).

StudyApp è una web-app progettata per facilitare l’organizzazione di sessioni di studio tra studenti con interessi accademici simili. L’applicazione offre un ambiente virtuale in cui gli utenti possono trovare vecchi e nuovi compagni di studio, pianificare e partecipare a sessioni di studio collettive, con lo scopo di condividere conoscenze e risorse pertinenti alle loro materie di studio.
## Compilazione
Dopo aver installato **Java JDK 17** e aver settato la variabile d'ambiente **JAVA_HOME**, per compilare l'applicazione è necessario eseguire da linea di comando nella *root directory* del progetto:
```
mvnw clean vaadin:build-frontend package -Pproduction
```
Questo produrrà un file jar presente nella cartella target
Una versione pre-compilata del progetto è scaricabile come [release](https://github.com/AndreaOl/SAD_12-2023_StudyApp/releases/latest/download/studyapp-1.0.jar).
## Esecuzione
L'applicazione va eseguita in una macchina che abbia **PostgreSQL** installato con database e parametri di autenticazione configurati nel file [application.properties](https://github.com/AndreaOl/SAD_12-2023_StudyApp/blob/main/src/main/resources/application.properties). Lo stesso file permette di configurare la comunicazione con un database presente su una macchina diversa o esposto su una porta diversa da quella di default.
Per eseguire il progetto compilato basta eseguire il comando:
```
java -jar studyapp-1.0.jar
```
Eventualmente, aggiungere al comando gli argomenti per la JVM.
