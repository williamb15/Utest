package co.com.banistmo.certificacion.paginautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PersonalDataPageElements {

    public static final Target FIELD_NAME =Target.the("Field first Name")
            .locatedBy("//input[@id='firstName']");

    public static final Target FIELD_LASTNAME =Target.the("Field LastName")
            .locatedBy("//input[@id='lastName']");

    public static final Target FIELD_EMAIL =Target.the("Field Email")
            .locatedBy("//input[@id='email']");

    public static final Target FIELD_BIRTH_MONTH =Target.the("Field birth month")
            .locatedBy("//select[@id='birthMonth']");

    public static final Target FIELD_BIRTH_DAY =Target.the("Field birth day")
            .locatedBy("//select[@id='birthDay']");

    public static final Target FIELD_BIRTH_YEAR =Target.the("Field birth year")
            .locatedBy("//select[@id='birthYear']");

    public static final Target OPTION_DATE_BIRTHDAY =Target.the("Option date birthday ")
            .locatedBy("//option[@label='{0}']");

    public static final Target FIELD_LANGUAGE =Target.the("Field language")
            .locatedBy("//div[@id='languages']//input");

    public static final Target OPTION_LANGUAGE =Target.the("Option language")
            .locatedBy("//div[@class='ui-select-choices-row']//div[contains(text(), '{0}')]");

    public static final Target NEXT_BUTTON =Target.the("Next button")
            .locatedBy("//a[@class='btn btn-blue']");

}
