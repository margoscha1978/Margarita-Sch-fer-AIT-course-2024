public class Dog extends Pet {

    private double weight;
    private double height;
    private String breed;

    public Dog(int id, String nickname, int age, String breed, double height, double weight) {
        super(id, "Dog", age, nickname);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public void bark() {
        System.out.println(nickname + " лает : Гав!");
    }

    public void live() {
        System.out.println(nickname + " спит.");
        System.out.println(nickname + " охраняет.");
        System.out.println(nickname + " играет.");
        System.out.println(nickname + " гуляет.");
        System.out.println(nickname + " ест.");
    }


}

