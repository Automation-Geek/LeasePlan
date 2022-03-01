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

public class SearchStep {

    @Steps
    public CarsAPISteps carsAPI;

    Response res;

    @When("he calls endpoint (.*) and verify result$")
    public void heCallsEndpoint(String arg0) throws Exception {
        System.out.println(arg0);
        res= given().when().get(FruitClass.placeRequest(arg0));
    }

    @Then("he sees the results displayed for (.*)$")
    public void heSeesTheResultsDisplayedForApple(String arg0) throws Exception{
        FruitResponse.withContent(then().extract().asString()).shouldBeValid();
        FruitResponse.validateResponce(res,arg0);
    }

    @Then("he sees the results displayed not for (.*)$")
    public void heSeesTheResultsDisplayedNotForApple(String arg0) throws Exception{
        FruitResponse.withContent(then().extract().asString()).shouldBeValid();
        FruitResponse.validateNegativeResponse(res,arg0);
    }

//    @Then("he sees the results displayed for mango")
//    public void heSeesTheResultsDisplayedForMango() {
//        restAssuredThat(response -> response.body("title", contains("mango")));
//    }
//
//    @Then("he does not see the results")
//    public void he_Doesn_Not_See_The_Results() {
//        restAssuredThat(response -> response.body("error", contains("True")));
//    }


}
