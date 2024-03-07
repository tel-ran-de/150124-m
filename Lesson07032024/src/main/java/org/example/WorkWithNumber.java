package org.example;

import java.util.Random;

public class WorkWithNumber {
    public static void main(String[] args) {
//        Random random = new Random();
//        int num = 879;//random.nextInt(900) + 100; 800 + 90 + 7
////      897
//        int nLast = num % 10; // 7
//        int nFirst = num / 100; // 8
//        int nMiddle = num / 10 % 10; // 9
//
//        System.out.println(nFirst + " " + nMiddle + " " + nLast);
//        if (nLast >= nFirst && nLast >= nMiddle) {
//            System.out.println(nLast);
//        } else if (nFirst >= nLast && nFirst >= nMiddle) {
//            System.out.println(nFirst);
//        } else
//        System.out.println(nMiddle);
        double num1 = 8.5;
        double num2 = 11.45;
        int ten = 10;
        double b = Math.abs(ten - num1);
        double c = Math.abs(ten - num2);
        if (b == c) {
            System.out.println("Numbers " + num1 + " and " + num2 + " equidistant about " + ten);
        }
        if (b > c) {
            System.out.println("Number " + num2 + " closer to " + ten);
        }
        if (b < c) {
            System.out.println("Number " + num1 + " closer to " + ten);
        }

    }
}

// Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное
// число и его наибольшую цифру.
// Например: 398
// Выход: 9
