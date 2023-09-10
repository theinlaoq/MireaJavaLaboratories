package ru.mirea.lab2.Poker;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кол-во игроков: ");
        int n = sc.nextInt();
        int cardForPlayer = 5;
        String[] lear = {"Пик", "Бубен", "Черв", "Треф"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"};

        int countCards = lear.length * rank.length;
        if(cardForPlayer * n > countCards){
            System.out.println("Слишком много игроков");
        }

        String[] deck = new String[countCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < lear.length; j++) {
                deck[lear.length*i + j] = rank[i] + " " + lear[j];
            }
        }

        for (int i = 0; i < countCards; i++) {
            int r = i + (int) (Math.random() * (countCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < n * cardForPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardForPlayer == cardForPlayer - 1)
                System.out.println();
        }

        sc.close();
    }
}
