package ru.mirea.lab6.ex4;

public class Car implements Priceable {
    float price;
    public Car(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
