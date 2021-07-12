package co.com.banistmo.certificacion.paginautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageElements {

    public static final Target REGISTER_BUTTON =Target.the("Register Button")
                    .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

    public static final Target MESSAGE_WELCOME =Target.the("Message welcome")
            .locatedBy("//div[@class='image-box-header']/h1");

    public static final Target XXX =Target.the("")
            .locatedBy("");
}