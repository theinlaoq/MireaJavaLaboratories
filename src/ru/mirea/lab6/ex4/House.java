package ru.mirea.lab6.ex4;

public class House implements Priceable{
    private float price;

    public House(float price) {
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                '}';
    }
}
