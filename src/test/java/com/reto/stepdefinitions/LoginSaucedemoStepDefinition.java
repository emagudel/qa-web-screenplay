package com.reto.stepdefinitions;

import com.reto.tasks.Autentica;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.reto.userinterfaces.ProductsPage.TITLE_PRODUCTOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSaucedemoStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el Usuario es comprador usual")
    public void elUsuarioEsAdministrador() {
        theActorCalled("Juan").attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("ingresa sus credenciales")
    public void ingresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                Autentica.enSaucedemo()
        );
    }

    @Then("su autenticacion es exitosa")
    public void suAutenticacionEsExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(TITLE_PRODUCTOS).text().isEqualTo("Products"));
    }
}
