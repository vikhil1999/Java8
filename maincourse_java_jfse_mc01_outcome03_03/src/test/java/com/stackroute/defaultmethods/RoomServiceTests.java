package com.stackroute.defaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoomServiceTests {
    @Test
    public void RoomServiceTest1(){
        Assertions.assertEquals(25,new RoomService().createSquare("grey",5).getArea());
    }
    @Test
    public void RoomServiceTest2(){
        Assertions.assertEquals(3770,new RoomService().createRectangle("violet",58,65).getArea());
    }
    @Test
    public void RoomServiceTest3(){
        Assertions.assertEquals(20,new RoomService().createSquare("silver",5).getPerimeter());
    }
    @Test
    public void RoomServiceTest4(){
        Assertions.assertEquals(246,new RoomService().createRectangle("majenta",58,65).getPerimeter());
    }
    @Test
    public void RoomServiceTest5(){
        Room room1=new Square("green",40);
        Room room2=new Rectangle("indigo",50,75);
        Assertions.assertEquals(-1,new RoomService().compareRoomArea(room1,room2));
    }
    @Test
    public void RoomServiceTest6(){
        Room room1=new Square("green",40);
        Room room2=new Rectangle("indigo",30,15);
        Assertions.assertEquals(1,new RoomService().compareRoomArea(room1,room2));
    }
    @Test
    public void RoomServiceTest7(){
        Room room=new Square("Black",5);
        Assertions.assertEquals("rounded area 25.0  perimeter 20.0",new RoomService().getRoomSummary(room));
    }
}