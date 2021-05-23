package com.stackroute.defaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTests {
    @Test
    public void getArea1(){
        Assertions.assertEquals(529,new Square("pink",23).getArea());
    }
    @Test
    public void getArea2() {
        Assertions.assertEquals(132, new Rectangle("black", 11,12).getArea());
    }
    @Test
    public void getPerimeter1(){
        Assertions.assertEquals(92,new Square("Pink",23).getPerimeter());
    }
    @Test
    public void getPerimeter2(){
        Assertions.assertEquals(46,new Rectangle("Black",11,12).getPerimeter());
    }
}