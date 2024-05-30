package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductsPage {
    public static final Target TITLE_PRODUCTOS = the("Titulo Prodcutos").located(By.xpath("//span[@data-test=\"title\"]"));
}
