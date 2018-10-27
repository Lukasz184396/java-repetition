package com.zawadalukasz.chapter1;

public class TestCaseSensitivityOfJava {
    public static void main(String[] args) {
        TestCaseSensitivityOfJava testCaseSensitivityOfJava = new TestCaseSensitivityOfJava();
        testCaseSensitivityOfJava.smallLetterStarting();
        testCaseSensitivityOfJava.SmallLetterStarting();
        String Public = "reserved words stars from small letter so Public is ok but public not";
        System.out.println(Public);
    }

    public void smallLetterStarting() {
        System.out.println("small letter");
    }
    public void SmallLetterStarting() {
        System.out.println("Capital letter is treated as other method and compile");}

}
