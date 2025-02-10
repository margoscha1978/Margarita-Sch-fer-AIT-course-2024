package lesson_37.homework37;
/*
Создадим класс студент и используем его для обработки информации о них через Stream...
 */
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

} // klass ended
