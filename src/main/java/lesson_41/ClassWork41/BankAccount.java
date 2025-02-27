package lesson_41.ClassWork41;
/*
1.	Разработать класс BankAccount, который будет сериализуемым.
	2.	Сериализовать несколько объектов BankAccount в бинарный файл (например, accounts.dat).
	3.	Десериализовать эти объекты обратно, проверить корректность считывания и вывести их состояние на экран.
Детали реализации
	1.	Класс BankAccount:
	•	Поля, которые обязательно нужны:
	•	String accountNumber: уникальный номер счёта (например, "ACC123456").
	•	double balance: текущий баланс на счёте.
	•	String holderName: имя владельца счёта (например, "John Doe").
	•	Дополнительно добавьте поле:
	•	transient int pinCode; — PIN-код, который не должен сериализоваться
	    (т.е.после десериализации станет значением по умолчанию: 0).
	•	Реализуйте интерфейс Serializable в классе BankAccount.
	•	(Опционально) добавьте статическое поле serialVersionUID, чтобы зафиксировать версию класса.
 */
import java.io.Serializable;

public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    private String accountNumber;
    private double balance;
    private String holderName;
    private transient int pinCode;

    public BankAccount(String accountNumber, double balance, String holderName, int pinCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
        this.pinCode = pinCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", holderName=" +
                holderName + ", pinCode=" + pinCode + '}';
    }

} // klass ended
