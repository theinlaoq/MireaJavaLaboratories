package ru.mirea.lab9.ex1;
import java.util.Arrays;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}