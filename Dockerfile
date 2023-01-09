FROM openjdk:8

ENV RUN_AS_USER cloudsdk

ENV APP customer

ENV VERSION 0.0.1-SNAPSHOT

RUN mkdir /app

ADD /target/$APP-$VERSION.jar /app/app.jar

RUN sh -c 'touch /app/app.jar'

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-Xms256m", "-Xmx2G", "-jar", "app.jar" ]
