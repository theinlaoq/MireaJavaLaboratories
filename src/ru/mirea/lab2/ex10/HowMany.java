package ru.mirea.lab2.ex10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        Scanner sc = new Scanner(line);
        int count = 0;
        while(sc.hasNext()){
            String c = sc.next();
            System.out.println(c);
            count++;
        }

        System.out.println("Вы ввели: " + count + " слов");
    }
}
