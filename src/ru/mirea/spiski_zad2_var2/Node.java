package ru.mirea.spiski_zad2_var2;

public class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head, tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Метод для добавления элемента в конец списка
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Метод для удаления элемента с минимальным значением и вставки его в начало списка
    public void sortList() {
        if (head == null || head.next == null) {
            // Список пуст или содержит только один элемент, нечего сортировать
            return;
        }

        Node minNode = head;
        Node current = head.next;

        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }

        if (minNode != head) {
            // Удаляем элемент с минимальным значением из текущей позиции
            minNode.prev.next = minNode.next;
            if (minNode.next != null) {
                minNode.next.prev = minNode.prev;
            }

            // Вставляем элемент в начало списка
            minNode.next = head;
            minNode.prev = null;
            head.prev = minNode;
            head = minNode;
        }
    }

    // Метод для вывода списка на экран
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToEnd(3);
        list.addToEnd(1);
        list.addToEnd(4);
        list.addToEnd(2);

        System.out.println("Исходный список:");
        list.display();

        list.sortList();

        System.out.println("Отсортированный список:");
        list.display();
    }
}

