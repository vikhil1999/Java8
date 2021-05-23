package com.stackroute.defaultmethods;

/*
Square class defines the properties of a Square object and implements the default methods of Room interface
 */
public class Square extends AbstractRoom{
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;
    public Square(String color,int side){
        super(color);
        this.side=side;
    }

    @Override
    public double getArea() {
        if(side<0)
            return 0;
        else
            return side*side;
    }

    @Override
    public double getPerimeter() {
        if(side<0)
            return 0;
        else
            return 4*side;
    }

    @Override
    public String toString() {
        return "Square={" +
                "side=" + side +
                '}';
    }
}
