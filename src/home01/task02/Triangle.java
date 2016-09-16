package home01.task02;

/**
 * Created by Hamster4n.
 * Описать класс Triangle. В качестве свойств возьмите длины сторон треугольника.
 * Реализуйте метод, который будет возвращать площадь этого треугольника.
 * Создайте несколько экземпляров этого класса и протестируйте их.
 */
public class Triangle {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public Triangle() {
    }

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public static double getArea(Triangle triangle){
        double area = 0.0;
        double p = (triangle.getLength1() + triangle.getLength2() + triangle.getLength3()) / 2;
        area = Math.sqrt(p * (p - triangle.getLength1()) * (p - triangle.getLength2()) * (p - triangle.getLength3()));
        return area;
    }
}
