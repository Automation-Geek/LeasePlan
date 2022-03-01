@searchProduct
Feature: Search for the product with positive and Negative Scenario

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/test/{product} for getting the products.
### Available products: "apple", "mango", "tofu", "water"
### Prepare Positive and negative scenarios

  Scenario Outline: Positive Scenario
    When he calls endpoint <fruit> and verify result
    Then he sees the results displayed for <fruit>
    Examples:
    |fruit|
    |apple|
    |mango|


  Scenario Outline: Negative Scenario
    When he calls endpoint <fruit> and verify result
    Then he sees the results displayed not for <fruit>
    Examples:
      |fruit|
      |apples|
      |Mongore|
      |Wrong Value|

