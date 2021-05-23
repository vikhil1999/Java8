package com.stackroute.defaultmethods;

/*
    Abstract class AbstractRoom defines the common properties and methods for objects of type Room
 */
public abstract class AbstractRoom implements Room{
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    public AbstractRoom(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Abstract Room{"+"color="+color+'\''+'}';
    }
}