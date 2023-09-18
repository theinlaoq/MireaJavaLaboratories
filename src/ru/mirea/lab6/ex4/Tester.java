package ru.mirea.lab6.ex4;

public class Tester {
    public static void main(String[] args) {
        Car pricedCar = new Car(100);

        System.out.println(pricedCar.getPrice());

        Ticket pricedTicket = new Ticket(5);

        System.out.println(pricedTicket.getPrice());

        House pricedHouse = new House(3000);

        System.out.println(pricedHouse.getPrice());
    }
}
