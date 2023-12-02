package ru.mirea.lab6.ex3;

import java.io.Serializable;

public class Animal implements Nameable, Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
