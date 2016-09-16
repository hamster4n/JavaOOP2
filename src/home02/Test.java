package home02;

/**
 * Created by Hamster4n.
 */
public class Test {
    public static void main(String[] args) {
        //test triangle
        Triangle tr1 = new Triangle(new Point(446.23, 73.14), new Point(518.48, 114.7), new Point(459.63, 140.45));
        Triangle tr2 = new Triangle(new Point(459.47, 205.71), new Point(541.89, 286.17), new Point(369.85, 390.83));
        Triangle tr3 = new Triangle(new Point(481.05, 491.56), new Point(458.81, 477.17), new Point(454.23, 498.76));
        System.out.println("tr1: my perimetr " + tr1.getPerimetr() + ", true perimetr: 216.22");
        System.out.println("tr1: my area " + tr1.getArea() + ", true area: 2153");
        System.out.println("tr2: my perimetr " + tr2.getPerimetr() + ", true perimetr: 522.22");
        System.out.println("tr2: my area " + tr2.getArea() + ", true area: 11234");
        System.out.println("tr3: my perimetr " + tr3.getPerimetr() + ", true perimetr: 76.33");
        System.out.println("tr3: my area " + tr3.getArea() + ", true area: 273");
        System.out.println();


        //test circle
        Circle circ1 = new Circle(new Point(10.0, 10.0), 31.0);
        Circle circ2 = new Circle(new Point(0.0, 0.0), 24.5);

        System.out.println("circ1: my perimetr " + circ1.getPerimetr() + ", true perimetr 194.78");
        System.out.println("circ1: my area " + circ1.getArea() + ", true area 3019.07");
        System.out.println("circ2: my perimetr " + circ2.getPerimetr() + ", true perimetr 153.94");
        System.out.println("circ2: my area " + circ2.getArea() + ", true area 1885.74");
        System.out.println();

        //test rectangle
        Rectangle rect1 = new Rectangle(new Point(0.0, 0.0), new Point(0.0, 10.0), new Point(10.0, 10.0), new Point(10.0, 0.0));
        Rectangle rect2 = new Rectangle(new Point(10.0,10.0), new Point(10.0,39.72), new Point(18.82,39.72), new Point(18.82,10.0));

        System.out.println("rect1: my perimetr " + rect1.getPerimetr() + ", true perimetr 40.0");
        System.out.println("rect1: my area " + rect1.getArea() + ", true area 100.0");
        System.out.println("rect2: my perimetr " + rect2.getPerimetr() + ", true perimetr 77.07");
        System.out.println("rect2: my area " + rect2.getArea() + ", true area 262.01");
        System.out.println();
    }
}
