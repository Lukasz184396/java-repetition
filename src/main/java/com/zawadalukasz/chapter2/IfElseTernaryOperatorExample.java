package com.zawadalukasz.chapter2;

public class IfElseTernaryOperatorExample {
    public static void main(String[] args) {
        int y = 10;
        int x;
        if(y<5) {
            x=2*y;
        } else {
            x = 3*y;
        }
        System.out.println(x);
        System.out.println("*********************************");

        x = (y<5) ? (2*y) : 3*y;
        System.out.println(x);
        System.out.println("*********************************");

        // (y<5) ? ( 2*y) :  3*y;       //not a statement
        // (y<5) ? (x=2) : x=3;         //not a statement after ? might by online value not assignment

        System.out.println((y<5) ? 21 : "Zebra");       //21 is a value and "Zebra" too
        // int animal = (y<5) ? 21 : "Zebra";           //not compile incompatible types




    }
}
