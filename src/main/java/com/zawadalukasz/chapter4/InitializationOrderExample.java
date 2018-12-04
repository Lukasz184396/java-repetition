package com.zawadalukasz.chapter4;



public class InitializationOrderExample {
    public static void main(String[] args) {
        System.out.print(Order.result + " ");   //"u "
        System.out.print(Order.result + " ");   //"u "
        new Order();
        new Order();
        System.out.print(Order.result + " ");  //"ucrcr"
    }
}
class Order {
    static String result = "";
    { result += "c"; }
    static
    { result += "u"; }
    { result += "r"; }
}
