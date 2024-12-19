package ClassWork27.a;

public class BankAccount {

    private final String accountNumber; //  PUBLIC открытый тип данных, не защищен публичный, может изменить любой человек
    private double balance = 1000; // PRIVATE double balance = 1000; закрытый класс,защита от внешнего воздействия
    public String bankAddress = "Berlin,weg 12"; // доступ только внутри метода DEFAULT
    // PROTECTED доступ внутри пакета и для наследующих классов

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = getBalance();
    }

    public String getAccountNumber(){
    return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        String sb = "BankAccount{" + "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", bankAddress='" + bankAddress + '\'' +
                '}';
        return sb;
    }


} // klass ended
