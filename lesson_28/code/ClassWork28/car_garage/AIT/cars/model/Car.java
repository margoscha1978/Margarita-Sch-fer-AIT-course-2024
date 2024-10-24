package ClassWork28.car_garage.AIT.cars.model;
//**Смысл приложения:**
//имеется компания, которая содержит "большой" гараж и привлекает другие компании ставить машины в ее гараж.
//Флотом автомобилей, который использует гараж, необходимо управлять:
//- знать сколько машин стоит в гараже
//- добавлять машины в гараж
//- удалять машины из гаража
//- проверять, есть ли машина с таким-то госномером в гараже
//- сколько машин определенного бренда стоит в гараже?
//- сколько машин от какой-то компании стоит в гараже
//- сколько машин определенного цвета стоит в гараже
//- сколько машин с мощностью двигателя "от ... и до ..." kWt имеется в гараже

import java.util.Objects;

public class Car {
    //
  private String regNumber;//есть буквы по этому String
  private String model;
  private String company;
  private double engine;
  private String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumber);
    }

}// ende klass
