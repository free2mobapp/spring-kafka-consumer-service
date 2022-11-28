# spring-kafka-consumer-service

Configure IntelliJ to use Java-17

Start Docker deamon, 
in windows run Docker desktop.

Once deamon is up, 
open git bash.
and run 'docker-compose up'
this should load all the images into a container.


Rest application starts in port 8080
To push message into application to consumer

run the following in postman
http://localhost:8080/produce
and in the body pass the following

[
    {
    "id": 3,
    "message": "Message 3"
    },
    {
    "id": 4,
    "message": "Message 4"
    }
]
