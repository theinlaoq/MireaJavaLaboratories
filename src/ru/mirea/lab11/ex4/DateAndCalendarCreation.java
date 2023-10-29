package ru.mirea.lab11.ex4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год (yyyy): ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (MM): ");
        int month = scanner.nextInt() - 1;
        System.out.println("Введите число (dd): ");
        int day = scanner.nextInt();
        System.out.println("Введите часы (HH): ");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты (mm): ");
        int minutes = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Объект Date: " + dateFormat.format(date));
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
