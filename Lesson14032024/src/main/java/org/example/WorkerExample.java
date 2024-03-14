package org.example;

import java.util.Objects;

public class WorkerExample {
    public static void main(String[] args) {
        Worker worker = new Worker(20);
        worker.setName("Aramis");
        worker.setAge(22);
//        System.out.println(worker.getName() + " " + worker.getAge() + " " + worker.getSalary());
        worker.printInfo();
        System.out.println(worker.toString());
        System.out.println(worker.getClass());

    }
}
