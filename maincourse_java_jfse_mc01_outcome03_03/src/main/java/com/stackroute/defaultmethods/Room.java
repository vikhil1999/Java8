package com.stackroute.defaultmethods;

/*
    Room Interface defines the default methods to be implemented by all classes of type Room
 */
public interface Room {
    double getArea();
    double getPerimeter();
    default void area(){
    }
    default void perimeter(){
    }
}
