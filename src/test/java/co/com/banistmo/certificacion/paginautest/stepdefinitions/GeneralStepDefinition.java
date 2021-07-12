package co.com.banistmo.certificacion.paginautest.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.banistmo.certificacion.paginautest.utils.GeneralConstants.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GeneralStepDefinition {

    @Managed(driver = CHROME)
    protected WebDriver hisBrowser;

    @SuppressWarnings("unchecked")
    public void setUp() {
        setTheStage(new Cast());
        theActorCalled(USER);
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
}
