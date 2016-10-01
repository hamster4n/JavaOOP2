package lesson07;

/**
 * Created by Hamster4n
 * класс посредник
 */
public class Action {
    private boolean turn = true;

    public Action() {
    }

    public synchronized void printText(String text, boolean turnFromThread){
        for (;this.turn != turnFromThread;){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.print(text + "  ");
        this.turn = !this.turn;
        notify();
    }
}
