package org.example;

import java.util.Arrays;

public class BubbleSearchClass {
    public static void main(String[] args) {
        int[] arr = {-1, 100, 9, 0, 5, 7, -10};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

}
