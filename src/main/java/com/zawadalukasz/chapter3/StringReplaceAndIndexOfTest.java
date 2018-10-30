package com.zawadalukasz.chapter3;

public class StringReplaceTest {

    public static void main(String[] args) {
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        String start = "AniMaL";
        String trimmed = start.trim(); // "AniMaL"
        System.out.println("trimmed = " + trimmed);
        String lowercase = trimmed.toLowerCase(); //"animal"
        System.out.println("lowercase = " + lowercase);
        String result = lowercase.replace('a', 'A'); //"Animal"
        System.out.println("result = " + result);
        System.out.println(result.indexOf("A")); //return first match


    }
}
