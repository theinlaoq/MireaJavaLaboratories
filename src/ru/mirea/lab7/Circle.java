public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String s=String.format("%17s%5.3f","круг с радиусом ",radius,"\n");
        return s;
    }
}
