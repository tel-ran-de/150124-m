package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        String s1 = "Java";
//        String s2 = "Java";
//        String s3 = new String("Java");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
//
//        System.out.println(Objects.equals(s1, s2));
//        System.out.println(Objects.equals(s1, s3));
//        System.out.println(Objects.equals(s2, s3));

//        StringBuilder()
//        Создает экземпляр без символов и начальной емкостью 16 символов.
//                StringBuilder(int capacity)
//        Создает экземпляр без символов и начальной емкости, заданной аргументом capacity.
//        StringBuilder(CharSequence seq)
//        Создает экземпляр, содержащий те же символы, что и указанный CharSequence.
//                StringBuilder(String str)
//        Создает экземпляр, инициализированный содержимым указанной строки.

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(25);
        String str = "Java";
        StringBuilder sb3 = new StringBuilder(str);

        sb1.append("HelloHelloHelloHello");
        sb2.append("HelloHelloHelloHelloHelloHello");
//        sb2.append("Java");
//        sb2.append("2025");
//        sb2.append("!!!");

//        System.out.println(sb1.capacity());
//        System.out.println(sb2.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb2.length());
//        System.out.println(sb1);
//        System.out.println(sb2);
        System.out.println(str);
        System.out.println(sb3);
        System.out.println(sb3.reverse());

//        System.out.println(Objects.hashCode(sb1));
//        System.out.println(sb1.hashCode());
        String str1 = new String(sb3);
        System.out.println(str1);

    }
}