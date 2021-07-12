package co.com.banistmo.certificacion.paginautest.utils;

import java.util.Locale;

public class ValidateOperatingSystem {

    public static String validateOs(){
        return System.getProperty("os.name").substring(0,7);
    }

    public static String validateOsVersion(){
        return System.getProperty("os.version").substring(0,2);
    }

    public static String validateLanguage(){
        String language = Locale.getDefault().getDisplayLanguage();
        if(language.equals("español")){
            language = "Spanish";
        }
        return language;
    }
}
