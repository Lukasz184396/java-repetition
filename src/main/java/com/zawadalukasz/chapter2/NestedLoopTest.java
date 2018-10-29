package com.zawadalukasz.chapter2;

public class NestedLoopTest {
    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for (int i = 0; i < myComplexArray.length; i++) {
            for (int j = 0; j < myComplexArray[i].length; j++) {
                System.out.print(myComplexArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        for(int[] elem : myComplexArray){
            for (int i = 0; i < elem.length; i++) {
                System.out.print(elem[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        for(int[] elem : myComplexArray) {
            for(int e : elem) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }

}
