package com.hdi.screenplay.serenity.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityPaginaBusinessUnit extends PageObject {

    public static final Target txtName = Target.the("Campo Texto Name")
            .located(By.cssSelector("#StartSharp_Organization_BusinessUnitDialog7_Name"));

    public static final Target btnSave = Target.the("Botón Save")
            .located(By.xpath("//span[contains(.,'Save')]"));

}
