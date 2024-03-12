package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayMulti {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
//        int deep = 5;
        int[][] matrix = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
//        System.out.println(Arrays.toString(matrix[4]));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
