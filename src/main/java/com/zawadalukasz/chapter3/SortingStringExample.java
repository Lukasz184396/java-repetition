package com.zawadalukasz.chapter3;

import java.util.Arrays;

public class SortingStringExample {
    public static void main(String[] args) {
        String[] strings = {"10","100","9", "Ala", "ala", "a2a"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
