package lesson0102.Car;


/**
 * Created by Hamster4n.
 */
public class Car {
    private String color;
    private double weight;
    private int year;
    private double velosity = 0;


    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public Car() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVelosity() {
        return velosity;
    }




    public void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    public void acceleration(double a) {
        velosity = velosity + a;
    }

    public void deceleration(double b) {
        if (velosity - b >= 0) velosity = velosity - b;
    }

    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velosity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }
}
