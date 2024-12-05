package ClassWork20.wrapper_classes_exampler;
/*
Задание:
	•	Создайте класс TaxiQueue с методами:
	•	void addPassenger(String passengerName): добавляет имя пассажира в очередь.
	•	int getQueueSize(): возвращает количество пассажиров в очереди.
 */

import java.util.ArrayList;

public class TaxiQueue {

    ArrayList<String> passengers = new ArrayList<>();

    public void addPassenger(String passengerName) {
        if (passengerName == null) {
            System.out.println("Passenger name is null");
        } else {
            passengers.add(passengerName);
            System.out.println("Added passenger " + passengerName);
        }
    }

    public int getQueueSize() {
        return passengers.size();
    }

}
