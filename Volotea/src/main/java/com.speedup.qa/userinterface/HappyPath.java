package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HappyPath {

    public static final Target DEPARTURE = Target
            .the("Selecciona el label partida")
            .located(By.xpath("(//div[@class='v7-sf__group-item v7-sf__group-item--origin v7-is-filled'])[1]"));
    public static final Target BARCELONA = Target
            .the("Selecciona Barcelona")
            .located(By.xpath("(//div[@class='v7-card__box'])[4]"));

    public static final Target DESTINATION = Target
            .the("Seleccionar label destino")
            .located(By.xpath("//div[@class='v7-sf__group-item v7-sf__group-item--destination v7-is-focused']"));

    public static final Target LILLE = Target
            .the("Seleccion lille")
            .located(By.xpath("(//div[@class='v7-card__box'])[2]"));

    public static final Target OUTBOUND = Target
            .the("Seleccionar fecha de partida")
            .located(By.xpath("(//div[@class='v7-sf__fieldset'])[4]"));

    public static final Target DATE_OUTBOUND = Target
            .the("Viernes 29/8")
            .located(By.xpath("(//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted'])[1]"));

    public static final Target RETURN = Target
            .the("Seleccionar fecha de regreso")
            .located(By.xpath("(//div[@class='v7-sf__fieldset'])[4]"));

    public static final Target DATE_RETURN = Target
            .the("Viernes 15/9")
            .located(By.xpath("(//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted'])[1]"));


}
