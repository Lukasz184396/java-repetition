package com.zawadalukasz.chapter4;

public class StaticVsInstance {
    private String name  = "non static variable";
    public static void first() {}
    public static void second() {}
    public void third() {
        System.out.println();
    }

    public static void main(String[] args) {
        first();
        second();
        //third(); //does not compile to call nonstatic method in static method
    }
}
