package lesson0102.Car;

import lesson0102.Car.Car;

/**
 * Created by Hamster4n.
 */
public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Green", 1992, 2000);
        Car carTwo = new Car();


        carTwo.setColor("Blue");
        carTwo.setYear(2000);
        carTwo.setWeight(1750);

        carOne.acceleration(20.0);

        System.out.println(carOne);
        System.out.println();
        System.out.println(carTwo);
    }
}
