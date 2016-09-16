package lesson0102.Zoo;

/**
 * Created by Hamster4n.
 */
public class Animal {
    private int age;
    private double weigt;
    private boolean sex;
    private String ration;

    public Animal(int age, double weigt, boolean sex, String ration) {
        super();
        this.age = age;
        this.weigt = weigt;
        this.sex = sex;
        this.ration = ration;
    }
    public Animal() {}

    public void getVoice() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigt() {
        return weigt;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String toString() {
        return " age=" + age + ", weigt=" + weigt + ", sex=" + sex + ", ration=" +
                ration + "]";
    }
}