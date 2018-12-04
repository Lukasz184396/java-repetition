package com.zawadalukasz.chap4;


//class used to test AcccessModifiersExample in chapter4

public class ClassRoom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;

    public ClassRoom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }
}
