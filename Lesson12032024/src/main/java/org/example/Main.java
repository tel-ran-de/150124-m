package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Length of array = " + array.length);
        System.out.println("\n-----------------------");
//        boolean[] arrayBool = new boolean[10];
//        System.out.println(Arrays.toString(arrayBool));
//        String[] arrayObj = new String[10];
//        System.out.println(Arrays.toString(arrayObj));
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array2));
//        array2[5] = 10;
        System.out.println("array[0] = " + array2[0]);
//        System.out.println("----------------------");
//        System.out.printf("Hello %d!%n", 10);
//        https://www.baeldung.com/java-printstream-printf
    }
}