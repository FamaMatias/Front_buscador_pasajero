package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcceptCookies {
    public static final Target ACCEPT_COOKIES = Target
            .the("Acepta Cookies")
            .located(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
}
