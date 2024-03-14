package org.example;

import java.util.Objects;

public class Worker {
    private String name;
    private int age;
    private int id;
    private double salary;
    private static final int DEFAULT_ID = 100;

    public Worker() {
        this.id += DEFAULT_ID;
    }

    public Worker(int age) {
        this.age = age;
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        if (age < 18 || age > 65) {
            System.out.println("ERROR!!! Incorrect age!");
        } else {
            this.age = age;
        }
        this.id += DEFAULT_ID;
        this.salary = salary;
//        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            System.out.println("ERROR!!! Incorrect age!");
        } else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void printInfo() {
        System.out.println("Your name is " + this.name + " and your age is " + this.age);
    }

    @Override
    public String toString() {
        return "Worker: " +
                "name is '" + name + '\'' +
                ", age is " + age +
                ", salary is " + salary;
//        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Double.compare(salary, worker.salary) == 0 && Objects.equals(name, worker.name);
//        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
