package com.hdi.screenplay.serenity.features.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "com.hdi.screenplay.serenity.features.step_definitions" },
        plugin = {"pretty"},
        features = {"src/test/resources/features/serenity/"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class CuandoPrueboSerenity {

    public static void main(String[] args) {

    }

}
