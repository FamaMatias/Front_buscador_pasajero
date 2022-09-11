package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.SelectDestination.DESTINATION;

public class SelectDestination implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(DESTINATION));
    }
    public static SelectDestination selectDestination(){
        return Tasks.instrumented(SelectDestination.class);
    }
}
