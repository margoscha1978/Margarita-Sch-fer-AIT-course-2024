package ClassWork20.wrapper_classes_exampler;
import java.util.Arrays;
import java.util.List;

public class TaxiService {
    List<String> availableAddresses = Arrays.asList("Центр", "Север", "Юг");

    public boolean isTaxiAvailable(String address) {
        if (availableAddresses.contains(address)) {
            return true;
        } else {
            return false;
        }
    }

}
