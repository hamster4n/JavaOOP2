package lesson0102.Zoo;

/**
 * Created by Hamster4n.
 */
public class Zoo {
    private Animal[] animalArray = new Animal[10];
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public Zoo() {
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public void addAnimal(Animal animal) {
        if (animal.getClass() == Cat.class) {
            Cat cat = (Cat) animal;
            System.out.println("Pretty cat " + cat);
        }
        if (animal.getClass() == Dog.class) {
            Dog dog = (Dog) animal;
            System.out.println("Pretty dog " + dog);
        }

        for (int i = 0; i < animalArray.length; i++) {
            if (animalArray[i] == null) {
                animalArray[i] = animal;
                return;
            }
        }
    }

    public String toString() {
        String res = "";
        res += this.zooName + System.lineSeparator();
        for (Animal animal : animalArray) {
            if (animal != null) {
                res += animal + System.lineSeparator();
            }
        }
        return res;
    }
}
