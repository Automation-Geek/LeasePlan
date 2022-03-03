package starter.apis;


/*
This call can be use to define the custom Exception in Responce.
 */
public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String message) {
        super(message);
    }
}
