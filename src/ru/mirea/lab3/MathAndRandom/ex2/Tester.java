package ru.mirea.lab3.MathAndRandom.ex2;

import java.util.Arrays;
import java.util.Objects;

public class Tester {
    private Circle[] circles;
    private int countCircles;

    public Tester(Circle[] circles) {
        this.circles = circles;
        this.countCircles = circles.length;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public int getCountCircles() {
        return countCircles;
    }

    public Circle getTheSmallest(){
        int index = 0;
        double bigRad = 0;
        for(int i = 0; i < countCircles; i++){
            if(bigRad < circles[i].getRadius()){
                bigRad = circles[i].getRadius();
                index = i;
            }
        }
        return circles[index];
    }

    public Circle getTheBiggest(){
        int index = 0;
        double smallRad = 0;
        for(int i = 0; i < countCircles; i++){
            if(smallRad > circles[i].getRadius()){
                smallRad = circles[i].getRadius();
                index = i;
            }
        }
        return circles[index];
    }

    public void sortCirclesByRadius(){
        Arrays.sort(circles, (c1, c2) -> (int) (c1.getRadius() - c2.getRadius()));
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", countCircles=" + countCircles +
                '}';
    }

    public static void main(String[] args) {
        Circle[] circles1 = new Circle[6];
        circles1[0] = new Circle(new Point(1.1, 5.5));
        circles1[1] = new Circle(new Point(5.6, 7.8));
        circles1[2] = new Circle(new Point(12.1,1.5));
        circles1[3] = new Circle(new Point(3.6, 3.8));
        circles1[4] = new Circle(new Point(6.2, 5.6));
        circles1[5] = new Circle(new Point(4.8, 8.8));
        Tester tester = new Tester(circles1);
        System.out.println(tester);
        System.out.println(tester.getTheBiggest());
        System.out.println(tester.getTheSmallest());
        tester.sortCirclesByRadius();
        System.out.println(tester);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tester tester)) return false;
        return getCountCircles() == tester.getCountCircles() && Arrays.equals(getCircles(), tester.getCircles());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCountCircles());
        result = 31 * result + Arrays.hashCode(getCircles());
        return result;
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

    public Circle(Point center) {
        this.center = center;
        this.radius = Math.random() * 10;
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
                ", radius=" + radius + '}';
    }
}