package com.speedup.qa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.AddAdult.PASSANGER;
import static com.speedup.qa.userinterface.AddAdult.PLUS_ADULT;

public class AddAdult implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PASSANGER));
        actor.attemptsTo(Click.on(PLUS_ADULT));
    }
    public static AddAdult addAdult(){
        return Tasks.instrumented(AddAdult.class);
    }
}
