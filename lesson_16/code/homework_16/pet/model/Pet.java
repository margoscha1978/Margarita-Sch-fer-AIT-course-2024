package homework_16.pet.model;

public class Pet {

    // zapros: id,rassa,zwet,vozrast,klichka...
    private int id;
    private String name;
    private String breed;
    private int age;
    private boolean gender;

    //konstruktor _ get and set.
    public Pet(int id, String name, String breed, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "homework_16.pet.model.Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void walking() {
        System.out.println("homework_16.pet.model.Pet is walking...");
    }
    public void playing(){
        System.out.println("homework_16.pet.model.Pet playing...");

    }
    public void barks(){
        System.out.println("homework_16.pet.model.Pet barks/meows...  ");
    }
    public void sleeping(){
        System.out.println("The pet is sleeping...");
    }
    public void eats(){
        System.out.println("homework_16.pet.model.Pet eats...");
    }

}//klass ende






















