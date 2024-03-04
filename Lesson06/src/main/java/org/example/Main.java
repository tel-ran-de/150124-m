package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Default constructor
        Animal dog = new Animal();
        dog.name = "Spike";
        dog.age = 12;
//        dog.name.equals("Spike");
//        dog.color = "White";
        System.out.println(dog.name + " " + dog.age);
        dog.animalInfo();


//      Constructor with age param
        Animal cat = new Animal(10);
        cat.name = "Tom";
        System.out.println(cat.name + " " + cat.age);
        cat.animalInfo();

//      Constructor with all params
        Animal mouse = new Animal(5, "Jerry");
        System.out.println(mouse.name + " " + mouse.age);
//        mouse.animalInfo();
    }
}