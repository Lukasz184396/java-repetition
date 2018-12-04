package com.zawadalukasz.chapter4;
import com.zawadalukasz.chap4.ClassRoom;
public class AccessModifiersExample {
    public static void main(String[] args) {
        //System.out.println(ClassRoom.globalKey);  //not compile other packed and var not public
        ClassRoom room = new ClassRoom(101, "Mr Andrerson");
        //System.out.println(room.roomNumber);      //not compile other packed and var not public
        System.out.println(room.floor);
        //System.out.println(room.teacherName);     //not compile other packed and var not public
    }
}
