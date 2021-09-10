package com.hdi.screenplay.serenity.tasks;

import com.hdi.screenplay.serenity.utilities.Constantes;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {

    public static Performable paginaSerenity() {

        return Task.where("{0} navega a la página de Serenity",
                Open.url(Constantes.paginaSignIn)
        );
    }

}
