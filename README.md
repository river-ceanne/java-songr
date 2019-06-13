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