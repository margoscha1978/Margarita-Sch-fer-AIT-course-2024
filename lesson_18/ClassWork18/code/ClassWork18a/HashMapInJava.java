package ClassWork18a;

import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        // можно расширять с помощью ArrayList, HashSet/Map, гибкая и управляемая конструкция, капацитет на 25 ячеек
        HashMap<Integer,String> phonebook = new HashMap(25,0.50f); // расширение на 50% это f

        phonebook.put(491731234, "Alex");
        phonebook.put(392345678, "Anna");
        phonebook.put(693456789, "Bob");
        phonebook.put(693456789, "Boris");

        // однотипные ключи переписывают на новый с Боба перешли на Бориса
        if (!phonebook.containsKey(693456789)){
            phonebook.put(693456789, "Boris");
    }

    // ищем через значение ключа, по имени нужен цикл for
    boolean resultContainsKey = phonebook.containsKey(123456789);

        System.out.println(phonebook );
        System.out.println(resultContainsKey);
        System.out.println("-------------------");
        phonebook.remove(693456789);
        System.out.println(phonebook);
        System.out.println("-------------------");
        // phonebook.clear();
        // System.out.println(phonebook);
        String result = phonebook.get(693456789); // по ключу одно значение
        System.out.println(phonebook.keySet() ); // получение всех ключей
        System.out.println(phonebook.values() ); // получение значений через цикл
        System.out.println("--------------------");
        System.out.println(phonebook.entrySet() ); // получение всех пар ключ-значение
        System.out.println(phonebook.size() ); // размер хеша
        System.out.println(phonebook.isEmpty() ); // проверка заполнения хеша
        // TODO
        // phonebook.resize(); скачек размера сохраняемых значений и ключей от 25 до 1000
        System.out.println("--------------------------");
        System.out.println(phonebook.putIfAbsent(234156458,"Lukas") );// добавляет новый ключ и значение, Лукас
        System.out.println(phonebook);
        // позволяет исправить ошибку при введении данных, заменит Лукаса на Майка
        phonebook.computeIfPresent(234156458,(k, v) -> "Miyke");
        System.out.println(phonebook);
    }

} // klass ended
