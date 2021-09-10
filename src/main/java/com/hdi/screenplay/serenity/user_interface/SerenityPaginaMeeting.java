package com.hdi.screenplay.serenity.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityPaginaMeeting extends PageObject{

    public static final Target txtMeetingName = Target.the("Campo Meeting Name")
            .located(By.xpath("//input[@type='text'][contains(@id,'MeetingName')]"));

    public static final Target btnSave = Target.the("Botón Save")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'Save')]"));

}
