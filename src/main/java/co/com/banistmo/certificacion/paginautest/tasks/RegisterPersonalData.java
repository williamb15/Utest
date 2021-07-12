package co.com.banistmo.certificacion.paginautest.tasks;

import co.com.banistmo.certificacion.paginautest.interactions.SelectInTheList;
import co.com.banistmo.certificacion.paginautest.models.User;
import co.com.banistmo.certificacion.paginautest.userinterfaces.HomePageElements;
import co.com.banistmo.certificacion.paginautest.userinterfaces.PersonalDataPageElements;
import co.com.banistmo.certificacion.paginautest.utils.GeneralConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import static co.com.banistmo.certificacion.paginautest.utils.ValidateDate.validateNameMonth;
import static co.com.banistmo.certificacion.paginautest.utils.ValidateOperatingSystem.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterPersonalData implements Task {

    private User personalData;

    public RegisterPersonalData(User personalData) {
        this.personalData = personalData;
    }

    public static RegisterPersonalData inTheWebSite(User personalData) {
        return instrumented(RegisterPersonalData.class, personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePageElements.REGISTER_BUTTON),
                Enter.theValue(personalData.getName()).into(PersonalDataPageElements.FIELD_NAME),
                Enter.theValue(personalData.getLastname()).into(PersonalDataPageElements.FIELD_LASTNAME),
                Enter.theValue(personalData.getEmail()).into(PersonalDataPageElements.FIELD_EMAIL),
                SelectInTheList.withOption(PersonalDataPageElements.FIELD_BIRTH_MONTH,
                        PersonalDataPageElements.OPTION_DATE_BIRTHDAY.of(validateNameMonth(personalData.getDateOfBirth().split("\\/")[0]))),
                SelectInTheList.withOption(PersonalDataPageElements.FIELD_BIRTH_DAY,
                        PersonalDataPageElements.OPTION_DATE_BIRTHDAY.of(personalData.getDateOfBirth().split("\\/")[1])),
                SelectInTheList.withOption(PersonalDataPageElements.FIELD_BIRTH_YEAR,
                        PersonalDataPageElements.OPTION_DATE_BIRTHDAY.of(personalData.getDateOfBirth().split("\\/")[2])),
               Check.whether(validateLanguage().equals(GeneralConstants.SPANISH)).andIfSo(
                       Enter.theValue(validateLanguage()).into(PersonalDataPageElements.FIELD_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(PersonalDataPageElements.NEXT_BUTTON)));
    }
}
