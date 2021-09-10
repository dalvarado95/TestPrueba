package com.hdi.screenplay.serenity.questions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaMiCuenta;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VisualizaTexto {
    public static Question<String> CreadaReunion(){
        return actor -> Text.of(SerenityPaginaMiCuenta.lblPruebaCompleta)
                .viewedBy(actor).asString();
    }

}
