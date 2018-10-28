package com.zawadalukasz.chapter1.imports;

// YOU DO NOT NEED TO IMPORT CLASS FORM THE SAME PACKAGE IF CLASS HAS DEFAULT OR PUBLIC ACCESS

//import java.lang.*;
//import java.lang.System;
//import com.zawadalukasz.chapter1.imports.Water;
//import com.zawadalukasz.chapter1.imports.*;


public class ImportClassFromPackageTest {
    public void print(Water water) {
        System.out.println(water);
    }

    public static void main(String[] args) {
        ImportClassFromPackageTest importClassFromPackageTest = new ImportClassFromPackageTest();
        importClassFromPackageTest.print(new Water());
    }
}

