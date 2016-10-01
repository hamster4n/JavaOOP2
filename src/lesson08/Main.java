package lesson08;

import java.lang.reflect.Field;

/**
 * Created by Hamster4n.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 3, "Black");

        Class classCat = cat.getClass();
        try {
            Field filelsName = classCat.getDeclaredField("name");
            filelsName.setAccessible(true);
            filelsName.set(cat, "Kuzia");
        } catch (NoSuchFieldException  | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(cat);
    }
}
