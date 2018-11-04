package com.zawadalukasz.chapter5;

public class ConstructorExample {
    private String property;

    public ConstructorExample(String property) {
        this.property = property;
    }

    public static void main(String[] args) {

    }
}

class ConstructorExampleChild extends ConstructorExample {
//    public ConstructorExampleChild() {
//
//    }
    //does not compile it by default is inserted super(); to child constructor
    // so it is created param constructor in parent, there is no
    // constructor without parameters!!!


//    public ConstructorExampleChild() {
//        System.out.println("cos");
//        this("2"); does not compile this must be first statement in the constructor
//    }

    public ConstructorExampleChild(String property) {
        super(property); //it compiles because it is constructor with one param in parent class
    }

}


