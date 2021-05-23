package com.stackroute.defaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnTheAreaOfRectangle1(){
        Assertions.assertEquals(72,new Rectangle("Red",9,8).getArea());
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnTheAreaOfRectangle2(){
        Assertions.assertEquals(0,new Rectangle("Red",25,-24).getArea(),"Negative number for one of the parameter is provided");
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnThePerimeterOfRectangle1(){
        Assertions.assertEquals(34,new Rectangle("Red",9,8).getPerimeter());
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnThePerimeterOfRectangle2(){
        Assertions.assertEquals(98,new Rectangle("Red",24,25).getPerimeter());
    }
    @Test
    public void whenTwoNumbersAreGivenThenItShouldReturnThePerimeterOfRectangle3(){
        Assertions.assertEquals(0,new Rectangle("Red",-9,8).getPerimeter());
    }
    @Test
    public void display(){
        Assertions.assertEquals("Rectangle{length=50, breath=55}",new Rectangle("Green",50,55).toString());
    }
}