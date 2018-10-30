package com.zawadalukasz.chapter2;

public class ByteShortAndCharPromotedToInt {

    public static void main(String[] args) {
        byte byteA = 40, byteB = 50;
        //byte sum =  byteA + byteB;        //does not compile
        //byte sum = (byte) byteA + byteB;  //does not compile
        byte sumByte = (byte) (byteA+byteB);
        System.out.println("sumByte = " + sumByte);

        System.out.println("-----------------------------------------------");

        short shortA = 40, shortB = 50;
        //short sum =  shortA + shortB;        //does not compile
        //short sum = (byte) shortA + shortB;  //does not compile
        short sumShort = (short) (shortA+shortB);
        System.out.println("sumShort = " + sumShort);

        System.out.println("-----------------------------------------------");

        char charA = 'a', charB = 'b';
        //char sumChar =  charA + charB;        //does not compile
        //char sumChar = (char) charA + charB;  //does not compile
        char sumChar = (char) (charA+charB);
        System.out.println("sumChar = " + sumChar);

        int intA = (int) charA;
        int intB = (int) charB;
        int sumInt = intA + intB;
        System.out.println("intA = " + intA);
        System.out.println("intB = " + intB);
        System.out.println("sumInt = " + sumInt);
    }
}
