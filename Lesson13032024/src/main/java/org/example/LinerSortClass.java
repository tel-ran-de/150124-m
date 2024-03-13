package org.example;

import java.util.Arrays;
import java.util.Random;

public class LinerSortClass {
    public static final int ARRAY_LEN = 15;

    public static void main(String[] args) {
        Random rand = new Random();
        int findEl = 0;
        int[] arr = new int[ARRAY_LEN];
        for (int i = 0; i < ARRAY_LEN; i++) {
            arr[i] = rand.nextInt(21) - 10;
        }
        System.out.println("findEl = " + findEl);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[ARRAY_LEN];
        int res = lSearch(arr, findEl);
        if (res > -1) {
            System.out.println(findEl + " has index " + res);
        } else {
            System.out.println(findEl + " not found in the array");
        }
        int[] arr3 = new int[ARRAY_LEN];
        System.out.println(lrSearch(arr, findEl));
    }

    public static int lSearch(int[] arr, int findEl) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findEl) {
                return i;
            }
        }
        return -1;
    }

    public static int lrSearch(int[] arr, int findEl) {
        for (int i = arr.length; i > 0; i--) {
            if (arr[i] == findEl) {
                return i;
            }
        }
        return -1;
    }
}
