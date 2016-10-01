package lesson07;

/**
 * Created by Hamster4n.
 */
public class SingleThread implements Runnable{
    private String text;
    private Action ac;
    private boolean turn;

    public SingleThread(String text, Action ac, boolean turn) {
        this.text = text;
        this.ac = ac;
        this.turn = turn;
    }

    public SingleThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ac.printText(text, turn);
        }
    }
}
