package co.com.banistmo.certificacion.paginautest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/user_register.feature",
        glue = "co.com.banistmo.certificacion.paginautest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class UserRegisterRunner {
}
