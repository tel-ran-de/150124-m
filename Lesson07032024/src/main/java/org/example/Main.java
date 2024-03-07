package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt(7) + 1;
//        String day = "Monday";
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
//
//        System.out.println("Your choice is " + dayString);
//        switch (day) {
//            case 1, 2, 3, 4, 5:
////            case 2:
////            case 3:
////            case 4:
////            case 5:
//                dayString = "Working day";
//                break;
//            case 6, 7:
////            case 7:
//                dayString = "Weekend";
//                break;
//            default:
//                dayString = "Invalid day";
//        }
//        System.out.println("Today is " + dayString);
//        switch (day) {
//            case "Monday", "Friday":
//                dayString = "Working day";
//                break;
//            case "Saturday", "Sunday":
//                dayString = "Weekend";
//                break;
//            default:
//                dayString = "Wrong day";
//        }

//        switch (day) {
//            case "Saturday":
//                dayString = "Weekend";
//                break;
//            case "Sunday":
//                dayString = "Weekend";
//                break;
//            default:
//                dayString = "Working day";
//        }
        System.out.println(dayString);
    }
}

//Создайте switch-блок с днями недели
//Создайте переменные int day; String dayString;
//В каждом кейсе инициализируйте переменную dayString правильным значением.
//        Запустите программу, передав в switch-условие день 2.
//В case №4 удалите break;
//Запустите программу
//Проанализируйте вывод
