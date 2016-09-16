package lesson0102.Zoo;

/**
 * Created by Hamster4n.
 */
public class Main {

    public static void main(String[] args) {


        Zoo zoo = new Zoo("Home Zoo");

        zoo.addAnimal(new Cat(3, 5.0, true, "milk", "Murzik", "cheshirskiy"));
        zoo.addAnimal(new Dog(5, 8.5, false, "meat", "vodolaz"));

        System.out.println(zoo);



    }
}
