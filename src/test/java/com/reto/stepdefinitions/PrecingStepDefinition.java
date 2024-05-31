package com.reto.stepdefinitions;

import com.reto.tasks.SelectPeriod;
import com.reto.tasks.SelectPlan;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PrecingStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the user open the pricing page")
    public void thatTheUserAccessesThePricingPage() {
        theActorCalled("User").attemptsTo(
                Open.url("https://app-qa.enginebi.net/pricing")
        );
    }

    @And("I select the {word}")
    public void selectThePeriod(String period) {
        theActorInTheSpotlight().attemptsTo(
                SelectPeriod.inApp(period)
        );
    }

    @And("I subscribe to the {word}")
    public void subscribeToThePlan(String plan) {
        theActorInTheSpotlight().attemptsTo(
                SelectPlan.inApp(plan)
        );
    }

}
