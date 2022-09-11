package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.ValidateCountry.VALIDATE_COUNTRY;


public class ValidateCountry implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VALIDATE_COUNTRY));
    }
    public static ValidateCountry validateCountry(){
        return Tasks.instrumented(ValidateCountry.class);
    }

    
}
