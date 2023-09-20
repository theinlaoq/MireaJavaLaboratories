package ru.mirea.lab2.ex2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
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

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.1, 2.2);
        System.out.println(b1);
        Ball b2 = new Ball();
        b2.setX(4.3);
        b2.setY(6.1);
        System.out.println(b2);
        b1.setXY(4.3, 8.9);
        System.out.println(b1);
        System.out.println("X pos: " + b2.getX() + ", Y pos: " + b2.getY());

        b2.move(10.10, 20.20);
        System.out.println(b2);
    }
}


