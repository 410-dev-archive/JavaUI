package lab.darf.javaui.exceptions;

public class RepeatedUIWindowNameException extends Exception {
    public RepeatedUIWindowNameException(String message) {
        super("Repeated window name: " + message);
    }
}
