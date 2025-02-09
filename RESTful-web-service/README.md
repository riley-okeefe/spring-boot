# RESTful Web Service
## Running the application
This application uses Maven so to run the application we can use `./mvnw spring-boot:run` OR you can build the JAR file with `./mvnw clean package`
and then run the JAR file, as follows:
`java -jar target/gs-rest-service-0.1.0.jar`
## Test the service
Now that the service is running, visit [http://localhost:8080/greeting](http://localhost:8080/greeting), where you should see:


{"id":1,"content":"Hello, World!"}


Provide a `name` query string parameter by visiting http://localhost:8080/greeting?name=User. Notice how the value of the `content` attribute changes from `Hello, World!` to `Hello, User!`, as the following listing shows:


{"id":2,"content":"Hello, User!"}


Another thing to notice here is that the annotation `@RequestParam` in `GreetingController` is working by overriding the default value given to the `name` parameter through the given value in the query string.


The `id` param is also incrementing each tiome the URL is entered, which shows how the `counter` field is being used on each call.
