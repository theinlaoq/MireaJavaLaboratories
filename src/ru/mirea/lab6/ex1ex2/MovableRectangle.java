package ru.mirea.lab6.ex1ex2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    //    в задании написано
    //    Убедитесь, что две точки имеет
    //    одну и ту же скорость (вам понадобится метод проверяющий это условие).
    //    но по диаграмме прямоугольник нельзя создать из двух точек
    //    и им нельзя задать разную скорость я хз че тут делать
    //    создается по диаграмме а там такого нету

    //    tldr: задание увы
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
