package co.com.pageTest.stepdefinitions;

import co.com.pageTest.tasks.open;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class testStepdefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^the user wants to find available flights$")
    public void theUserWantsToFindAvailableFlights() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("usuario").wasAbleTo(open.thePage());
    }


    @When("^change the language of the page and change the type of currency$")
    public void changeTheLanguageOfThePageAndChangeTheTypeOfCurrency() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^find flights with availability$")
    public void findFlightsWithAvailability() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }
}
