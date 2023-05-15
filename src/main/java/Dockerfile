FROM amazoncorretto: 18-alpine-jdk     // de que imagen partimos
MAINTAINER MGB // quien es el dueño
COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar   //va a copiar el empaquedo github
ENTRYPOINT ["java", "-jar", "/mgb-app.jar"]  //es la intruccion que va a ejecuctar primero

#
#FROM amazoncorretto: 18-alpine-jdk     // de que imagen partimos
#MAINTAINER MGB // quien es el dueño
#COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar   //va a copiar el empaquedo github
#ENTRYPOINT ["java", "-jar", "/mgb-app.jar"]  //es la intruccion que va a ejecuctar primero
