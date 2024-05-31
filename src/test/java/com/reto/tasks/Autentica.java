package com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static com.reto.userinterfaces.LoginPage.*;

public class Autentica implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Type.theValue("standard_user").into(INPUT_USER),
                Type.theValue("secret_sauce").into(INPUT_CLAVE),
                Click.on(BOTON_LOGIN)
        );
    }

    public static Performable enSaucedemo(){
        return Tasks.instrumented(Autentica.class);
    }
}
