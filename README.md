# SpotifyApp

How to start the SpotifyApp application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/SpotifyApp-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:9000`

Health Check
---

To see your applications health enter url `http://localhost:9001/healthcheck`

## dev

> it's on Docker :D
```bash

docker-compose up --build

```

## todo
- [] healthchecks
- [] metrics

## apis

- I should be able to save songs with title, artist, duration and genre
- I should be able to get songs by title
- I should be able to get songs by artist
  - artists will have a name
- I should be able to mark songs and artists as fav
- I should be able to get a list recommended (using data of my fav songs and artists)