package ru.mirea.lab2.shop;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Shop implements ShopHelper{
    private Computer[] computers;
    private int size;

    public Shop(Computer[] computers) {
        this.computers = computers;
        this.size = computers.length;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    @Override
    public void add(Computer computer) {
        Computer[] temp = computers.clone();
        computers = new Computer[temp.length + 1];
        System.arraycopy(temp, 0, computers, 0, temp.length);
        computers[computers.length - 1] = computer;
    }

    @Override
    public void delete(Computer computer) {
        int index = 0;
        for(int i = 0; i < computers.length; i++){
            if(computers[i].equals(computer)){
                index = i;
            }
        }
        Computer[] temp = computers.clone();
        computers = new Computer[temp.length - 1];
        System.arraycopy(temp, 0, computers,0, index);
        System.arraycopy(temp, index + 1, computers, index, temp.length - index - 1);
    }

    @Override
    public Computer findByName(String name) throws Exception {
        for(Computer x : computers){
            if(x.getName().equals(name)){
                return x;
            }
        }
        throw new Exception("Computer not found");
    }

    @Override
    public Computer findByCost(int cost) throws Exception {
        for(Computer x: computers){
            if(x.getCost() == cost){
                return x;
            }
        }
        throw new Exception("Computer not found");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + Arrays.toString(computers) +
                '}';
    }
}



class Computer{
    private String name;
    private int cost;

    public Computer(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return getCost() == computer.getCost() && getName().equals(computer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost());
    }
}

class ShopTest{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во компьютеров: ");
        int count = sc.nextInt();
        Computer[] computers = new Computer[count];
        for(int i = 0; i < count; i++){
            System.out.println("Введите параметры компа");
            String name = sc.next();
            int cost = sc.nextInt();
            computers[i] = new Computer(name, cost);
        }

        Shop shop1 = new Shop(computers);
        System.out.println(shop1);
        Computer c1 = new Computer("zemla", 240);
        Computer c2 = new Computer("aksld", 535123);
        shop1.add(c1);
        System.out.println(shop1);
        shop1.add(c2);
        System.out.println(shop1);
        shop1.delete(c1);
        System.out.println(shop1);
        System.out.println(shop1.findByCost(21));
        System.out.println(shop1.findByName("aksld"));
        System.out.println(shop1.findByName("ajsdkfjaksdAAAAAAAAAAAA"));
        sc.close();
    }
}
