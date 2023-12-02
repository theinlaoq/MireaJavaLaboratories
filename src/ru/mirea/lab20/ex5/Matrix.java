package ru.mirea.lab20.ex5;

public class Matrix<T> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public void print() {
        for (T[] row : data) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

