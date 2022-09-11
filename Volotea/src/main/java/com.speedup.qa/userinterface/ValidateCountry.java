package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateCountry {
    public static final Target VALIDATE_COUNTRY = Target
            .the("Validar country")
            .located(By.xpath("(//div[@class='v7-card__box'])[1]"));
}
