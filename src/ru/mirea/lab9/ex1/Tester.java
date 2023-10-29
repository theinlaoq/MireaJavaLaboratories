package ru.mirea.lab9.ex1;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Alice"),
                new Student(101, "Bob"),
                new Student(105, "Charlie"),
                new Student(102, "David"),
                new Student(104, "Eve")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable current = arr[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
