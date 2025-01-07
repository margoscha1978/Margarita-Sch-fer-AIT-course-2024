package homework17IbanCode.model;

public class IbanCode {
   private String iban;

   //konstruktor
    public IbanCode(String iban) {
        this.iban = iban;
    }
   //metod
  public int lengCode(){ //schitaem simvoli
     return iban.length();
  }
  //metod summa
    public int controlCode(){
        if (iban.length() < 2){
            throw new IllegalArgumentException("Iban must have at least 2 symbol");
        }
        int sum = 0;
        sum += (int) iban.charAt(0);//kod pervogo simvola
        sum += (int) iban.charAt(1);//kod vtorogo simvola
        return sum;
    }
  //metod proverki validnosti IBAN
    public boolean isValid(){
        return iban.length() == 22;
    }
  //metod polichenija IBAN
    public String getIban() {
        return iban;
    }
}//klass ende
