package com.speedup.qa.tasks;

import com.speedup.qa.models.AdultReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.AddAdult.PLUS_ADULT;

public class AdultsReservation implements Task {

    private AdultReservation adultReservation;

    public AdultsReservation (AdultReservation adultReservation) {this.adultReservation = adultReservation;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 1; i <this.adultReservation.getAdults() ; i++) {
            actor.attemptsTo(Click.on(PLUS_ADULT));
        }
    }
    public static AdultsReservation adultsReservation(){
        return Tasks.instrumented(AdultsReservation.class);
    }
}
