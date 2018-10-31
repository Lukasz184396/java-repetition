package com.zawadalukasz.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        // LIST TO ARRAY
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);

        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);

        stringArray[1] = "new robin";

        System.out.println(Arrays.toString(stringArray));
        System.out.println(list);
        System.out.println(Arrays.toString(objectArray));

    }
}
