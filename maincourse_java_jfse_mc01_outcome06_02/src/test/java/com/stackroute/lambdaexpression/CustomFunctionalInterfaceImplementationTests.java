package com.stackroute.lambdaexpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* Write test cases for positive and negative scenarios*/
public class CustomFunctionalInterfaceImplementationTests {
    @Test
    public void cube1() {
        Assertions.assertEquals(64,CustomFunctionalInterfaceImplementation.cube.doJob(4),"It should return the cube of a number");
    }
    @Test
    public void cube2(){
        Assertions.assertEquals(27,CustomFunctionalInterfaceImplementation.cube.doJob(3));
    }
    @Test
    public void cube3(){
        Assertions.assertEquals(8,CustomFunctionalInterfaceImplementation.cube.doJob(2));
    }
    @Test
    public void cube4(){
        Assertions.assertEquals(0,CustomFunctionalInterfaceImplementation.cube.doJob(0));
    }
    @Test
    public void changeCase1(){
        Assertions.assertEquals("VikhiL rEDDY",CustomFunctionalInterfaceImplementation.changeCase.doJob("vIKHIl Reddy"));
    }
    @Test
    public void changeCase2(){
        Assertions.assertEquals("",CustomFunctionalInterfaceImplementation.changeCase.doJob(""));
    }
}
