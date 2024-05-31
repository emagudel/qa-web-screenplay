package com.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pricing.feature",
        glue = "com.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PricingRunner {
}
