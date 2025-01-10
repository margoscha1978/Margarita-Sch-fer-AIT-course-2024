package ClassWork29a;

public class MainMusic {
    public static void main(String[] args) {

        // Создаем и работаем с поп-треком
        // Creating and working with a pop track
        PopTrack popTrack = new PopTrack("Pop-Dance-hits", "DJ Khaled", 10);
        popTrack.play(); // Воспроизведение поп-трека / Playing the pop track
        popTrack.printInfo(); // Вывод информации о поп-треке / Printing pop track info

        System.out.println("---------------------------");

        // Создаем и работаем с рок-треком
        // Creating and working with a rock track
        RockTrack rockTrack = new RockTrack("Rock-Dance-hits", "DJ Gutar", 100);
        rockTrack.play(); // Воспроизведение рок-трека / Playing the rock track
        rockTrack.printInfo(); // Вывод информации о рок-треке / Printing rock track info
    }
} // klass ended
