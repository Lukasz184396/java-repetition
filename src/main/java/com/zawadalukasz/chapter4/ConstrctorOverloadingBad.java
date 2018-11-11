package com.zawadalukasz.chapter4;

import java.util.HashMap;

public class ConstrctorOverloadingBad {
    private String color;
    private int weight;

    public ConstrctorOverloadingBad(int weight) {
        new ConstrctorOverloadingBad(weight, "brown"); //bad, very bad !!! ;-]  Object created by new is ignored!!!
    }

    public ConstrctorOverloadingBad(int weight, String color ) {
        this.color = color;
        this.weight = weight;
    }

    public ConstrctorOverloadingBad() {
        this(2, "yellow"); //correct
    }

    public static void main(String[] args) {
        ConstrctorOverloadingBad bad = new ConstrctorOverloadingBad(5);
        System.out.println(bad.color + " " + bad.weight);                       //color is null

        ConstrctorOverloadingBad good = new ConstrctorOverloadingBad();
        System.out.println(good.color + " " + good.weight);                     //color not null


    }
}
