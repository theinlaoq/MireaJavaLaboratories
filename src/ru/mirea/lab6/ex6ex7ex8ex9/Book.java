package ru.mirea.lab6.ex6ex7ex8ex9;

public class Book implements Printable{
    private String name;
    private String description;

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println(name + ":");
        System.out.println(description);
    }
}
