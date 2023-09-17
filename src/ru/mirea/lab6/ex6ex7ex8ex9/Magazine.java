package ru.mirea.lab6.ex6ex7ex8ex9;

import java.time.LocalDate;

public class Magazine implements Printable{
    private String name;
    private LocalDate date;
    private String description;

    public Magazine(String name, LocalDate date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println(name + " " + date + ":");
        System.out.println(description);
    }
}
