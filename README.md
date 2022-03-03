# Getting started with Serenity and Cucumber

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

The latest version of Serenity supports Cucumber 5.5.

## The starter project


### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             post_product.feature
```

Serenity 2.2.13 introduced integration with WebdriverManager to download webdriver binaries.

## The sample scenario and runner
We have covered both positive and negative scenario in the system. WE have all scenario inside in the- Post_Product.feature file.

We can run the test using TestRunner files where we have defined the tag "@searchProduct". It can run it by doing right click on this. 
Also, we can run the test using "mvn clean verify" command. it will the TestRunner file and run the test case which is defined inside it. 



## In order to run the serenity report file 

Need to write the command "mvn clean verify" and result will display undre the folder location: 

--- Target 
  --Serenity
    -BDD
     -Site
      -index.html

**NOTE: We have covered both positvie and negative scenarios.**

