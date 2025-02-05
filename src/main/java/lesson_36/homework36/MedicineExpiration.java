package lesson_36.homework36;
/*
Задание 5: Определение срока годности лекарств
Описание:
Лекарства имеют срок годности, который указывается на упаковке. Напишите программу,
которая принимает дату производства и срок хранения в месяцах, затем определяет дату окончания срока годности.
Требования:
    Ввести дату производства лекарства (dd.MM.yyyy).
    Ввести срок хранения в месяцах (например, 24 месяца).
    Рассчитать дату истечения срока годности.
    Проверить, не просрочено ли лекарство.
    Вывести результат в формате:
Пример вывода:
Дата производства: 15 марта 2021
Срок хранения: 24 месяца
Лекарство годно до: 15 марта 2023
Статус: ПРОСРОЧЕНО!
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MedicineExpiration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату производства (dd.MM.yyyy): ");
        String productionDateInput = scanner.nextLine();

        System.out.print("Введите срок хранения в месяцах: ");
        int shelfLifeMonths = Integer.parseInt(scanner.nextLine());

        LocalDate productionDate = LocalDate.parse(productionDateInput, formatter);
        LocalDate expirationDate = productionDate.plusMonths(shelfLifeMonths);

        LocalDate today = LocalDate.now();
        String status = today.isAfter(expirationDate) ? "ПРОСРОЧЕНО!" : "Годно";

        System.out.println("Дата производства: " + productionDate.format(formatter));
        System.out.println("Срок хранения: " + shelfLifeMonths + " месяцев");
        System.out.println("Лекарство годно до: " + expirationDate.format(formatter));
        System.out.println("Статус: " + status);
    }

} // klass ended
