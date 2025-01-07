import java.time.LocalDate;

public class Citizen extends Human {

    String passportId;
    String taxesId;
    LocalDate birthDay;
    boolean criminalStatus;

    public Citizen ( boolean gender,double height,double weight,String race,String country,String eyeColor,String passportId,String taxesId,LocalDate birthDay,boolean criminalStatus) {
        super(gender, height, weight, race, country, eyeColor);
        this.passportId = passportId;
        this.taxesId = taxesId;
        this.birthDay = birthDay;
        this.criminalStatus = criminalStatus;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "passportId='" + passportId + '\'' +
                ", taxesId='" + taxesId + '\'' +
                ", birthDay=" + birthDay +
                ", criminalStatus=" + criminalStatus +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';

        }

    }