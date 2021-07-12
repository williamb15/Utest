package co.com.banistmo.certificacion.paginautest.tasks;

import co.com.banistmo.certificacion.paginautest.interactions.SelectInTheList;
import co.com.banistmo.certificacion.paginautest.models.User;
import co.com.banistmo.certificacion.paginautest.userinterfaces.LocationDataPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterLocationInformation implements Task {

    private User locationData;

    public RegisterLocationInformation(User locationData) {
        this.locationData = locationData;
    }

    public static RegisterLocationInformation inTheWebSite(User locationData) {
        return instrumented(RegisterLocationInformation.class, locationData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LocationDataPageElements.FIELD_CITY, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(locationData.getCity()).into(LocationDataPageElements.FIELD_CITY),
                Click.on(LocationDataPageElements.OPTION_CITY),
                Enter.theValue(locationData.getPostalCode()).into(LocationDataPageElements.FIELD_POST_CODE),
                SelectInTheList.withOption(LocationDataPageElements.FIELD_COUNTRY,
                        LocationDataPageElements.OPTION_COUNTRY.of(locationData.getCountry())),
                Click.on(LocationDataPageElements.NEXT_BUTTON));
    }
}
