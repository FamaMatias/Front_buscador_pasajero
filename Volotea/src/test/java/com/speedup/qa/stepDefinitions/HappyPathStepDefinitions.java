package com.speedup.qa.stepDefinitions;

import com.speedup.qa.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class HappyPathStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }
    @Given("^user in the portal$")
    public void user_in_the_portal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
        OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.acceptCookies());
    }

    @When("^user select origin and destination$")
    public void user_select_origin_and_destination() {
        OnStage.theActorInTheSpotlight().wasAbleTo(HappyPath.happyPath());

    }

    @When("^select date to outbound and return$")
    public void select_date_to_outbound_and_return() {

    }

    @Then("^he can buy the fly$")
    public void he_can_buy_the_fly() {

    }

}
