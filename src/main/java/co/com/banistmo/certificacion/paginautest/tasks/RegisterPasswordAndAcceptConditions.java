package co.com.banistmo.certificacion.paginautest.tasks;

import co.com.banistmo.certificacion.paginautest.models.User;
import co.com.banistmo.certificacion.paginautest.userinterfaces.RegisterPasswordPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterPasswordAndAcceptConditions implements Task {

    private User password;

    public RegisterPasswordAndAcceptConditions(User password) {
        this.password = password;
    }

    public static RegisterPasswordAndAcceptConditions inTheWeb (User password){
            return instrumented(RegisterPasswordAndAcceptConditions.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password.getPassword()).into(RegisterPasswordPageElements.FIELD_PASSWORD),
                Enter.theValue(password.getPassword()).into(RegisterPasswordPageElements.FIELD_CONFIRM_PASSWORD),
                Click.on(RegisterPasswordPageElements.CHECK_TERMS_AND_CONDITIONS),
                Click.on(RegisterPasswordPageElements.CHECK_SECURITY_AND_PRIVACY_POLICIES),
                Click.on(RegisterPasswordPageElements.NEXT_BUTTON));
    }
}
