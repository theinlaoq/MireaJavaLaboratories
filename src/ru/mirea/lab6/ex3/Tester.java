package ru.mirea.lab6.ex3;

public class Tester {
    public static void main(String[] args) {
        Planet testplanet = new Planet("test");
        System.out.println(testplanet.getName());

        Car testCar = new Car("testCar");
        System.out.println(testCar.getName());

        Animal testAnimal = new Animal("Gleb");
        System.out.println(testAnimal.getName());
    }
}
