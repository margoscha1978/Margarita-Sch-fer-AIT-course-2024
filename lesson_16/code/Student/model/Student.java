package Student.model;
public class Student{

    // cozdali pola informazii v konstruktor
private int id;
private String name;
private String lastName;
private int age;
private String specialization;

    //konstruktor
    public Student(int id, String name, String lastName, int age, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String displayStudent(){
    return String.format("ID: %d, name: %s, lastname: %s, age: %d, specialisation: %s", id, name, lastName, age, specialization );
    }
    public void walking() {
        System.out.println("Student is walking...");
    }
    public void studing(){
        System.out.println("Student studiyng...");
    }
    public void exam(){
        System.out.println("Passes the exam...  ");
    }
    public void sleeping(){
        System.out.println("Student is sleeping...");
    }
    public void vacation(){
        System.out.println("The student went on vacation...");
    }
}// klass ende