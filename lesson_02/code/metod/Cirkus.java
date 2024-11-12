package metod;

public class Cirkus {
    public static void main(String[] args) {

        lightOn();
        entertainer();
        lightsOff();
    }

    public static void lightOn() {
        System.out.println("Ligts ONN...");
    }

    public static void lightsOff() {

        System.out.println("Lights OFF...");
    }

    public static void entertainer() {
        jogger();
        cloun();
        singer();
    }

    public static void jogger() {
        System.out.println("I am jogging");

    }

    public static void cloun() {
        System.out.println("I am joking...");
    }

    public static void singer() {
        System.out.println("I am singing...");

    }

} // klass ended