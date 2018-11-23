package com.zawadalukasz.chapter2;

public class IfElseUnreachableCodeExample {

    public static final String GOOD_MORNING = "Good Morning";
    public static final String GOOD_AFTERNOON = "Good Afternoon";
    public static final String GOOD_EVENING = "Good Evening";

    public static void main(String[] args) {
        System.out.println("Unreachable code compiles without issue");
        int hourOfDay = 14;

        if(hourOfDay < 15) {
            System.out.println(GOOD_AFTERNOON);
        } else if(hourOfDay < 11){
            System.out.println(GOOD_MORNING);
        } else {
            System.out.println(GOOD_EVENING);
        }

    }

}
