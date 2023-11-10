package ru.mirea.spiski_zad1.ex2;

public class CircularCardList {
    private CircularCardNode head;

    public CircularCardList() {
        this.head = null;
    }

    public void createEmptyList() {
        this.head = null;
    }

    public void addNode(CircularCardNode newNode) {
        if (this.head == null) {
            this.head = newNode;
            newNode.setNext(newNode);
        } else {
            CircularCardNode temp = this.head;
            while (temp.getNext() != this.head) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(this.head);
        }
    }

    public void removeNode(CircularCardNode nodeToRemove) {
        if (this.head == null) {
            System.out.println("Список пуст. Нечего удалять.");
            return;
        }

        if (this.head == nodeToRemove) {
            if (this.head.getNext() == this.head) {
                this.head = null;
            } else {
                CircularCardNode temp = this.head;
                while (temp.getNext() != this.head) {
                    temp = temp.getNext();
                }
                temp.setNext(this.head.getNext());
                this.head = this.head.getNext();
            }
        } else {
            CircularCardNode temp = this.head;
            while (temp.getNext() != this.head && temp.getNext() != nodeToRemove) {
                temp = temp.getNext();
            }
            if (temp.getNext() == this.head) {
                System.out.println("Элемент не найден.");
            } else {
                temp.setNext(nodeToRemove.getNext());
            }
        }
    }

    public void displayNode(CircularCardNode node) {
        node.displayAttributes();
    }

    public void clearList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public CircularCardNode getNode(int index) {
        if (this.head == null || index < 0) {
            return null;
        }

        CircularCardNode current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
            if (current == this.head) {
                return null;
            }
        }
        return current;
    }

    public int size() {
        if (this.head == null) {
            return 0;
        }

        int count = 1;
        CircularCardNode temp = this.head;
        while (temp.getNext() != this.head) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
}
