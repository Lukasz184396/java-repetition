package com.zawadalukasz.chapter5;

public class ObjectVsReferenceExample {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object object = lemur;
        String string = (String) object;  //ClassCastException at runtime
                                          //Lemur cannot be cast to java.lang.String

    }
}

class Lemur {
    @Override
    public String toString() {
        return "Lemur{}";
    }
}


