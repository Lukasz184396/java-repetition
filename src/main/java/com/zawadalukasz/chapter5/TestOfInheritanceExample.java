package com.zawadalukasz.chapter5;

public class TestOfInheritanceExample {
    public static void main(String[] args) {
        SpecialSwan specialSwan = new SpecialSwan();
        System.out.println( specialSwan.getInfo() );  // SpecialSwan in age: 5
    }

}

abstract class Animal2 {
    protected int age = 5;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getInfo();
}

class Swan extends Animal2 {
    // protected int age;       //inherited and not declared here
    @Override
    public String getInfo() {
        return "Swan";
    }
}

class SpecialSwan extends Swan {
    // protected int age;       //inherited and not declared here
    public String getInfo() {
        return "SpecialSwan in age: " + age;
    }
}