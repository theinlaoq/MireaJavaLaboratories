package ru.mirea.lab14.ex2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringMatcher {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Верно, строка соответствует паттерну.");
        } else {
            System.out.println("Неверно, строка не соответствует паттерну.");
        }
    }
}

