package com.zawadalukasz.chapter5;

public class VirtualMethodsExample {
    public static void main(String[] args) {
        //Reference type decide which method are accessible - Bird
        Bird bird = new Peacock();      // in object are stored values of variables
        System.out.println(bird.getName());  //display Peacock
    }
}

class Bird {
    public String getName() {
        return "Unknown";
    }
}

class Peacock extends Bird{
    public String getName() {
        return "Peacock";
    }

}