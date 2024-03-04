package org.example;

public class Animal {
    int age;
    String name;
//    String color;

    public Animal() {}
    public Animal(int age) {
        this.age = age;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        this.animalInfo();
//        new Animal();
    }

    public void animalInfo() {
        System.out.println("This is a " + this.name);
    }
}
