package ru.mirea.lab11.ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private double GPA;
    private Date dateOfBirth;

    public Student(String name, double GPA, Date dateOfBirth) {
        this.name = name;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
    }

    public double getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String formatDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "GPA: " + GPA + "\n" +
                "Date of Birth (Short Format): " + formatDateOfBirth("dd/MM/yyyy") + "\n" +
                "Date of Birth (Medium Format): " + formatDateOfBirth("dd MMM yyyy") + "\n" +
                "Date of Birth (Full Format): " + formatDateOfBirth("dd MMMM yyyy");
    }

    public static void main(String[] args) {
        Date dob = new Date(); // Замените эту дату на дату рождения студента

        Student student = new Student("Alice", 3.9, dob);

        System.out.println(student);
    }
}
