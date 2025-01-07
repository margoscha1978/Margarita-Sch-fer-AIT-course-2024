package ClassWork17a;

import java.util.HashSet;

public class TransactionManager {
    static HashSet<Transaction> transactions = new HashSet<>();
    public static void main(String[] args) {

        // список трансакций
        Transaction transactionsOne = new Transaction("1212",1000,"EUR");
        Transaction transactionsTwo = new Transaction("1213",1000,"EUR");
        Transaction transactionsThree = new Transaction("1212",1000,"EUR");

        transactions.add(transactionsOne);
        transactions.add(transactionsTwo);
        transactions.add(transactionsThree);

        System.out.println("Sitze of transaktions " + transactions.size());

        System.out.println(transactions);

    }

} // klass ended

// Уникальность можно менять: убрать и проверить по ID трансакции, или по имени, или по фамилии клиента...
// Для этого в классе Transaction убрать из конструктора: фамилию или имя, или ID трансакции...
// При наличии совпадений: имя, фамилия, дата рождения клиента - уникальность определяется исключительно номером ID