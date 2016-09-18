package lesson06;

/**
 * Created by Hamster4n.
 */
public class Main {
    public static void main(String[] args) {
        Thread thOne = new Thread(new SingleThread());
        Thread thTwo = new Thread(new SingleThread());
        Thread thThree = new Thread(new SingleThread());

        System.out.println(thOne.getState());

        thOne.setDaemon(true);
        thTwo.setDaemon(true);
        thThree.setDaemon(true);

        thOne.start();
        thTwo.start();
        thThree.start();


        System.out.println(Thread.currentThread().getName() + " ->  stop");
    }
}
