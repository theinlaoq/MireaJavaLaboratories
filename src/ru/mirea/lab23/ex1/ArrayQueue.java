package ru.mirea.lab23.ex1;

public class ArrayQueue<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        elements = new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == elements.length) {
            resize();
        }

        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T removedItem = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;

        return removedItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return (T) elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }

        elements = newElements;
        front = 0;
        rear = size - 1;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
    }
}

