package com.hdi.screenplay.serenity.interactions;

import com.hdi.screenplay.serenity.user_interface.SerenityPaginaMeeting;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearMeeting {

    public static Performable NewMeeting(String meetingName) {
        return Task.where("{0} diligencia la información solicitada\"New Meeting\"",
                Enter.theValue(meetingName).into(SerenityPaginaMeeting.txtMeetingName),
                Click.on(SerenityPaginaMeeting.btnSave)
        );
    }

}





