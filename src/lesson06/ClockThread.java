package lesson06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hamster4n.
 */
public class ClockThread implements Runnable{

    private SimpleDateFormat sdf;

    public ClockThread(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public ClockThread() {
        this.sdf = new SimpleDateFormat("hh:mm:ss");
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (;!t.isInterrupted();){
            System.out.println(sdf.format(System.currentTimeMillis()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
