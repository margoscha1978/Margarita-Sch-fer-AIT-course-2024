package homework25;

public class Validator {
    //CreditCardNumber
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU dd-MM-yyyy
    public static boolean checkDateFormatEU(String str) {
        return str.matches("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(19|20)\\d{2}$");
    }

    //DateFormatUS MM-dd-yyyy
    public static boolean checkDateFormatUS(String str) {
        return str.matches("^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.(19|20)\\d{2}$");
    }

    //PhoneNumber
    public static boolean checkPhoneNumber(String str) {
        return str.matches("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$");
    }

    //LessEquals255 - IP-address XXX.XXX.XXX.XXX
    public static boolean checkLessEquals255(String str) {
        return str.matches("^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$");
        //^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$
    }
}
