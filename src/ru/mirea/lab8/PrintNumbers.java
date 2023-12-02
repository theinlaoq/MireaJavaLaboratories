package ru.mirea.lab8;

public class PrintNumbers {
    public static void printNumbers(int n) {
        if (n >= 1) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5; // Замените на ваше значение
        printNumbers(n);
    }
}

