package com.reto.tasks;

import com.reto.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static com.reto.userinterfaces.ChoosePlanPage.BOTON_SELECT_PERIOD;
import static com.reto.userinterfaces.LoginPage.*;

public class SelectPeriod implements Task {
    private String period;

    public SelectPeriod(String period) {this.period = period;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(period.equals("Monthly")){
            actor.attemptsTo(Click.on(BOTON_SELECT_PERIOD));
        } else if (period.equals("Annually")) {
            actor.attemptsTo(Click.on(BOTON_SELECT_PERIOD));
            actor.attemptsTo(Click.on(BOTON_SELECT_PERIOD));
        }
    }

    public static Performable inApp(String period){
        return Tasks.instrumented(SelectPeriod.class, period);
    }
}
