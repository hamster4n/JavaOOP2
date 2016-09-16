package home01.task01;

/**
 * Created by Hamster4n.
 * Описать класс "Cat" (в качестве образца можно взять домашнего питомца).
 * Наделить его свойствами и методами. Создать несколько экземпляров этого
 * класса. Использовать эти объекты.
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = createCats();
        whoIsCooler(cats);
    }

    public static Cat[] createCats(){
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Murzik", "cheshirskiy", "black", 5, true, 10);
        cats[1] = new Cat("Matilda", "pers", "white", 3, false, 7);
        cats[2] = new Cat("Barsik", "fromStreet", "rufous", 7, true, 12);
        return cats;
    }

    public static void whoIsCooler(Cat[] cats){
       sortCat(cats);
        cats[0].eatMeat();
        cats[1].drinkMilk();
        cats[2].say();
    }

    public static Cat[] sortCat(Cat[] cats){
        Cat catForTime = new Cat();
        int catPosition = 0;

        for (int i = 0; i < cats.length; i++) {
            for (int j = i + 1; j < cats.length; j++) {
                if (cats[i].getAge() < cats[j].getAge()){
                    catPosition = j;
                }
            }
            if (i != catPosition){
                catForTime = cats[i];
                cats[i] = cats[catPosition];
                cats[catPosition] = catForTime;
            }
        }
        return cats;
    }
}
