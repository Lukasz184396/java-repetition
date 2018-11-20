package com.zawadalukasz.chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingASecondExceptionExample {
    public static void main(String[] args)  {
        FileReader reader = null;
        try {
            System.out.println("trying to read");
            reader = read();
        } catch (IOException e) {
            try {
                System.out.println("trying to close");
                if (reader != null) reader.close();
//                throw new Exception();
            } catch (IOException inner) {
                System.out.println("inside inner IOException handler");
            }
        }
        System.out.println("success");
    }

    private static FileReader read() throws IOException {
        throw new IOException();
        //return new FileReader("fileName");
    }
}
