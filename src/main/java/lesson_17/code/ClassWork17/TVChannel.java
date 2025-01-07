package ClassWork17;
/*
Задание: Система Управления Телевизионным Каналом с Рейтингом Шоу
Теперь вы работаете над улучшенной системой управления телевизионным каналом,
которая позволяет пользователю управлять уникальными телешоу, добавлять их в сетку вещания,
 удалять, проверять наличие и выставлять рейтинги.
Каждое телешоу представлено отдельным классом TVShow, который хранит название и рейтинг шоу.
 Все уникальные телешоу хранятся в HashSet класса TVChannel.
	2.	TVChannel – Класс, управляющий коллекцией телешоу.
	•	Поле:
	•	HashSet<TVShow> shows – Хранит уникальные телешоу.
	•	Методы:
	•	addShow(TVShow show) – Добавляет телешоу, если его еще нет в сетке.
	•	removeShow(String showName) – Удаляет телешоу по названию.
	•	listShows() – Выводит все телешоу с их рейтингами.
	•	isShowPresent(String showName) – Проверяет наличие телешоу.
	•	clearSchedule() – Очищает сетку вещания.
	•	mergeSchedules(TVChannel otherChannel) – Объединяет сетку с другим каналом.
Дополнительные задачи:
	1.	Поиск телешоу по рейтингу: Реализуйте метод searchByRating(int minRating, int maxRating),
	который выводит телешоу с рейтингом в указанном диапазоне.
	2.	Популярное телешоу: Напишите метод, выводящий самое популярное телешоу, используя максимальный рейтинг.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TVChannel {

    static HashSet<TVShow> shows = new HashSet<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            showInfo();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Enter tvshow name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter show rating: ");
                    int rating = scanner.nextInt();
                    TVShow tvShow = new TVShow(name, rating);
                    addShow(tvShow);
                }
                case 2 -> {
                    System.out.print("Enter tvshow name: ");
                    String name = scanner.next();
                    removeShow(name);
                }
                case 3 -> {
                    System.out.print("Enter tvshow name: ");
                    String name = scanner.next();
                    isShowPresent(name);
                }
                case 4 -> listShows();
                case 5 -> clearSchedule();
                case 6 -> {
                    TVShow showOne = new TVShow("Voice", 4);
                    TVShow showTwo = new TVShow("News", 5);
                    TVChannel otherTvChannel = new TVChannel();
                    addShow(showOne);
                    addShow(showTwo);

                    mergeSchedules(otherTvChannel);
                }
                case 0 -> {
                    scanner.close();
                    System.out.println("Exiting...");
                    running = false;
                }

            }

        }
    }


    public static void removeShow(String showName) {
        if (shows.isEmpty()) {
            System.out.println("shows is empty");
        } else {
            Iterator<TVShow> iterator = shows.iterator();
            while (iterator.hasNext()) {
                TVShow show = iterator.next();
                if (show.getName().equals(showName)) {
                    iterator.remove();
                    System.out.println("removed show " + showName);
                }
            }
        }
    }

    public static void listShows() {
        if (shows.isEmpty()) {
            System.out.println("shows is empty");
        } else {
            for (TVShow show : shows) {
                System.out.println(show);
            }
        }
    }

    public static void mergeSchedules(TVChannel otherChannel) {
        shows.addAll(otherChannel.shows);
        System.out.println("merged shows " + shows.size() + " channels");
    }

    public static void clearSchedule() {
        shows.clear();
    }

    public static boolean isShowPresent(String showName) {
        if (shows.isEmpty()) {
            System.out.println("shows is empty");
            return false;
        } else {
            for (TVShow show : shows) {
                if (show.getName().equals(showName)) {
                    System.out.println("show " + showName + " is present");
                    return true;
                }
            }
            System.out.println("show " + showName + " is not present");
            return false;
        }
    }


    public static void addShow(TVShow show) {
        boolean addSHowResult = shows.add(show);
        if (addSHowResult) {
            System.out.println("Added show: " + show);
        } else {
            System.out.println("Failed to add show: " + show);
        }
    }

    public static void showInfo() {
        System.out.println("\nВыберите действие:");
        System.out.println("1. Добавить телешоу");
        System.out.println("2. Удалить телешоу");
        System.out.println("3. Проверить наличие телешоу");
        System.out.println("4. Показать все телешоу");
        System.out.println("5. Очистить сетку вещания");
        System.out.println("6. Объединить сетки вещания с другим каналом");
        System.out.println("0. Выход");
    }

} // klass ended