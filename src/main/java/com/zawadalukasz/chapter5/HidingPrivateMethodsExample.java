package com.zawadalukasz.chapter5;



public class HidingPrivateMethodsExample {

}

class FlyingAnimal {
    private void fly() {  //private can be hidden
        System.out.println("FlyingAnimal is flying");
    }
    public static void main(String[] args) {
        FlyingAnimal flyingAnimal = new Pelican();
        flyingAnimal.fly();                         //reference decide which hidden method is called
    }

}

class Pelican extends FlyingAnimal {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}