package com.hdi.screenplay.serenity.features.step_definitions;

import com.hdi.screenplay.serenity.interactions.*;
import com.hdi.screenplay.serenity.questions.VisualizaTexto;
import com.hdi.screenplay.serenity.tasks.NavegarA;
import com.hdi.screenplay.serenity.tasks.SeleccionarOpcion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class Stepdefinitions_Serenity {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Que Usuario entra en Serenity$")
    public void ingresa_a_serenity() {
        OnStage.theActorCalled("Usuario").wasAbleTo(NavegarA.paginaSerenity());
    }

    @Cuando("^Usuario ingresa a la funcionalidad Mi Cuenta con datos: (.*),(.*)$")
    public void ingresa_a_funcionalidad_mi_cuenta(String usuario, String password) {
        OnStage.theActorCalled("Usuario").wasAbleTo(IniciarSesion.IngresarSerenity(usuario,password));
    }

    @Y("^Usuario ingresa a business unit$")
    public void ingresa_a_business_unit() {
        OnStage.theActorCalled("Usuario").wasAbleTo(SeleccionarOpcionBusinessUnit.BusinessUnit());
    }

    @Y("^Usuario crea new business unit con datos: (.*)$")
    public void crea_new_business_unit(String name) {
        OnStage.theActorCalled("Usuario").wasAbleTo(SeleccionarOpcion.NewBusinessUnit());
        OnStage.theActorCalled("Usuario").wasAbleTo(CrearBusinessUnit.NewBusinessUnit(name));
    }

    @Y("^Usuario ingresa a meeting$")
    public void ingresa_a_meeting() {
        OnStage.theActorCalled("Usuario").wasAbleTo(SeleccionarOpcionMeeting.Meetings());
    }

    @Y("^Usuario crea new meeting con datos: (.*)$")
    public void crea_new_meeting(String meetingName) {
        OnStage.theActorCalled("Usuario").wasAbleTo(SeleccionarOpcion.NewMeeting());
        OnStage.theActorCalled("Usuario").wasAbleTo(CrearMeeting.NewMeeting(meetingName));
    }

    @Entonces("^Usuario visualiza texto: (.*)$")
    public void validar_texto_texto(String texto) {
        OnStage.theActorCalled("Usuario").should(
              seeThat("Texto", VisualizaTexto.CreadaReunion(),equalTo(texto))
      );
    }

}
