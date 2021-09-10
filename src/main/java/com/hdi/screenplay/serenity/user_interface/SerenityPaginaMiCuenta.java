package com.hdi.screenplay.serenity.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityPaginaMiCuenta extends PageObject{

    public static final Target lnkOrganization = Target.the("Link Organization")
            .located(By.xpath("//span[contains(.,'Organization')]"));

    public static final Target lnkBusinessUnits = Target.the("Link Business Units")
            .located(By.xpath("//span[contains(.,'Business Units')]"));

    public static final Target btnNewBusinessUnit = Target.the("Botón New Business Unit")
            .located(By.xpath("//span[contains(.,'New Business Unit')]"));

    public static final Target lnkMeeting = Target.the("Link Meeting")
            .located(By.xpath("//a[@href='javascript:;'][contains(.,'Meeting')]"));

    public static final Target lnkMeetings = Target.the("Link Meetings")
            .located(By.xpath("//a[contains(.,'Meetings')]"));

    public static final Target btnNewMeeting = Target.the("Botón New Meeting")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button'][contains(.,'New Meeting')]"));

    public static final Target lblPruebaCompleta = Target.the("Label Prueba")
            .located(By.xpath("//a[contains(.,'Prueba Completa')]"));

}
