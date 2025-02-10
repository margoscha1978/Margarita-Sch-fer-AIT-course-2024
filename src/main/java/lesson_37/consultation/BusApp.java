package lesson_37.consultation;
/*
 Проверка времени работы автобусов:
 - Напишите программу, которая:
	1.	Определяет, работает ли автобус в текущее время.
	2.	Если автобус работает, программа сообщает об этом.
	3.	Если автобус не работает, программа сообщает, что автобусы не ходят.
 - Условие:
	•	Автобус работает с 06:00 до 23:00 включительно.
 */
import java.time.LocalTime;

public class BusApp {

    private LocalTime startTime = LocalTime.of(6,0);
    private LocalTime endTime = LocalTime.of(23,0);

    public boolean isBusAvailable(LocalTime time){
        if(time.isAfter(startTime) && time.isBefore(endTime)){
            System.out.println("Bus is available at " + time);
            return true;
        }
        else {
            System.out.println("Bus is not available at " + time);
            return false;
        }
    }

} // klass ended
