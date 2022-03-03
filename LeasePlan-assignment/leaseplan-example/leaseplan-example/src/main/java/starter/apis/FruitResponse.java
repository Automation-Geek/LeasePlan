package starter.apis;

import io.restassured.response.Response;
import jxl.common.Assert;
import org.jsoup.Connection;

import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.contains;


/*
This class is used for the get the respocne and validate the status code and values
 */
public class FruitResponse {

    private String content;

    public FruitResponse(String content) {
        this.content = content;
    }

    public static FruitResponse withContent(String content) {
        return new FruitResponse(content);
    }


    public static void validateResponce(Response res, String containsString){

        String placeData = res.then()
                .statusCode(200)
                .extract().asString();
        Assert.verify(placeData.contains(containsString));
    }

    public static void validateNegativeResponse(Response res, String containsString){
        final String errorString ="Not found";
        String errorData = res.then()
                .statusCode(404)
                .extract().asString();

        Assert.verify(errorData.contains(errorString));
    }

    public void shouldBeValid() throws Exception {
        if (content.contains("Your authentication credentials were missing or incorrect")) {
            throw new Exception();
        }
    }


}
