package com.example.Exceptions;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(String message) {
        super(message);
    }
}