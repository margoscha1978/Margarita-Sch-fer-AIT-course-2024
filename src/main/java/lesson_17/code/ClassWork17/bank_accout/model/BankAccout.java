package ClassWork17.bank_accout.model;

public class BankAccout {

//- Реализуем класс BankAccount:
//  - поля: account, owner, bank, branch, balance
//  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
//  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
//    полиморфизма)
//  - реализуем методы deposit() и withdraw() в классе BankAccount

// fields - polja
    private long id;//bank -> klient -> id
    private String owner;//dannie polzovatelja
    private String bankName;
    private int branch;//filial banka
    private double balanse;

    public BankAccout(long id, String owner, String bankName, int branch, double balanse) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balanse = balanse;
    }

//2 konstruktor dlja vkladov bez deng,polimorfizm - sotrunichestvo v odnoi programme odinakovix metodov
    public BankAccout(long id, String owner, String bankName, int branch) {//vse polja bez ballansa
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
    }

 //3 konstruktor dlja anonima
    public BankAccout(long id, String bankName, int branch, double balanse) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balanse = balanse;
    }

    //getter,setter
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public int getBranch() {
        return branch;
    }
    public void setBranch(int branch) {
        this.branch = branch;
    }
    public double getBalanse() {
        return balanse;
    }
    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }
    //metod - display,
    public void  display(){
      System.out.println("Account: " + id + ",owner: " + owner + ",bankName: " + bankName + ",branch: " + branch + ",balanse: " + balanse );
  }
    @Override //moschno,no ne vsegda
    public String toString() {
        return "BankAccout{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balanse=" + balanse +
                '}';
    }

    //ballans scheta
   public boolean deposit(double sum){
     balanse = balanse + sum;
     return true;
   }
  //snimaem dengi
    public boolean withdraw(double sum){
     if (sum <= balanse) {
         balanse = balanse - sum;//operazija s summoi
     }
     return false;
    }

}//klass ende
