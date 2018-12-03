package com.zawadalukasz.chapter6;

import java.io.IOException;


public class SystemExitInTryCatchExample {

    public static void main(String[] args) {

        try {
            System.exit(1);
            methodThrowingException();

        } catch (IOException e) {
            System.out.println("System exiting");

        } finally {
            System.out.println("finally never printed");
        }

    }

    public static void methodThrowingException() throws IOException {
        throw new IOException("IOException in methodThrowingException");
    }

}
