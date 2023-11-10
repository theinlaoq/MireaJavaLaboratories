package ru.mirea.spiski_zad1.ex2;

import java.util.Scanner;

public class CircularTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularCardList circularCardList = new CircularCardList();

        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Создать пустой кольцевой список");
            System.out.println("2. Добавить элемент в кольцевой список");
            System.out.println("3. Удалить элемент из кольцевого списка");
            System.out.println("4. Вывести элемент кольцевого списка на экран");
            System.out.println("5. Очистить кольцевой список");
            System.out.println("6. Проверить кольцевой список на пустоту");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    circularCardList.createEmptyList();
                    break;
                case 2:
                    CircularCardNode newNode = new CircularCardNode();
                    newNode.readAttributesFromConsole();
                    circularCardList.addNode(newNode);
                    break;
                case 3:
                    if (!circularCardList.isEmpty()) {
                        System.out.print("Введите индекс элемента для удаления: ");
                        int indexToRemove = scanner.nextInt();

                        if (indexToRemove >= 0 && indexToRemove < circularCardList.size()) {
                            circularCardList.removeNode(circularCardList.getNode(indexToRemove));
                            System.out.println("Элемент удален.");
                        } else {
                            System.out.println("Неверный индекс.");
                        }
                    } else {
                        System.out.println("Список пуст. Нечего удалять.");
                    }
                    break;
                case 4:
                    if (!circularCardList.isEmpty()) {
                        System.out.print("Введите индекс элемента для вывода: ");
                        int indexToDisplay = scanner.nextInt();

                        if (indexToDisplay >= 0 && indexToDisplay < circularCardList.size()) {
                            circularCardList.displayNode(circularCardList.getNode(indexToDisplay));
                        } else {
                            System.out.println("Неверный индекс.");
                        }
                    } else {
                        System.out.println("Список пуст. Нечего выводить.");
                    }
                    break;
                case 5:
                    circularCardList.clearList();
                    break;
                case 6:
                    System.out.println("Кольцевой список " + (circularCardList.isEmpty() ? "пуст." : "не пуст."));
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
