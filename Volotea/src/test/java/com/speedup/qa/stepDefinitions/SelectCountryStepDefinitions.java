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

public class SelectCountryStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }
        @Given("^user want see country options$")
        public void user_want_see_country_options() {
            OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
            OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.acceptCookies());

        }

        @When("^user click on selector origin$")
        public void user_click_on_selector_origin () {
          //  OnStage.theActorInTheSpotlight().wasAbleTo(SelectDestination.selectDestination());
        }

        @When("^user click on selector country$")
        public void user_click_on_selector_country () {
          //  OnStage.theActorInTheSpotlight().wasAbleTo(SelectCountry.selectCountry());
        }

        @Then("^he can see boxes with all country inside$")
        public void he_can_see_boxes_with_all_country_inside () {
            OnStage.theActorInTheSpotlight().wasAbleTo(ValidateCountry.validateCountry());
        }
    }