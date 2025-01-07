package ClassWork17a;

import java.util.HashSet;

public class StudentApp {
     static HashSet <Student> students = new HashSet<>();

    public static void main(String[] args) {

        // список студентов
        Student studentTwo = new Student("Maria", 22);
        Student studentOne = new Student("Maria", 21);
        Student studentThree = new Student("Maria", 21);

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);

        System.out.println("Sitze of student " + students.size());

        System.out.println(studentOne.equals(studentTwo)); // сравнил и определил, что это одинаковые студенты

        System.out.println(students);

    }

} // klass ended

// Уникальность можно менять: убрать и проверить по номеру группы, или по имени, или по фамилии...
// Для этого в классе Student убрать из конструктора: номер группы или имя...
// При наличии совпадений: группа, имя, дата рождения - уникальность определяется номером ID