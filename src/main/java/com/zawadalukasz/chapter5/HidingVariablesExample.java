package com.zawadalukasz.chapter5;

public class HidingVariablesExample {
    public static void main(String[] args) {
        JellyFish jellyFish = new JellyFish();
        Animal animal = new Animal();           //reference type decide which value is used
        Animal animal2 = new JellyFish();
        JellyFish jellyFish2 = (JellyFish) animal2;
        System.out.println(jellyFish.length);  //1111
        System.out.println(animal.length);     //2
        System.out.println(animal2.length);    //2
        animal.display();                      //Animal
        animal2.display();                     //Fish
        jellyFish.display();                   //Fish
        animal.staticDisplay();                //Animal static
        animal2.staticDisplay();               //Animal static
        jellyFish.staticDisplay();             //Fish static
        System.out.println(jellyFish2.length); //1111
    }

}

class Animal {
    public int length = 2;
    public void display() {
        System.out.println("Animal");
    }
    public static void staticDisplay() {
        System.out.println("Animal static");

    }
}

class JellyFish extends Animal{
    public int length = 1111;
    public void display() {
        System.out.println("Fish static");
    }
    public static void staticDisplay() {
        System.out.println("Fish");
    }
}
