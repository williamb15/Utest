package co.com.banistmo.certificacion.paginautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPasswordPageElements {

    public static final Target FIELD_PASSWORD=Target.the("Field password")
            .locatedBy("//input[@name='password']");

    public static final Target FIELD_CONFIRM_PASSWORD=Target.the("Field confirm password")
            .locatedBy("//input[@name='confirmPassword']");

    public static final Target CHECK_TERMS_AND_CONDITIONS=Target.the("Check terms and conditions")
            .locatedBy("//input[@id='termOfUse']//following-sibling::span[@class='checkmark signup-consent__checkbox error']");

    public static final Target CHECK_SECURITY_AND_PRIVACY_POLICIES=Target.the("Check security and privacy policies")
            .locatedBy("//input[@id='privacySetting']//following-sibling::span[@class='checkmark signup-consent__checkbox error']");

    public static final Target NEXT_BUTTON =Target.the("Next button")
            .locatedBy("//a[@id='laddaBtn']");

}
