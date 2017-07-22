package com.home.cucumber.stepdef;

import com.home.cucumber.SpringIntegrationTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.home.cucumber.CucumberLiterals.APPLICATION_URL;

public class OtherDefsIntegrationTest extends SpringIntegrationTest {
    @When("^the client calls /sumit$")
    public void the_client_issues_POST_hello() throws Throwable {
        executePost(APPLICATION_URL + "/sumit");
    }

    @Given("^the client calls /hello$")
    public void the_client_issues_GET_hello() throws Throwable {
        executeGet(APPLICATION_URL + "/hello");
    }
}