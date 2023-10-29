package ru.mirea.lab9.ex2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " - GPA: " + GPA;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));
        students.add(new Student("David", 3.8));

        Collections.sort(students, new SortingStudentsByGPA());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

