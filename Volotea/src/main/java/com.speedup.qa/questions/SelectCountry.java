package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterface.ValidateCountry.VALIDATE_COUNTRY;


public class SelectCountry implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(VALIDATE_COUNTRY, WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_COUNTRY).viewedBy(actor).asString();
    }
    public static SelectCountry message(){
        return new SelectCountry();
    }
}
