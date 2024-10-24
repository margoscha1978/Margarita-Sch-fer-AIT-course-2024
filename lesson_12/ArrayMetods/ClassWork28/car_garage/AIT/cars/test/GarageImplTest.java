package ClassWork28.car_garage.AIT.cars.test;

import ClassWork28.car_garage.AIT.cars.dao.Garage;
import ClassWork28.car_garage.AIT.cars.dao.GarageImpl;
import ClassWork28.car_garage.AIT.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        // TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCarTest() {

    }

    @Test
    void removeCarTest() {

    }

    @Test
    void findCarByRegNumberTest() {

    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {

    }

    @Test
    void findCarsByEngineTest() {

    }

    @Test
    void findCarsByColorTest() {

    }

    @Test
    void sizeTest(){
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest(){
        garage.printCars();
    }

}// klass ende