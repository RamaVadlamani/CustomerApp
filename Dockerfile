FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER Rama vadlamani
COPY /target/customerprofile-1.0-SNAPSHOT.jar customerprofile-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/customerprofile-1.0-SNAPSHOT.jar"]