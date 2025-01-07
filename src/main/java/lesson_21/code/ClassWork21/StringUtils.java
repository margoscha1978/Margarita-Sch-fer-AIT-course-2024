package ClassWork21;
/*
 * Утилитарный класс для работы со строками.
 * Содержит метод для объединения двух строк.
 */

public class StringUtils {
    /*
     * Метод для объединения двух строк. Если одна из строк равна null,
     * она заменяется на пустую строку.
     * @param a первая строка / first string
     * @param b вторая строка / second string
     * @return результат объединения строк / the result of concatenating the strings
     */

    public String concatenate(String a, String b) {
        // Если строка a равна null, заменяем на пустую строку
        if (a == null) {
            a = "";
        }
        // Если строка b равна null, заменяем на пустую строку
        if (b == null) {
            b = "";
        }
        // Объединяем строки
        return a + b;
    }
}// klass ended

