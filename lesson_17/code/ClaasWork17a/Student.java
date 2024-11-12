package ClaasWork17a;

import java.util.Objects;

public class Student {

    String name;
    int groupNumber;

    public Student(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;

    }

    @Override
    public boolean equals(Object o) { // определяем параметры уникальности списка студентов, здесь имя и группа
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return groupNumber == student.groupNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groupNumber);
    }
    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", groupNumber=").append(groupNumber);
        sb.append('}');
        return sb.toString();
    }

} // klass ended