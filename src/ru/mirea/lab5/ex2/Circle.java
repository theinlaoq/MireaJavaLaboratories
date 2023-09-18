package ru.mirea.lab5.ex2;

import java.awt.*;
public class Circle extends Shape {
    public Circle(Color color, int positionX, int positionY) {
        super(color, positionX, positionY);
    }

    void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(positionX, positionY, 50, 50);
    }
}