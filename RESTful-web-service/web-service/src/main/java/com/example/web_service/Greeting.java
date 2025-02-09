package com.example.web_service;

/**
 * Greeting is a resource representation class, which is a 
 * Java object representation of the artifact that is served 
 * up in response to a resource request from the client.
 * 
 * @param id - unique identifier for the for the greeting
 * @param content - textual representation of the greeting
 */
public record Greeting(long id, String content) { }
