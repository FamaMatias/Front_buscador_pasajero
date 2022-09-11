package com.speedup.qa.stepDefinitions;

import com.speedup.qa.tasks.AdultsReservation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SignStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");

    }
    @When("^user click on selector plus in (.*)$")
    public void user_click_on_selector_plus_in(int Adults) {
        OnStage.theActorInTheSpotlight().attemptsTo(AdultsReservation.adultsReservation());
    }

    @Then("^below the Adults selector he can see an alert whit a link (.*)$")
    public void below_the_Adults_selector_he_can_see_an_alert_whit_a_link() {
    }
}
