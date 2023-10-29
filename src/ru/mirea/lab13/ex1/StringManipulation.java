package ru.mirea.lab13.ex1;

public class StringManipulation {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли на '!!!': " + endsWithExclamation);

        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли с 'I like': " + startsWithILike);

        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли 'Java': " + containsJava);

        int indexOfJava = inputString.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + indexOfJava);

        String replacedString = inputString.replace('a', 'o');
        System.out.println("Замененная строка: " + replacedString);

        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        String substring = inputString.substring(7, 11);
        System.out.println("Вырезанная подстрока: " + substring);
    }
}
