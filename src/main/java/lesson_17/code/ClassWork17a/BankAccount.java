package ClassWork17a;
/*
Создайте класс BankAccount, который будет представлять банковский счет.
В этом классе реализуйте следующие функциональные возможности:
	1.	Поля:
	•	accountNumber (номер счета) — строка.
	•	accountHolder (владелец счета) — строка.
	•	balance (баланс) — число с плавающей точкой (double), начальное значение — 0.0.
	2.	Конструкторы:
	•	Конструктор с двумя параметрами (accountNumber и accountHolder),
	который создает объект счета с указанным номером счета и владельцем, а начальный баланс устанавливает в 0.0.
	•	Конструктор с тремя параметрами (accountNumber, accountHolder и initialBalance),
	 который создает объект счета с указанным номером, владельцем и начальным балансом.
	3.	Методы:
	•	deposit(double amount): Метод для пополнения счета. Принимает сумму пополнения и добавляет ее к текущему балансу.
	•	withdraw(double amount): Метод для снятия средств. Принимает сумму для снятия и уменьшает баланс,
	 если средств достаточно. Если средств недостаточно, выводит сообщение об ошибке.
	•	displayInfo(): Метод для отображения информации о счете, включая номер счета, владельца и текущий баланс.
	4.	Дополнительно:
	•	Добавьте проверку на то, что сумма пополнения или снятия должна быть положительной.
	 Если переданное значение отрицательное, выводите сообщение об ошибке.
 */

public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <  0 ){
            System.out.println("Negatiwe amount ");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposit "+ amount + " New balance: " + balance);
        }

    }

    public void withdraw(double amout){
        if(balance < amout || amout < 0 ){
            System.out.println("Insuffizient funds. Wrong amout. Balanse: ");
        }
        else{
            balance = balance - amout;
            System.out.println("Withdraw " + amout + " New balanse: " + balance );
        }
    }

    public void displayInfo(){
        System.out.println("Номер аккаута: " + accountNumber + "\nВладелец счета: " +
                accountHolder + "\nБалланс счета: " + balance + "\n-------------------");
    }

} // klass endet