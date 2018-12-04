package com.zawadalukasz.chapter4;


import java.util.function.Predicate;

public class PredicatePandaExample {

}

class Panda {
    int age;

    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.age = 1;
        check(panda, (Panda p) -> p.age <5);
        check(panda, p -> p.age <5);
        check(panda, p -> {return p.age <5;});
    }

    private static void check(Panda panda, Predicate<Panda> pandaPredicate) {
        String result = pandaPredicate.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}