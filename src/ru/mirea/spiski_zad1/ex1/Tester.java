package ru.mirea.spiski_zad1.ex1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardList cardList = new CardList();

        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить элемент в список");
            System.out.println("3. Удалить элемент из списка");
            System.out.println("4. Вывести элемент списка на экран");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить список на пустоту");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cardList.createEmptyList();
                    break;
                case 2:
                    CardNode newNode = new CardNode();
                    newNode.readAttributesFromConsole();
                    cardList.addNode(newNode);
                    break;
                case 3:
                    if (!cardList.isEmpty()) {
                        System.out.print("Введите индекс элемента для удаления: ");
                        int indexToRemove = scanner.nextInt();

                        if (indexToRemove >= 0 && indexToRemove < cardList.size()) {
                            cardList.removeNode(cardList.getNode(indexToRemove));
                            System.out.println("Элемент удален.");
                        } else {
                            System.out.println("Неверный индекс.");
                        }
                    } else {
                        System.out.println("Список пуст. Нечего удалять.");
                    }
                    break;
                case 4:
                    if (!cardList.isEmpty()) {
                        System.out.print("Введите индекс элемента для вывода: ");
                        int indexToDisplay = scanner.nextInt();

                        if (indexToDisplay >= 0 && indexToDisplay < cardList.size()) {
                            cardList.displayNode(cardList.getNode(indexToDisplay));
                        } else {
                            System.out.println("Неверный индекс.");
                        }
                    } else {
                        System.out.println("Список пуст. Нечего выводить.");
                    }
                    break;
                case 5:
                    cardList.clearList();
                    break;
                case 6:
                    System.out.println("Список " + (cardList.isEmpty() ? "пуст." : "не пуст."));
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        } while (choice != 0);

        scanner.close();
    }
}


