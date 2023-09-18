package ru.mirea.lab5.ex2;

import java.awt.*;

public abstract class Shape {
    Color color;
    int positionX;
    int positionY;

    public Shape(Color color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    abstract void draw(Graphics graphics);
}
