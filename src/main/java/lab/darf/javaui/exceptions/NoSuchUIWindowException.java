package lab.darf.javaui.exceptions;

public class NoSuchUIWindowException extends Exception {
    public NoSuchUIWindowException(String message) {
        super("No such window with name: " + message);
    }
}
