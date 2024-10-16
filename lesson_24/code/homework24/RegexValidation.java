package homework24;
// Создайте регулярные выражения для следующих проверок:
//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
//Убедитесь, что они верные, выполнив тесты - см. regex_validator

import java.util.Objects;

public class RegexValidation {

 private String creditCardNumber;// (8-16 digits)
 private String testDateFormatDDMMYYYY;//(Format: DD.MM.YYYY)
 private String dateFormatYYYYMMDD;//(Format: YYYY-MM-DD)
 private String phoneNumber;// (Format: +99(99)9999-9999)
 private String numberLessAnd;// Number less and equals 255 (positive)

     public RegexValidation(String creditCardNumber, String testDateFormatDDMMYYYY, String dateFormatYYYYMMDD,
                      String phoneNumber, String numberLessAnd) {
         this.creditCardNumber = creditCardNumber;
         this.testDateFormatDDMMYYYY = testDateFormatDDMMYYYY;
         this.dateFormatYYYYMMDD = dateFormatYYYYMMDD;
         this.phoneNumber = phoneNumber;
         this.numberLessAnd = numberLessAnd;
     }

     public String getCreditCardNumber() {
         return creditCardNumber;
     }

     public void setCreditCardNumber(String creditCardNumber) {
         this.creditCardNumber = creditCardNumber;
     }

     public String getTestDateFormatDDMMYYYY() {
         return testDateFormatDDMMYYYY;
     }

     public void setTestDateFormatDDMMYYYY(String testDateFormatDDMMYYYY) {
         this.testDateFormatDDMMYYYY = testDateFormatDDMMYYYY;
     }

     public String getDateFormatYYYYMMDD() {
         return dateFormatYYYYMMDD;
     }

     public void setDateFormatYYYYMMDD(String dateFormatYYYYMMDD) {
         this.dateFormatYYYYMMDD = dateFormatYYYYMMDD;
     }

     public String getPhoneNumber() {
         return phoneNumber;
     }

     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }

     public String getNumberLessAnd() {
         return numberLessAnd;
     }

     public void setNumberLessAnd(String numberLessAnd) {
         this.numberLessAnd = numberLessAnd;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegexValidation regexTest)) return false;
        return Objects.equals(creditCardNumber, regexTest.creditCardNumber)
                && Objects.equals(testDateFormatDDMMYYYY, regexTest.testDateFormatDDMMYYYY)
                && Objects.equals(dateFormatYYYYMMDD, regexTest.dateFormatYYYYMMDD)
                && Objects.equals(phoneNumber, regexTest.phoneNumber) && Objects.equals(numberLessAnd, regexTest.numberLessAnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardNumber, testDateFormatDDMMYYYY, dateFormatYYYYMMDD, phoneNumber, numberLessAnd);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegexTest{");
        sb.append("creditCardNumber='").append(creditCardNumber).append('\'');
        sb.append(", testDateFormatDDMMYYYY='").append(testDateFormatDDMMYYYY).append('\'');
        sb.append(", dateFormatYYYYMMDD='").append(dateFormatYYYYMMDD).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", numberLessAnd='").append(numberLessAnd).append('\'');
        sb.append('}');
        return sb.toString();
    }

}