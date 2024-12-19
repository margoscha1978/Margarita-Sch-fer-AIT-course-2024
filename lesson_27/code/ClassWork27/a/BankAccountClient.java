package ClassWork27.a;

public class BankAccountClient {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("222333");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance() );
        /*
        версия без ограничений защиты private,public,default
        bankAccount.accountNumber = "12345";
        bankAccount.balance = 10000;
        System.out.println(bankAccount.toString() );
       */

    }

} // klass ended
