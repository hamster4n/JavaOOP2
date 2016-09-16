package home01.task01;

/**
 * Created by Hamster4n.
 * Описать класс "Cat" (в качестве образца можно взять домашнего питомца).
 * Наделить его свойствами и методами. Создать несколько экземпляров этого
 * класса. Использовать эти объекты.
 */
public class Cat {
    private String name; //кличка
    private String breed; //порода
    private String color;
    private double weight;
    private boolean sex;
    private int age;

    public Cat(String name, String breed, String color, double weight, boolean sex, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [" + "name= " + name + ", breed= " + breed + ", color= " + color +
                ", weight= " + weight + ", sex= " + sex + ", age= " + age + "]";
    }

    public void say(){
        System.out.println(name + " say mau");
    }

    public void drinkMilk(){
        System.out.println(name + " drink milk");
    }

    public void eatMeat(){
        System.out.println(name + " eat meat");
    }

    public boolean isOld(Cat anoserCat){
        if (this.age > anoserCat.age){
            return true;
        } else return false;
    }

}
