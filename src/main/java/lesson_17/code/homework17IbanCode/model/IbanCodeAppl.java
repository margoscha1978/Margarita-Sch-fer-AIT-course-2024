package homework17IbanCode.model;

public class IbanCodeAppl {
    public static void main(String[] args) {
        IbanCode ibanCode = new IbanCode("DE918273645738");//primer IBAN
        System.out.println("IBAN lenght: " + ibanCode.lengCode());
        System.out.println("ASCII sum of first 2 Symbole: " + ibanCode.controlCode());
        System.out.println(" IBAN validity: " + ibanCode.isValid());

    }
}
