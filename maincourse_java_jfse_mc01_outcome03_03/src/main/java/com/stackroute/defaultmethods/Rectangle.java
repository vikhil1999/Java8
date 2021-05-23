package com.stackroute.defaultmethods;

/*
Rectangle class defines the properties of a Rectangle object and implements the default methods of Room interface
 */
public class Rectangle extends AbstractRoom {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    private int breath;

    public Rectangle(String color,int length, int breath) {
        super(color);
        this.length=length;
        this.breath=breath;
    }

    @Override
    public double getArea() {
        if(length<0 || breath <0)
            return 0;
        else
            return length*breath;
    }

    @Override
    public double getPerimeter() {
        if(length<0||breath<0)
            return 0;
        else
            return (2*(length+breath));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breath=" + breath +
                '}';
    }
}