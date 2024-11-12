package ClaasWork17a;
/*
Упражнение 1: Создание и добавление элементов в HashSet
	1.	Создайте HashSet, который будет хранить целые числа (Integer).
	2.	Добавьте в HashSet несколько чисел, в том числе и повторяющиеся значения.
	3.	Выведите на экран содержимое множества и проверьте, что дублирующиеся элементы не были добавлены
 */

import java.util.HashSet;

public class HashSetTasks {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);


/*
    Упражнение 2: Проверка наличия элемента
	1.	Создайте HashSet, который будет хранить названия городов.
	2.	Добавьте несколько городов в множество.
	3.	Напишите код, который проверяет, содержится ли определенный город в множестве (например, “Берлин”).
	4.	Если город присутствует, выведите сообщение “Город найден”. Если отсутствует — “Город не найден”.
 */
        HashSet<String> capitals = new HashSet<>();
        capitals.add("Berlin");
        capitals.add("Madrid");
        capitals.add("Parise");
        capitals.add("Pom");
        capitals.add("München");
        capitals.add("Salzburg");
        boolean capitalFound = capitals.contains("Vien");
        System.out.println("Vien --> " + capitalFound);

    /*
    Упражнение 3: Удаление элементов
	1.	Создайте HashSet для хранения имен студентов.
	2.	Добавьте несколько имен в HashSet.
	3.	Удалите одно из имен (например, “Анна”) из множества
	 и выведите сообщение о том, было ли имя удалено.
	4.	Также удалите имя, которого нет в множестве (например, “Петр”) и проверьте,
	 как HashSet реагирует на попытку удалить несуществующий элемент.
     */

        HashSet<String> student = new HashSet<>();
        student.add("Anna");
        student.add("Kiril");
        student.add("Alex");
        student.add("Nikolja");
        student.add("Semmi");
        student.add("Igor");
        System.out.println(student);

        student.remove("Anna");
        if(!student.contains("Anna")) {
            System.out.println("Anna удалена ");
        }
        System.out.println(student);
        student.remove("Peter");
        System.out.println(student);
    }

} // klass endet
