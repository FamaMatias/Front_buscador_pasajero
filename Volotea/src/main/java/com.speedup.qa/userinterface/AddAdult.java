package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddAdult {

    public static final Target PASSANGER = Target
            .the("Selecciona el label de pasajero")
            .located(By.xpath("//input[@id='input-text_sf-passenger']"));
    public static final Target PLUS_ADULT = Target
            .the("Aumenta Adultos")
            .located(By.xpath("//*[name()='use' and @*='#svg-plus']"));

}
