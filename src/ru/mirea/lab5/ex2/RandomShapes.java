package ru.mirea.lab5.ex2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class RandomShapes extends JPanel {
    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(500);
            int y = random.nextInt(500);

            if (random.nextBoolean()) {
                shapes[i] = new Circle(randomColor, x, y);
            } else {
                shapes[i] = new Square(randomColor, x, y);
            }
        }
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (Shape shape : shapes) {
            shape.draw(graphics);
        }
    }
}