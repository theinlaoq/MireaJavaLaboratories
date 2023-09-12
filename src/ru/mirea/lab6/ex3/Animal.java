package ru.mirea.lab6.ex3;

public class Animal implements Nameable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
