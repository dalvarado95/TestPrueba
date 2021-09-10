package com.hdi.screenplay.serenity.interactions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaLogin;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class IniciarSesion {
    public static Performable IngresarSerenity(String usuario, String password) {
        return Task.where("{0} diligencia la información solicitada\"Iniciar Sesión\"",
                Enter.theValue(usuario).into(SerenityPaginaLogin.txtUserName),
                Enter.theValue(password).into(SerenityPaginaLogin.txtPassword),
                Click.on(SerenityPaginaLogin.btnSignIn)
        );
    }
}
