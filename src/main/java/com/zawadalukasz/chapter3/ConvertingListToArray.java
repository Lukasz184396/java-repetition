package com.zawadalukasz.chapter3;

import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {

    /**
     *  The original array and created array backed List are  L I N K E D!!!
     *  When a change is made to one, it is available in the other.
     *  It is a F I X E D - S I  Z E list and is also known a backed List because the array changes with it.
     *
     * */
    public static void main(String[] args) {
        String[] array = { "hawk", "robin" };             // [hawk, robin]
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());                  // 2
        list.set(1, "test");                              // [hawk, test]
        array[0] = "new";                                 // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1);                             // throws UnsupportedOperation Exception
    }


}
