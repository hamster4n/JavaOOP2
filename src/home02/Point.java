package home02;

/**
 * Created by Hamster4n.
 * 2. Создайте класс Point в котором есть два свойства double X и double Y.

 */
public class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public Point() {
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "X = " + X + ", Y = " + Y + "}";
    }
}
