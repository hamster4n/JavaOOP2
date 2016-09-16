package home02;

/**
 * Created by Hamster4n.
 * 4. Создайте класс доска. Доска поделена на 4 части. В каждую часть доски можно
 * положить одну из фигур. У доски должны быть методы которые помещают и
 * удаляют фигуру с доски. Также должен быть метод, который выводит информацию
 * о всех фигурах лежащих на доске и их суммарную площадь.
 */
public class Board {
    private Shape[] shapes = new Shape[4];

    public Board(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Board() {
    }

    public void putShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null){
                shapes[i] = shape;
                System.out.println("Shape " + shape.getClass().getSimpleName() + " added to " + i + " cell of board.");
                return;
            }
        }
        System.out.println("There is no free cells on the board.");
    }

    public void removeShape(int number){
        if (number <= shapes.length){
            System.out.println("Shape " + shapes[number].getClass().getSimpleName() + " successfully deleted from " + number + " cell.");
            shapes[number] = null;
        } else System.out.println("Wrong number cell board!");
    }

    public void printBoard(){
        double area = 0;
        for (Shape element:shapes) {
            area += element.getArea();
            System.out.println(element);
        }
        System.out.println("Total area: " + area);
    }
}
