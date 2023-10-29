package ru.mirea.lab11.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/MM/yyyy HH:mm:ss: ");
        String userDateStr = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date userDate = dateFormat.parse(userDateStr);
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка в формате даты. Используйте формат dd/MM/yyyy HH:mm:ss.");
        }
    }
}

