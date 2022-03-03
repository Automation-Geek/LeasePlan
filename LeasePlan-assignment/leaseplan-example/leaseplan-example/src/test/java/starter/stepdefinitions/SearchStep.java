package starter.stepdefinitions;

import groovy.transform.Undefined;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.jruby.RubyProcess;
import org.jsoup.Connection;
import starter.apis.FruitClass;
import starter.apis.FruitResponse;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.contains;


/*
This class will be use to get the response and validate it
 */

public class SearchStep {

    Response resposeObject;

    @When("he calls endpoint (.*) and verify result$")
    public void heCallsEndpoint(String endPoint) throws Exception {
        System.out.println(endPoint);
        resposeObject= given().when().get(FruitClass.placeRequest(endPoint));
    }

    @Then("he sees the results displayed for (.*)$")
    public void heSeesTheResultsDisplayedForApple(String FruitName) throws Exception{
        FruitResponse.withContent(then().extract().asString()).shouldBeValid();
        FruitResponse.validateResponce(resposeObject,FruitName);
    }

    @Then("he sees the results displayed not for (.*)$")
    public void heSeesTheResultsDisplayedNotForApple(String FruitName) throws Exception{
        FruitResponse.withContent(then().extract().asString()).shouldBeValid();
        FruitResponse.validateNegativeResponse(resposeObject,FruitName);
    }

}
