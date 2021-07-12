package co.com.banistmo.certificacion.paginautest.tasks;

import co.com.banistmo.certificacion.paginautest.interactions.SelectInTheList;
import co.com.banistmo.certificacion.paginautest.userinterfaces.RegisterDevicesPageElements;
import co.com.banistmo.certificacion.paginautest.utils.GeneralConstants;
import co.com.banistmo.certificacion.paginautest.utils.ValidateOperatingSystem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterDevices implements Task {

    public static RegisterDevices inTheWebSite() {
        return instrumented(RegisterDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectInTheList.withOption(RegisterDevicesPageElements.FIELD_COMPUTER,
                        RegisterDevicesPageElements.OPTION.of(ValidateOperatingSystem.validateOs())),
                SelectInTheList.withOption(RegisterDevicesPageElements.FIELD_VERSION,
                        RegisterDevicesPageElements.OPTION.of(ValidateOperatingSystem.validateOsVersion())),
                SelectInTheList.withOption(RegisterDevicesPageElements.FIELD_LANGUAGE,
                        RegisterDevicesPageElements.OPTION.of(ValidateOperatingSystem.validateLanguage())),
                SelectInTheList.withOption(RegisterDevicesPageElements.FIELD_MOBILE,
                        RegisterDevicesPageElements.OPTION.of(GeneralConstants.NO_MOBILE_DEVICE)),
                Click.on(RegisterDevicesPageElements.NEXT_BUTTON));
    }
}
