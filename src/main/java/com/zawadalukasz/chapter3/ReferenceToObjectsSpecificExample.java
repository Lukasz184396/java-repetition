package com.zawadalukasz.chapter3;

public class ReferenceToObjectsSpecificExample {
    public static void main(String[] args) {
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder();      // DOES NOT COMPILE
        objects[0] = new StringBuilder();             // careful!
        /**
         * Line 5 creates an array of type String.
         * Line 6 doesn’t require a cast because Object is a broader type than String.
         * On line 7, a cast is needed because we are moving to a more specific type.
         * Line 8 doesn’t compile because a String[] only allows String objects and StringBuilder is not a String.
         * Line 9 is where this gets interesting. From the point of view of the compiler, this is just fine.
         * A StringBuilder object can clearly go in an Object[].
         * The problem is that we don’t actually have an Object[].
         * We have a String[] referred to from an Object[] variable.
         * At runtime, the code throws an ArrayStoreException.!!!
         */
    }
}
