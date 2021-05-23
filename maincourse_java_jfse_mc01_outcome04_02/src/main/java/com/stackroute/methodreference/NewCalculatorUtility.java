package com.stackroute.methodreference;

/* Complete the class as per the requirements given in PROBLEM.md */
public class NewCalculatorUtility extends CalculatorUtility {
    @Override
    public double compute(double num1, double num2){
        return (Math.pow(num1,num2));
    }
    public double getPowerResult(double num1, double num2){
        Utility utility=this::compute;
        return utility.show(num1,num2);
    }
    public double getProductResult(double num1, double num2){
        Utility utility=NewCalculatorUtility.super::compute;
        return utility.show(num1,num2);
    }
}
