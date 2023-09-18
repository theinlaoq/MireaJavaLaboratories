package ru.mirea.lab5.ex2;

import java.awt.*;
public class Square extends Shape {
    public Square(Color color, int positionX, int positionY) {
        super(color, positionX, positionY);
    }
    void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(positionX, positionY, 50, 50);
    }
}
