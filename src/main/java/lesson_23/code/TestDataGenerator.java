import java.util.Locale;
import com.github.javafaker.Faker;

    public class TestDataGenerator {

        public static void main(String[] args) {
            Faker faker = new Faker(Locale.GERMAN);
            for (int i = 0; i < 20; i++) {
                System.out.println(faker.address().fullAddress());
                // String name = faker.name().fullName(); // Miss Samanta Schmidt
                //String firstName = faker.name().firstName(); // Emory
                //String lastName = faker.name().lastName(); // Barton
                //String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
            }
        }

        public static class RoomAssigner {

            public String assignRoom(String patientName, String condition) {
                if ("Critical".equals(condition)) {
                    return "ICU";
                } else if ("Infectious".equals(condition)) {
                    return "Isolation";
                } else {
                    return "General"; // Некритические состояния или отсутствие диагноза
                }
            }

        } // klass ended
    } // klass endeded

