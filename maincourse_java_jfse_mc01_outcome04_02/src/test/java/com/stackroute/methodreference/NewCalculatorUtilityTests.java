package com.stackroute.methodreference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Write test cases for positive and negative scenarios*/
public class NewCalculatorUtilityTests {
    @Test
    public void getPowerResult1(){
        Assertions.assertEquals(9,new NewCalculatorUtility().getPowerResult(3,2));
    }
    @Test
    public void getPowerResult2(){
        Assertions.assertEquals(16.0,new NewCalculatorUtility().getPowerResult(4.0,2.0));
    }
    @Test
    public void getPowerResult3(){
        Assertions.assertEquals(0.00,new NewCalculatorUtility().getProductResult(0.0,0.0));
    }
    @Test
    public void getPowerResult4(){
        Assertions.assertEquals(1,new NewCalculatorUtility().compute(4,0));
    }
    @Test
    public void getProductResult1(){
        Assertions.assertEquals(121,new NewCalculatorUtility().getProductResult(11,11));
    }
    @Test
    public void getProductResult2(){
        Assertions.assertEquals(220.0,new NewCalculatorUtility().getProductResult(22,10.0));
    }
    @Test
    public void getProductResult3(){
        Assertions.assertEquals(144,new NewCalculatorUtility().getProductResult(12.0,12.0));
    }
}
