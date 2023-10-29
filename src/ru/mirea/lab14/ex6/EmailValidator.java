package ru.mirea.lab14.ex6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static void main(String[] args) {
        String inputEmail = "user@example.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputEmail);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Верно, email-адрес корректный.");
        } else {
            System.out.println("Неверно, email-адрес некорректный.");
        }
    }
}

