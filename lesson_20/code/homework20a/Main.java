package homework20a;

import java.util.Scanner;

/*
  Здесь запускаем интерфейс для работы с клиентом, который взаимодействует с классом AttractionManager,
  клиент получит доступ к меню для выбора его последующих шагов.
  Пропишем методы, обрабатывающие ввод пользователя и обрабатывающие ошибки,
  которые выводят информацию для пользователя, для работы с ним используем Skanner.
  При наличии ошибок при вводе, клиент будет получать сообщение с предложением повторить попытку/выход из приложения.
 */

public class Main {
    public static void main(String[] args) {
        AttractionManager manager = new AttractionManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Меню:");
            System.out.println("1. Добавить достопримечательность");
            System.out.println("2. Удалить достопримечательность");
            System.out.println("3. Просмотреть все достопримечательности");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            // Попробуем считать выбор пользователя
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверный ввод. Пожалуйста, введите число от 1 до 4.");
                continue; // уходим в начало цикла
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите название достопримечательности: ");
                    String attractionToAdd = scanner.nextLine();
                    manager.addAttraction(attractionToAdd);
                    break;
                case 2:
                    System.out.print("Введите название достопримечательности: ");
                    String attractionToRemove = scanner.nextLine();
                    manager.removeAttraction(attractionToRemove);
                    break;
                case 3:
                    manager.displayAttractions();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Ошибка: Некорректный выбор. Пожалуйста, введите число от 1 до 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

} // klass ended
