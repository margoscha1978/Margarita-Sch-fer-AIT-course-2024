package lesson_37.homework37;
/*
 Используем Stream API для фильтрации студентов, сдавших экзамены, и получения их имён...
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 55),
                new Student("Charlie", 70),
                new Student("David", 90)
        );

        List<String> passedStudents = students.stream()
                .filter(student -> student.getGrade() >= 60)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(passedStudents);
    }

} // klass ended
