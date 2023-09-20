package ru.mirea.lab2.ex6;


public class Circle{
    private double x;
    private double y;
    private double radius;
    private double area;
    private double length;
    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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
                "center= (x, y) " + x + ", "+ y +
                ", radius=" + radius +
                '}';
    }
}

class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle(2.2, 4.1, 5);
        System.out.println("area is: " + circle.getArea());
        System.out.println("length is: " + circle.getLength());
        System.out.println(circle);
    }
}