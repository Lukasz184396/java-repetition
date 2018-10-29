package com.zawadalukasz.chapter2;

public class CompoundAssignmentOperatorsTest {

    public static void main(String[] args) {
        long x = 10;
        int y = 5;
        //y = y * x; does not compile
        y = (int) (y * x);

        long a = 10;
        int b = 5;
        b += a;

        System.out.println("The compound operator will first cast x to a long,\n" +
                "apply the multiplication of two long values,\n" +
                "and then cast the result to an int.");
        System.out.println("\nb = " + b);

        Long c = new Long(10);
        Integer d = new Integer(5);
        // d += c;    does not compile

    }
}
