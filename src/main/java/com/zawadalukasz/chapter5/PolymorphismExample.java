package com.zawadalukasz.chapter5;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExample {

}

interface CanSwim  {}
class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
class FindAllTadpole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;        //CanSwim
        }

        for (Amphibian amphibian : tadpoles) {
            Amphibian tadpole = amphibian;
        }

        for (Amphibian amphibian : tadpoles) {
            Object tadpole = amphibian;
        }

        for (Amphibian amphibian : tadpoles) {
            Tadpole tadpole = (Tadpole) amphibian;
        }
    }
}