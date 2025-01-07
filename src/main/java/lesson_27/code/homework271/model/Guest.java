package homework271.model;

import homework271.dao.Guestable;

public abstract class Guest implements Guestable {
    public String name;
    public int age;

    // Конструктор
    protected Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int getAge() {
        return age;
    }

    public Guest() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guest{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public abstract void performAction();

    public void checkIn(){
    }
    public void checkOut(){
    }
    public String getDetails(){
        return "Guest Name: " + name + ", Age: " + age;
    }
}

























