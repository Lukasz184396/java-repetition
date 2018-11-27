package com.zawadalukasz.chapter3;

public class WraperClassTest {

    public static void main(String[] args) {
        Boolean booleanValue = new Boolean(true);         //ok
        System.out.println(booleanValue);                       //true

       // Boolean booleanValue = new Boolean(TRUE);         //does not compile
        Boolean booleanValue2 = new Boolean(Boolean.TRUE);       //true ok

        Boolean booleanValueString = new Boolean("tRuE");    //ok
        System.out.println(booleanValueString);                 //true

        Boolean booleanValueString2 = new Boolean("abc");    //ok
        System.out.println(booleanValueString2);                 //false

        //Boolean booleanValueString2 = new Boolean(abc);       //does not compile
        System.out.println(booleanValueString2);                 //false

        //new Byte(1);      //does not compile
        Byte byteValue = new Byte("1");
        System.out.println(byteValue);
        Byte byteValue2 = new Byte((byte) 2);
        System.out.println(byteValue2);

        Float floatValue = new Float("5.0");
        System.out.println(floatValue);

        Float floatValue2 = new Float(1.0);
        System.out.println(floatValue2);

        //Character characterString = new Character("5"); //does not compile with String
        Character character = new Character('a');
        System.out.println(character);

        Character character1 = new Character((char )5);     //ok
        System.out.println(character1);

        //Character character2 = new Character(4);  //does not compile int

        // Character character3 = new Character('55');  //two digits does not compile
    }
}
