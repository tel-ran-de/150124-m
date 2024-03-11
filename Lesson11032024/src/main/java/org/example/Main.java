package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for(int i  = 0; i < 10; i++) {
//            System.out.println(i + 1);
//        }

//        for(int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//        System.out.println("i = " + i);

//        int i = 0;
//        for(; i < 10; i++) {
//            System.out.println("i = " + (i + 1));
//        }
//        System.out.println("i = " + i);
//        Scanner sc = new Scanner(System.in);
//        for (;;) {
//            System.out.println("Guess a number:");
//            int num = sc.nextInt();
//            if (num == 10) {
//                System.out.println("You're right!");
//                break;
//            } else {
//                System.out.println("Try one more time");
//            }
//        }

//        String[] strArr = {"Hello", "Hi", "Hola", "Ni hao", "Ciao"};
//        System.out.println("For each");
//        for(String greeting: strArr) {
//            System.out.println(greeting);
//        }
//        System.out.println();
//
//        System.out.println("For");
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}