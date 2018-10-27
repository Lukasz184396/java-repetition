package com.zawadalukasz.chapter1;

public class LongNeedsLLetterOnTheEndTest {
    public static void main(String[] args) {
        long walueInScopeOfIntIsOkWithoutL = 123;
        // long valueOutOfScopeOfIntNeedsL = 9876543210; does not compile
        long valueOutOfScopeOfIntNeedsL = 9876543210L;
        long valueOutOfScopeOfIntNeedsBigLorSmall = 9876543210l;
        System.out.println(walueInScopeOfIntIsOkWithoutL);
        System.out.println(valueOutOfScopeOfIntNeedsL);
        System.out.println(valueOutOfScopeOfIntNeedsBigLorSmall);
    }
}
