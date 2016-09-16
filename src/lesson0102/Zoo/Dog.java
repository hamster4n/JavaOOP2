package lesson0102.Zoo;

/**
 * Created by Hamster4n.
 */
public class Dog extends Animal {
    private String type;

    public Dog(int age, double weigt, boolean sex, String ration, String type) {
        super(age, weigt, sex, ration);
        this.type = type;
    }

    public Dog() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" + "type='" + type + '\'' + super.toString() + '}';
    }

    @Override
    public void getVoice() {
        System.out.println("Gav - Gav");
    }
}
