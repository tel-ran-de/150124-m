package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = getNumbers();
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getNumbers() {
        int[] arr = {1, 2, 3, 5};
        return arr;
    }
}