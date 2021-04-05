FROM maven:3.8.1-openjdk-17 as dev

WORKDIR spotify-app
COPY pom.xml ./
RUN pwd
RUN mvn clean install

COPY . .
RUN mvn package
RUN pwd 

FROM openjdk:11.0.10-jdk-slim-buster
WORKDIR spotify-app
COPY --from=dev /spotify-app/target/SpotifyApp-1.0-SNAPSHOT.jar .
COPY --from=dev /spotify-app/config.yml .

CMD ["java" , "-jar", "SpotifyApp-1.0-SNAPSHOT.jar", "server", "config.yml"]



