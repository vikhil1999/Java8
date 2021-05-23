package com.stackroute.defaultmethods;

/*
    RoomService class has methods for creating room objects, comparing room and providing room summary.
 */
public class RoomService {
    public Square createSquare(String color, int side){
        Square square=new Square(color, side);
        return square;
    }
    public Rectangle createRectangle(String color, int length, int breath){
        Rectangle rectangle=new Rectangle(color,length,breath);
        return rectangle;
    }
    public static int compareRoomArea(Room room1,Room room2){
        if(room1.getArea()==room2.getArea()){
            return 0;
        }
        else if(room1.getArea()>room2.getArea()){
            return 1;
        }
        else
            return -1;
    }
    public static String getRoomSummary(Room room){
        String result=("rounded area "+room.getArea()+"  "+"perimeter "+room.getPerimeter());
        return result;
    }
}
