package com.hdi.screenplay.serenity.interactions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaMiCuenta;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcionBusinessUnit{

    public static Performable BusinessUnit() {
        return Task.where("{0} ingresa a link\"Business Units\"",
                Click.on(SerenityPaginaMiCuenta.lnkOrganization),
                Click.on(SerenityPaginaMiCuenta.lnkBusinessUnits)
        );
    }

}





