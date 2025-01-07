package homework20;
//. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов:
// byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main.
// Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов
// (byte, int, short, long, char, float, double).
// Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class MinMaxValues {
    public static void main(String[] args) {
        // Проверяем, были ли переданы аргументы
        if (args.length == 0) {
            printAllMinMax();
        } else {
            for (String arg : args) {
                try {
                    printMinMax(arg);
                } catch (NumberFormatException e) {
                    System.out.println("Неверный тип: " + arg);
                }
            }
        }
    }

    // Метод для вывода минимальных и максимальных значений для всех типов
    private static void printAllMinMax() {
        System.out.println("Тип: byte, Минимум: " + Byte.MIN_VALUE + ", Максимум: " + Byte.MAX_VALUE);

        System.out.println("Тип: short, Минимум: " + Short.MIN_VALUE + ", Максимум: " + Short.MAX_VALUE);

        System.out.println("Тип: char, Минимум: " + (int) Character.MIN_VALUE + ", Максимум: " + (int) Character.MAX_VALUE);

        System.out.println("Тип: int, Минимум: " + Integer.MIN_VALUE + ", Максимум: " + Integer.MAX_VALUE);

        System.out.println("Тип: float, Минимум: " + Float.MIN_VALUE + ", Максимум: " + Float.MAX_VALUE);

        System.out.println("Тип: double, Минимум: " + Double.MIN_VALUE + ", Максимум: " + Double.MAX_VALUE);
    }

    // Метод для вывода минимальных и максимальных значений для указанного типа
    private static void printMinMax(String arg) throws NumberFormatException {
        // Проверяем, является ли аргумент числом, или это char
        if (arg.length() == 1) {
            char ch = arg.charAt(0);
            System.out.println("Тип: char, Минимум: " + ((int) Character.MIN_VALUE) + ", Максимум: " + ((int) Character.MAX_VALUE));
        } else {
            throw new NumberFormatException();
        }

        // Проверяем, если аргумент можно преобразовать в различные числовые типы
        try {
            byte b = Byte.parseByte(arg);
            System.out.println("Тип: byte, Минимум: " + Byte.MIN_VALUE + ", Максимум: " + Byte.MAX_VALUE);
        } catch (NumberFormatException ignored) {}

        try {
            short s = Short.parseShort(arg);
            System.out.println("Тип: short, Минимум: " + Short.MIN_VALUE + ", Максимум: " + Short.MAX_VALUE);
        } catch (NumberFormatException ignored) {}

        try {
            int i = Integer.parseInt(arg);
            System.out.println("Тип: int, Минимум: " + Integer.MIN_VALUE + ", Максимум: " + Integer.MAX_VALUE);
        } catch (NumberFormatException ignored) {}

        try {
            float f = Float.parseFloat(arg);
            System.out.println("Тип: float, Минимум: " + Float.MIN_VALUE + ", Максимум: " + Float.MAX_VALUE);
        } catch (NumberFormatException ignored) {}

        try {
            double d = Double.parseDouble(arg);
            System.out.println("Тип: double, Минимум: " + Double.MIN_VALUE + ", Максимум: " + Double.MAX_VALUE);
        } catch (NumberFormatException ignored) {}
    }
}
