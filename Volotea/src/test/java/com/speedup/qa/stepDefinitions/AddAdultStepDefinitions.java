package com.speedup.qa.stepDefinitions;

import com.speedup.qa.tasks.AcceptCookies;
import com.speedup.qa.tasks.AddAdult;
import com.speedup.qa.tasks.OpenBrowser;
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

public class AddAdultStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");

    }
    @Given("^user add passenger$")
    public void user_add_passenger() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
        OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.acceptCookies());
    }

    @When("^user click on selector plus$")
    public void user_click_on_selector_plus() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddAdult.addAdult());
    }

    @Then("^he can see one more adult$")
    public void he_can_see_one_more_adult() {

    }


}
