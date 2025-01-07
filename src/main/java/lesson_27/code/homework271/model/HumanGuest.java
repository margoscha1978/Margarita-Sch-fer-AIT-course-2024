package homework271.model;
public class HumanGuest extends Guest {
    public String gender; // Гендер

    // Конструктор
    public HumanGuest(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override
    public void performAction() {

    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Gender: " + gender;
    }
}