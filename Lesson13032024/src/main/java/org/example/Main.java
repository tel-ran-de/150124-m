package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int[][] arr = new int[5][5];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = rand.nextInt(10);
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
        int[] arr = {2, 3, 4, 10, 11, -10, 0, 30, -99};
//        int[] arrCopy = Arrays.copyOf(arr, 4);
//        int[] arrCopy = arr;
        int[] arrCopyRange = Arrays.copyOfRange(arr, 1, 6);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrCopy));
//        System.out.println(Arrays.toString(arrCopyRange));
        arr[0] = 20;
//        arrCopy[0] = 100;
//        int[] arrayCopyCopy = Arrays.copyOf(arrCopyRange, arrCopyRange.length);
        Integer[] arrayCopyCopy = new Integer[] {10, 3, 5, 2, 0};
        System.out.println(Arrays.toString(arrayCopyCopy));

//        Arrays.sort(arrayCopyCopy);
        Arrays.sort(arrayCopyCopy, Comparator.reverseOrder());

//        Arrays.sort(arrayCopyCopy, );
//        arrayCopyCopy[0] = 100;

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrCopy));
        System.out.println(Arrays.toString(arrayCopyCopy));
//        System.out.println(Arrays.toString(arrCopyRange));

    }
}