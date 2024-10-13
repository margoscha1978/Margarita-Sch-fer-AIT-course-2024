package homework22.address;

public class Address {
    private String city;
    private String postalCode;

    public Address(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Проверка, что город начинается с заглавной буквы.
    //Return true, если город написан правильно, иначе false
    public boolean isCityValid() {
        return city != null && !city.isEmpty() && Character.isUpperCase(city.charAt(0));
    }

    // Проверка, что индекс состоит из 5 цифр.
    //Return true, если индекс написан правильно, иначе false
    public boolean isPostalCodeValid() {
        return postalCode != null && postalCode.matches("\\d{5}");
    }
}
