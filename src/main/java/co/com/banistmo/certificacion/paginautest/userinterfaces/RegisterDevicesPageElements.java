package co.com.banistmo.certificacion.paginautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterDevicesPageElements {

    public static final Target FIELD_COMPUTER=Target.the("Field computer")
            .locatedBy("//div[@name='osId']//span[@class='ui-select-match-text pull-left ui-select-allow-clear']");

    public static final Target OPTION =Target.the("Option")
            .locatedBy("//li[@class='ui-select-choices-group']//div[text()='{0}']");

    public static final Target FIELD_VERSION =Target.the("Field version")
            .locatedBy("//div[@name='osVersionId']//child::span[@aria-label]");

    public static final Target FIELD_LANGUAGE =Target.the("Field language")
            .locatedBy("//div[@name='osLanguageId']//child::span[@aria-label]");

    public static final Target FIELD_MOBILE =Target.the("Field mobile")
            .locatedBy("//div[@name='handsetMakerId']//child::span[@aria-label]");

    public static final Target NEXT_BUTTON =Target.the("Next button")
            .locatedBy("//a[@class='btn btn-blue pull-right']");

}
