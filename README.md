# Building Full-Stack Web Apps

This repository is a starter exercise in creating a backend using Java with Spring. 

## Classes / @RestController / @Controller
- HelloWorldController.java
- NotARestController.java
- Album.java
- AlbumController.java
- AlbumRespository.java

## API
#### HelloWorldController
    getHelloWorld()
    getHelloToMe(String name)
    getCapitalization(String string)
    getReverse(String sentence)

#### AlbumController
    getAllAlbums(Model m)

## Starter Guide:
- Clone down the repo and run the command:

  <Code> ./gradlew bootrun </Code>

#### Application Properties Set-up:

On your application.properties, make sure postgres is set up on with your individual user environment variables

    spring.datasource.url=jdbc:postgresql://localhost:5432/songr
    spring.datasource.username=${postgresUsername}
    spring.datasource.password=${postgresPassword}
    #spring.jpa.hibernate.ddl-auto=create //<-- uncomment on first run of application to create table once
    spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true        

- On your browser, the root port is 8080. -- this should output a 'Hello World' on your browser display.

  <Code> http://localhost:8080 </Code> 

  Other routes to check out:

    <Code> http://localhost:8080/hello/{a string} </Code> 
    <br>
    <Code> http://localhost:8080/capitalize/{a string} </Code> 
    <br>
    <Code> http://localhost:8080/reverse?sentence={a string}</Code> 
    <br>
    <Code> http://localhost:8080/albums</Code> 