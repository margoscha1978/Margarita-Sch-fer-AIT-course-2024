package lesson_12.ArrayMetods.ClassWork20.wrapper_classes_exampler;

import static org.junit.jupiter.api.Assertions.*;

import ClassWork20.wrapper_classes_exampler.TaxiQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiQueueTest {

    @Test
    void testAddPassengerShouldAddPassenger() {
        //Arrange
        TaxiQueue queue = new TaxiQueue();
        String passenger = "Anna";

        //Act
        int startResult = queue.getQueueSize();
        queue.addPassenger(passenger);
        int result = queue.getQueueSize();

        //Assert
        assertEquals(0, startResult);
        assertEquals(1, result);
    }

    @Test
    void testAddPassengerShouldNotAddPassengerWhenPassengerIsNull() {
        //Arrange
        TaxiQueue queue = new TaxiQueue();
        String passenger = null;

        //Act
        int startResult = queue.getQueueSize();
        queue.addPassenger(passenger);
        int result = queue.getQueueSize();

        //Assert
        assertEquals(0, startResult);
        assertEquals(0, result);

    }

}