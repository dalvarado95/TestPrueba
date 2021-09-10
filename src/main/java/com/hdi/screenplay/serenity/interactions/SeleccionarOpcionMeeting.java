package com.hdi.screenplay.serenity.interactions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaMiCuenta;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class SeleccionarOpcionMeeting {
    public static Performable Meetings() {
        return Task.where("{0} ingresa a link\"Meetings\"",
                Click.on(SerenityPaginaMiCuenta.lnkMeeting),
                Click.on(SerenityPaginaMiCuenta.lnkMeetings)
        );
    }
}
