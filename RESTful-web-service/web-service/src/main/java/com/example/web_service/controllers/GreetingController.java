package com.example.web_service.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.web_service.Greeting;

// HTTP request are handled by a controller in Springs approach
// to building RESTful web services, these components are identified
// by the @RestController annotation.

/**
 * This controller handles HTTP requests for greeting messages.
 * It provides a RESTful web service endpoint to generate greetings.
 */
@RestController
public class GreetingController {

    //Template for the greeting message.
    //The placeholder %s will be replaced with the name provided in the request.
    private static final String template = "Hello, %s!";
    
    //Counter to keep track of the number of greetings generated
    private final AtomicLong counter = new AtomicLong();

    /**
     * This method handles GET requests for /greeting.
     * It returns a new instance of the Greeting class with the next value of the counter
     * and the name provided in the request.
     * 
     * @Annotation GetMapping - This annotation ensures that HTTP GET requests to /greeting 
     * are mapped ot the greeting() method.
     * @Annotation RequestParam - This annotation binds the value of the query string parameter
     * name into the name paramter of the greeting() method. If the name parameter is absent 
     * in the request, the defaultValue of "World" is used.
     * @param name - the name to be included in the greeting message
     * @return a new instance of the Greeting class with id and content attributes based on the 
     * next value of the counter and formats the given name by using the greeting template.
     */

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //Return a new instance of the Greeting class with the next value of the counter
        //and the name provided in the request.
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}