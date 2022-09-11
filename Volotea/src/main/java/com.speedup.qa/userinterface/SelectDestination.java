package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectDestination {

    public static final Target DESTINATION = Target
            .the("Selecciona el label de destino")
            .located(By.id("input-text_sf-origin"));
}
