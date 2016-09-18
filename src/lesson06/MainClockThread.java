package lesson06;

import java.util.Random;

/**
 * Created by Hamster4n.
 */
public class MainClockThread {
    public static void main(String[] args) {
        Thread thr = new Thread(new ClockThread());
        thr.start();

        int number = 0;

        Random rn = new Random();
        for (;number != 5; number = rn.nextInt(10)){
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thr.interrupt();

        System.out.println("main - stop");
//        try {
//            Thread.currentThread().sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thr.interrupt();
    }
}
