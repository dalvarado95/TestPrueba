package com.hdi.screenplay.serenity.tasks;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaMiCuenta;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcion {

    public static Performable NewBusinessUnit() {
        return Task.where("{0} realiza clic sobre el botón \"New Business Unit\"",
                Click.on(SerenityPaginaMiCuenta.btnNewBusinessUnit)
        );
    }

    public static Performable NewMeeting() {
        return Task.where("{0} realiza clic sobre el botón \"New Meeting\"",
                Click.on(SerenityPaginaMiCuenta.btnNewMeeting)
        );
    }

}
