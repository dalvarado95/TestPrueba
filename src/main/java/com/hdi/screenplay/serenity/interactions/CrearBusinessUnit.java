package com.hdi.screenplay.serenity.interactions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaBusinessUnit;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearBusinessUnit{

    public static Performable NewBusinessUnit(String name) {
        return Task.where("{0} diligencia la información solicitada\"New Business Unit\"",
                Enter.theValue(name).into(SerenityPaginaBusinessUnit.txtName),
                Click.on(SerenityPaginaBusinessUnit.btnSave)
        );
    }

}





