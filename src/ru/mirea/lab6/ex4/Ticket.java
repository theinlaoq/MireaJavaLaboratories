package ru.mirea.lab6.ex4;

public class Ticket implements Priceable{
    private float price;

    public Ticket(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                '}';
    }
}
