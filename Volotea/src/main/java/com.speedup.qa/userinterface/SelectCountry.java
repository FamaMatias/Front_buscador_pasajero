package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectCountry {
    public static final Target COUNTRY = Target
            .the("Selecciona boton del pais")
            .located(By.xpath("//button[@class='v7-selector__link || v7-js-route-selector capitalize']"));

    public static final Target VALIDATE_COUNTRY = Target
            .the("Validar country")
            .located(By.xpath("(//div[@class='v7-card__box'])[1]"));

}
