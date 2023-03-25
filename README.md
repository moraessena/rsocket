# RSOCKET SAMPLE APP

## Description 
Just a simple project to test rsocket

### Client
- Uses spring shell to connect to the serve and fire a request/response

### Server
- Just creates a message mapping to receive a number and produce a range from 0 to it.

### Running
- Just 
```shell
mvn clean package spring-boot:run -DskipTests=true
```
on both projects.
- Then on the shell client just type:
```shell
request-response
```
and see the response printed on the console.

#### References
- [Getting Started With RSocket: Spring Boot Client](https://spring.io/blog/2020/03/09/getting-started-with-rsocket-spring-boot-client)
- [Getting Started With RSocket: Spring Boot Server](https://spring.io/blog/2020/03/02/getting-started-with-rsocket-spring-boot-server)
- [Let's Code: GRPC and RSocket](https://www.youtube.com/live/ceLAChVdoas)