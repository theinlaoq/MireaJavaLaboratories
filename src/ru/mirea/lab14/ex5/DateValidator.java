package ru.mirea.lab14.ex5;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DateValidator {
    public static void main(String[] args) {
        String inputDate = "29/02/2000";
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputDate);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Верно, дата соответствует формату.");
        } else {
            System.out.println("Неверно, дата не соответствует формату.");
        }
    }
}
