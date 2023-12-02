package ru.mirea.lab8;

public class PrintRange {
    public static void printRange(int A, int B) {
        if (A <= B) {
            System.out.print(A + " ");
            printRange(A + 1, B);
        } else {
            System.out.print(B + " ");
            printRange(A, B + 1);
        }
    }

    public static void main(String[] args) {
        int A = 3;
        int B = 8;
        printRange(A, B);
    }
}

