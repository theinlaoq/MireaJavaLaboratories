package ru.mirea.lab2.shop;

public interface ShopHelper {
    void add(Computer computer);
    void delete(Computer computer);
    Computer findByName(String name) throws Exception;
    Computer findByCost(int cost) throws Exception;
}
