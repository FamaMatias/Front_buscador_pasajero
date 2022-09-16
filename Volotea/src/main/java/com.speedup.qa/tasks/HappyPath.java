package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.HappyPath.*;

public class HappyPath implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DEPARTURE));
        actor.attemptsTo(Click.on(BARCELONA));
       // actor.attemptsTo(Click.on(DESTINATION));
        actor.attemptsTo(Click.on(LILLE));
       // actor.attemptsTo(Click.on(OUTBOUND));
        actor.attemptsTo(Click.on(DATE_OUTBOUND));
       // actor.attemptsTo(Click.on(RETURN));
        actor.attemptsTo(Click.on(DATE_RETURN));
    }
    public static HappyPath happyPath(){
        return Tasks.instrumented(HappyPath.class);
    }
}
