package ClaasWork17a;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccountEconomy = new BankAccount("123456789","Donny Klars");
        bankAccountEconomy.displayInfo();
        bankAccountEconomy.deposit(20000);
        bankAccountEconomy.withdraw(5000);

        System.out.println("----------------------------------");

        BankAccount bankAccountVip = new BankAccount("987654321","Konni Darts",2500);
        bankAccountVip.displayInfo();
        bankAccountVip.deposit(5000);
        bankAccountVip.withdraw(1500);
        bankAccountVip.withdraw(150000);

    }
} // klass ended
