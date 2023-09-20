package ru.mirea.lab2.ex3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int countCircles;

    public Tester(Circle[] circles) {
        this.circles = circles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public int getCountCircles() {
        if(circles == null){
            return 0;
        }else{
            return circles.length;
        }
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", countCircles=" + countCircles +
                '}';
    }

    public static void main(String[] args) {
        Circle[] circles1 = new Circle[2];
        circles1[0] = new Circle(new Point(1.1, 5.5), 5);
        circles1[1] = new Circle(new Point(5.6, 7.8), 10);
        Tester tester = new Tester(circles1);
        System.out.println(tester);
    }
}


class Point{
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle{
    private Point center;
    private double radius;
    private double area;
    private double length;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", area=" + area +
                ", length=" + length +
                '}';
    }
}