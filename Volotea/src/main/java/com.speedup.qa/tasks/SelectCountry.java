package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.SelectCountry.COUNTRY;


public class SelectCountry implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COUNTRY));
    }
    public static SelectCountry selectCountry(){
        return Tasks.instrumented(SelectCountry.class);
    }
}
