package com.zawadalukasz.chapter1;

public class TestCaseSensitivityOfJava {
    public static void main(String[] args) {
        TestCaseSensitivityOfJava testCaseSensitivityOfJava = new TestCaseSensitivityOfJava();
        testCaseSensitivityOfJava.smallLetterStarting();
        testCaseSensitivityOfJava.SmallLetterStarting();
    }

    public void smallLetterStarting() {
        System.out.println("small letter");
    }
    public void SmallLetterStarting() {
        System.out.println("Capital letter is treated as other method and compile");}

}
