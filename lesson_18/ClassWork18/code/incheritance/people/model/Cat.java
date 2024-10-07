public class Cat extends Pet {

    private double weight;
    private double height;
    private String breed;

    public Cat(int id, String nickname, int age, String breed, double height, double weight) {
        super(id, "Cat", age, nickname);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public void meow() {
        System.out.println(nickname + " мяукает : Мяу!");
    }

    public void live() {
        System.out.println(nickname + " спит.");
        System.out.println(nickname + " играет.");
        System.out.println(nickname + " гуляет.");
        System.out.println(nickname + " ест.");
    }
}

