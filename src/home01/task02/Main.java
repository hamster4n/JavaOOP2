package home01.task02;

/**
 * Created by Hamster4n.
 * Описать класс Triangle. В качестве свойств возьмите длины сторон треугольника.
 * Реализуйте метод, который будет возвращать площадь этого треугольника.
 * Создайте несколько экземпляров этого класса и протестируйте их.
 */
public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(10.0, 10.0, 10.0);
        Triangle tr2 = new Triangle(20.0, 20.0, 10.0);
        Triangle tr3 = new Triangle(15.5, 20.3, 14.1);

        System.out.format("%.2f%n", Triangle.getArea(tr1));
        System.out.format("%.2f%n", Triangle.getArea(tr2));
        System.out.format("%.2f%n", Triangle.getArea(tr3));

    }
}
