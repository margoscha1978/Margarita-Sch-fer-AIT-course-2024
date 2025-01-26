package lesson_32.homeworrk32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    @Test
    public void testApartmentPrice() {
        Apartment apartment = new Apartment("Test Address", 1, 50, true);
        assertEquals(52500, apartment.calculatePrice());
    }

    @Test
    public void testHousePrice() {
        House house = new House("Test Address", 100, 300, true);
        assertEquals(145000, house.calculatePrice());
    }

    @Test
    public void testCommercialPropertyPrice() {
        CommercialProperty commercial = new CommercialProperty("Test Address", 150, "склад");
        assertEquals(120000, commercial.calculatePrice());
    }

    @ParameterizedTest // разные параметры для различных объектов недвижимости
    @CsvSource({
            "100, true, 200, 200, false, 300, 30, 635000.0",
            "50, false, 100, 100, false, 150, 20, 320000.0",
            "150, true, 150, 150, true, 200, 10, 522500.0",
            "200, false, 100, 100, true, 150, 20, 475000.0",
            "250, true, 100, 100, false, 150, 20, 532500.0"
    })
    void testCalculateTotalPrice(double apartmentArea, boolean hasElevator,
                                 double houseArea, double landArea, boolean hasGarage,
                                 double officeArea, double warehouseArea,
                                 double expectedCost) {
        // Arrange
        RealEstateAgency realEstateAgency = new RealEstateAgency();
        Property apartment = new Apartment("Main street", 4, apartmentArea, hasElevator);
        Property house = new House("House Street", houseArea, landArea, hasGarage);
        Property office = new CommercialProperty("Office Street", officeArea, "Office");
        Property warehouse = new CommercialProperty("Warehouse Street", warehouseArea, "Warehouse");
        realEstateAgency.addProperty(apartment);
        realEstateAgency.addProperty(house);
        realEstateAgency.addProperty(office);
        realEstateAgency.addProperty(warehouse);

        // Act
        double totalPrice = realEstateAgency.calculateTotalPrice();

        // Assert
        assertEquals(expectedCost, totalPrice, 0.01);
    }

} // test ended