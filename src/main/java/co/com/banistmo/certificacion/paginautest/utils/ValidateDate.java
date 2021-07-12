package co.com.banistmo.certificacion.paginautest.utils;

public class ValidateDate {

    public static String validateNameMonth(String month) {
        String result;

        switch (month) {
            case "01": {
                result = "January";
                break;
            }
            case "02": {
                result = "February";
                break;
            }
            case "03": {
                result = "March";
                break;
            }
            case "04": {
                result = "April";
                break;
            }
            case "05": {
                result = "May";
                break;
            }
            case "06": {
                result = "June";
                break;
            }
            case "07": {
                result = "July";
                break;
            }
            case "08": {
                result = "August";
                break;
            }
            case "09": {
                result = "September";
                break;
            }
            case "10": {
                result = "October";
                break;
            }
            case "11": {
                result = "November";
                break;
            }
            case "12": {
                result = "December";
                break;
            }
            default: {
                result = "Error";
                break;
            }
        }
        return result;
    }

}
