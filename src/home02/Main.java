package home02;

/**
 * Created by Hamster4n.
 * 1. Создайте абстрактный класс Shape, в котором есть два абстрактных метода
 * double getPerimetr() и double getArea().
 * 2. Создайте класс Point в котором есть два свойства double X и double Y.
 * 3. Создайте классы, которые описывают как минимум три геометрические фигуры
 * (они должны быть подклассами Shape), при этом они в качестве свойств должны
 * содержать класс Point.
 * 4. Создайте класс доска. Доска поделена на 4 части. В каждую часть доски можно
 * положить одну из фигур. У доски должны быть методы которые помещают и
 * удаляют фигуру с доски. Также должен быть метод, который выводит информацию
 * о всех фигурах лежащих на доск и их суммарную площадь.
 * 5*. Нарисуйте UML диаграмму проекта
 */
public class Main {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(new Point(446.23, 73.14), new Point(518.48, 114.7), new Point(459.63, 140.45));
        Triangle tr2 = new Triangle(new Point(459.47, 205.71), new Point(541.89, 286.17), new Point(369.85, 390.83));
        Triangle tr3 = new Triangle(new Point(481.05, 491.56), new Point(458.81, 477.17), new Point(454.23, 498.76));
        Circle circ1 = new Circle(new Point(10.0, 10.0), 31.0);
        Circle circ2 = new Circle(new Point(0.0, 0.0), 24.5);
        Rectangle rect1 = new Rectangle(new Point(0.0, 0.0), new Point(0.0, 10.0), new Point(10.0, 10.0), new Point(10.0, 0.0));
        Rectangle rect2 = new Rectangle(new Point(10.0,10.0), new Point(10.0,39.72), new Point(18.82,39.72), new Point(18.82,10.0));

        Board board = new Board();
        board.putShape(tr1);
        board.putShape(tr2);
        board.putShape(tr3);
        board.putShape(circ1);
        board.removeShape(1);
        board.removeShape(2);
        board.removeShape(3);
        board.putShape(circ2);
        board.putShape(rect1);
        board.putShape(rect2);
        System.out.println();

        board.printBoard();
    }
}
