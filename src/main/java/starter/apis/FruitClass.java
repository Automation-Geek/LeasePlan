package starter.apis;


import java.net.MalformedURLException;
import java.net.URL;
import static java.lang.String.format;


public class FruitClass {

    private static final String BASE_URL = "https://waarkoop-server.herokuapp.com/api/v1";
    private static final String FIND_PLACE_BY_PROXIMITY = BASE_URL + "/search/test/";


    public static String placeRequest (String endpoint) throws MalformedURLException {

        return (FIND_PLACE_BY_PROXIMITY+endpoint).trim();

    }

}
