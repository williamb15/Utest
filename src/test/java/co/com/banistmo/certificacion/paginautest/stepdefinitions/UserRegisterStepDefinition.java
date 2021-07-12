package co.com.banistmo.certificacion.paginautest.stepdefinitions;

import co.com.banistmo.certificacion.paginautest.exceptions.RegisterException;
import co.com.banistmo.certificacion.paginautest.models.User;
import co.com.banistmo.certificacion.paginautest.questions.ValidateWelcome;
import co.com.banistmo.certificacion.paginautest.tasks.RegisterDevices;
import co.com.banistmo.certificacion.paginautest.tasks.RegisterLocationInformation;
import co.com.banistmo.certificacion.paginautest.tasks.RegisterPasswordAndAcceptConditions;
import co.com.banistmo.certificacion.paginautest.tasks.RegisterPersonalData;
import co.com.banistmo.certificacion.paginautest.utils.GeneralConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import static co.com.banistmo.certificacion.paginautest.utils.GeneralConstants.URL;

public class UserRegisterStepDefinition extends GeneralStepDefinition {

    @Before
    public void config() {
        setUp();
    }

    @Given("^the user is on the website and wishes to register$")
    public void theUserIsOnTheWebsiteAndWishesToRegister() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @When("^the user finishes correctly entering the information for the registration$")
    public void theUserFinishesCorrectlyEnteringTheInformationForTheRegistration(List<User>data) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPersonalData.inTheWebSite(data.get(0)),
                RegisterLocationInformation.inTheWebSite(data.get(0)), RegisterDevices.inTheWebSite(),
                RegisterPasswordAndAcceptConditions.inTheWeb(data.get(0)));
    }

    @Then("^he will see the message (.*)$")
    public void heWillSeeTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateWelcome.inTheWebSite(),equalTo(message))
                .orComplainWith(RegisterException.class, GeneralConstants.MESSAGE_ERROR));
    }
}
