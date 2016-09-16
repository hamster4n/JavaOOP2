package home02;

/**
 * Created by Hamster4n.
 */
public class Circle extends Shape {
    private Point a;
    private double radius;

    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    public Circle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle" +
                "\n a=" + a +
                ",\n radius=" + radius;
    }
}
