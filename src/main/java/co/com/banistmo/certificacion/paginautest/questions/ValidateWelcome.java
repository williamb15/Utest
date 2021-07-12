package co.com.banistmo.certificacion.paginautest.questions;

import co.com.banistmo.certificacion.paginautest.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateWelcome implements Question <String> {

    public static ValidateWelcome inTheWebSite() {
        return new ValidateWelcome();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(HomePageElements.MESSAGE_WELCOME, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        return Text.of(HomePageElements.MESSAGE_WELCOME).viewedBy(actor).asString();
    }
}
