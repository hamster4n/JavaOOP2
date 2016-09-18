package lesson06;

/**
 * Created by Hamster4n.
 */
public class SingleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
