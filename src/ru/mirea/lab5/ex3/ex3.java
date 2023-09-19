package ru.mirea.lab5.ex3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ex3 extends JFrame {
    private Image image;

    public ex3(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        setSize(image.getWidth(null), image.getHeight(null));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics graphics) {
        graphics.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            new ex3(args[0]);
        } else {
            System.out.println("Please provide an image path as a command line argument.");
        }
    }
}