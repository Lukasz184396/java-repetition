package com.zawadalukasz.chapter4;

public class ToManyConversions {
    public static void play(Long l) {}
    public static void play(Long... l) {}

    public static void main(String[] args) {
        // play(new Integer(4));    //does not compile
        // play(4);                 //does not compile
        play(4L);
    }

    /*
    * Java can convert form int to long or Integer
    * It can not handle in 2 steps first to long and second to Long
    * If we had public static void play(Object o) it will be ok
    * it was from int to Integer (Integer is Object)
    * */
}
