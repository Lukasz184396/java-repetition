package com.zawadalukasz.chapter3;

import java.util.ArrayList;
import java.util.List;

public class BoxingNullExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(null);

        int intValue = integers.get(0);     //Exception in thread "main" java.lang.NullPointerException
    }
}
