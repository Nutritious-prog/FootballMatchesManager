package nutritious.prog.demo.exceptions;

public class ObjectNotDeletedException extends Exception {
    public ObjectNotDeletedException(String errorMessage) {
        super(errorMessage);
    }
}