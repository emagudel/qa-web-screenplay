package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target INPUT_USER = the("Campo Usuario").located(By.id("user-name"));
    public static final Target INPUT_CLAVE = the("Campo Clave").located(By.id("password"));
    public static final Target BOTON_LOGIN = the("Boton Login").located(By.id("login-button"));

}
