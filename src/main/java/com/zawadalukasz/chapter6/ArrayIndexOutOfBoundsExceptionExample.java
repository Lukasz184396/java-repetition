package com.zawadalukasz.chapter6;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        //************************************************
        //String[] animals = new String[0];
        //System.out.println(animals[0]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        //************************************************
        String[] animals = new String[1];
        System.out.println(animals[0]); // print: null
    }
}
