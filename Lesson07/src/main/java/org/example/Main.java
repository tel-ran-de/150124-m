package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
//        getSum(a, b);
//        5! = 1 * 2 * 3 * 4 * 5
        System.out.println(a + "! = " + getFactorial(a));
//        printHello();
        Random rand = new Random();

        //nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//        System.out.println(rand.nextInt(10));

        //nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//        System.out.println(rand.nextFloat());

        //nextDouble() генерирует двойное число между 0.0 и 1.0.
//        System.out.println(rand.nextDouble());


    }

    public static void getSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void printHello() {
        System.out.println("Hello.");
    }

    public static int getFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }


}

//Создайте метод getSum(int a, int b), который ничего не возвращает,
// и печатает результат суммы двух полученных чисел в консоль.


//Использование Random класса:
//Импортировать класс java.util.Random
//Создать экземпляр класса Random (Random rand = new Random())
//Вызовите один из следующих методов объекта rand:
//nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//nextDouble() генерирует двойное число между 0.0 и 1.0.
