package com.zawadalukasz.chapter6;

public class HidingExceptionByFinallyExample {
    public static void main(String[] args) {
        System.out.print("a ");
        try {
            System.out.print(" b ");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c ");
            throw new RuntimeException(" 1 ");
        } catch (RuntimeException e) {
            System.out.print(" d");
            throw new RuntimeException(" 2 "); //not thrown
        } finally {
            System.out.print(" e ");
            throw new RuntimeException(" 3 ");
        }
    }
}
