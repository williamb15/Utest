package co.com.banistmo.certificacion.paginautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LocationDataPageElements {

    public static final Target FIELD_CITY =Target.the("Field city")
            .locatedBy("//input[@id='city']");

    public static final Target FIELD_POST_CODE =Target.the("Field post code")
            .locatedBy("//input[@id='zip']");

    public static final Target FIELD_COUNTRY =Target.the("Field country")
            .locatedBy("//span[@class='ui-select-match-text pull-left']");

    public static final Target OPTION_CITY =Target.the("Option city")
            .locatedBy("(//span[@class='pac-item-query'][contains(text(),'')])[1]");

    public static final Target OPTION_COUNTRY =Target.the("Option country")
            .locatedBy("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//*[text()='{0}']");

    public static final Target NEXT_BUTTON =Target.the("Next button")
            .locatedBy("//a[@class='btn btn-blue pull-right']");

}
