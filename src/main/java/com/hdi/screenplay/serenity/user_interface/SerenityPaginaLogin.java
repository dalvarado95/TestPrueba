package com.hdi.screenplay.serenity.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityPaginaLogin extends PageObject{

    public static final Target txtUserName = Target.the("Campo Texto Usuario")
            .located(By.cssSelector("#StartSharp_Membership_LoginPanel0_Username"));

    public static final Target txtPassword = Target.the("Campo Texto Password")
            .located(By.cssSelector("#StartSharp_Membership_LoginPanel0_Password"));

    public static final Target btnSignIn = Target.the("Boton Iniciar Sesion")
            .located(By.cssSelector("#StartSharp_Membership_LoginPanel0_LoginButton"));

}
