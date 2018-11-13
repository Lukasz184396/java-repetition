package com.zawadalukasz.chapter5;

public class HidingVariablesExample {
    public static void main(String[] args) {
        JellyFish jellyFish = new JellyFish();
        Animal animal = new Animal();           //reference type decide which value is used
        Animal animal2 = new JellyFish();       
        System.out.println(jellyFish.length);  //1111
        System.out.println(animal.length);     //2
        System.out.println(animal2.length);    //2
    }
}

class Animal {
    public int length = 2;
}

class JellyFish extends Animal{
    public int length = 1111;

}