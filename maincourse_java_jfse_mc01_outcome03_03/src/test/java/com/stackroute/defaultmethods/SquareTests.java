package com.stackroute.defaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnTheArea1(){
        Assertions.assertEquals(169,new Square("Blue",13).getArea());
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnTheArea2(){
        Assertions.assertEquals(0,new Square("Black",-10).getArea(),"Negative numbers are provided");
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnThePerimeter1(){
        Assertions.assertEquals(32,new Square("White",8).getPerimeter());
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnThePerimeter2(){
        Assertions.assertEquals(0,new Square("yellow",-25).getPerimeter(),"Negative number for side is provided");
    }
    @Test
    public void display(){
        Assertions.assertEquals("Square={side=50}",new Square("yellow",50).toString());
    }
}