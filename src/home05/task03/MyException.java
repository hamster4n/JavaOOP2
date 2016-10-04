package home05.task03;

/**
 * Created by Hamster4n.
 */
public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "In this group already has 10 students.";
    }
}
