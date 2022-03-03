package starter.apis;


/*
This call can be use define the custom Exception in Response.
 */
public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String message) {
        super(message);
    }
}
