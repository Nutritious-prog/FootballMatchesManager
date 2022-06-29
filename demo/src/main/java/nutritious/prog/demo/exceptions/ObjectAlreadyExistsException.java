package nutritious.prog.demo.exceptions;

public class ObjectAlreadyExistsException extends Exception {
    public ObjectAlreadyExistsException(String errorMessage) {
        super(errorMessage);
    }
}
