package home02;

/**
 * Created by Hamster4n.
 * 3. Создайте классы, которые описывают как минимум три геометрические фигуры
 * (они должны быть подклассами Shape), при этом они в качестве свойств должны
 * содержать класс Point.
 */
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }


    @Override
    public double getPerimetr() {
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        return ab + bc + ca;
    }

    @Override
    public double getArea() {
        double area = (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2;
        return Math.abs(area);
    }

    @Override
    public String toString() {
        return "Triangle" +
                "\n a=" + a +
                ",\n b=" + b +
                ",\n c=" + c;
    }
}
