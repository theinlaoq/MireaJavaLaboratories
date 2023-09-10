package ru.mirea.lab2;

import java.util.Arrays;

public class StringSwapper {
    public static void main(String[] args) {
        String[] a = {"1", "2", "3", "4", "5", "6"};
        System.out.println("До смены: ");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;
        }
        System.out.println("после смены: ");
        System.out.println(Arrays.toString(a));
    }
}
