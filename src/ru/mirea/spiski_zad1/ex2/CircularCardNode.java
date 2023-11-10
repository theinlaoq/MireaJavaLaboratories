package ru.mirea.spiski_zad1.ex2;

import java.util.Scanner;

public class CircularCardNode {
    private String name;
    private int age;
    private CircularCardNode next;

    public CircularCardNode() {
        this.name = "";
        this.age = 0;
        this.next = null;
    }

    public void readAttributesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        this.name = scanner.nextLine();

        System.out.println("Введите возраст:");
        this.age = scanner.nextInt();

        scanner.close();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }

    public CircularCardNode getNext() {
        return this.next;
    }

    public void setNext(CircularCardNode next) {
        this.next = next;
    }
}