package org.example;

public class Main {
    public static void main(String[] args) {
//        int num = 5;
//        System.out.println(-num);
//        for(int i = 0; i < num; i++) {
//            System.out.println(i);
//        }

//        int x1 = num++; // постфиксный инкремент
//        System.out.println(num1);
//        int x2 = ++num; // префексный инкремент
//        System.out.println(x1 + " " + x2);
//        int res = x1 / x2;
//        System.out.println(res);
//        Создайте и инициализируйте переменную int = 10
//        В блоке if сравните созданную переменную со значением 15
//        После блока добавьте инструкцию System.out.println("I am Not in if");
//        Проанализируйте вывод

        int num = -11;
//        if (isEquals(num)) {
//            System.out.println("In if");
//            System.out.println(num + " == 15");
//        } else {
//            System.out.println("In else");
//            System.out.println(num + " != 15");
//        }
//        System.out.println("I am Not in if");
//        System.out.println(isEqualsTernarnyMany(num));
//        isEqualsIfMany(num);/**/
        isEqualsLadder(num);

    }

    public static boolean isEquals(int num) {
        if (num == 15) {
            return true;
        }
        return false;
    }

    public static String isEqualsTernarny(int num) {
//        condition ? cond_true : cond_false
        return num == 15 ? "Equals 15" : "Not equals 15";
    }

    public static String isEqualsTernarnyMany(int num) {
//        condition ? cond_true : cond_false ? cond_f_true : cond_f_false
        return num == 15 ? "Equals 15" : num < 10 ? "Less than 10" : "More than 10";
    }

    public static void isEqualsIfMany(int num) {
        if (num == 15) {
            System.out.println("Equals 15");
        } else {
            if (num < 10) {
                System.out.println("Less than 10");
            } else {
                System.out.println("More than 10");
            }
        }
    }

    public static void isEqualsLadder(int num) {
        if (num == 15) {
            System.out.println("Equals 15");
        } else if (num < 15 && num > 0) {
            System.out.println("Less than 15");
        } else if (num > 15 && num < 20) {
            System.out.println("Between 15 and 20");
        } else if (num < 0) {
            System.out.println("Less than 0");
        } else {
            System.out.println("Another number");
        }
    }
}