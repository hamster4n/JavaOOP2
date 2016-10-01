package lesson07;

/**
 * Created by Hamster4n.
 */
public class Main {
    public static void main(String[] args) {
        Action ac = new Action();
        SingleThread stOne = new SingleThread("Push", ac, true);
        SingleThread stTwo = new SingleThread("Pull", ac, true);

        Thread thOne = new Thread(stOne);
        Thread thTwo = new Thread(stTwo);

        thOne.start();
        thTwo.start();
    }
}
