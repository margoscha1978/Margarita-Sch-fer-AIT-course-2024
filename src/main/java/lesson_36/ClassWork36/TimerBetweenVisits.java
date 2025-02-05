package lesson_36.ClassWork36;

import java.time.Duration;
import java.time.LocalDateTime;
/*
Задача:
  У пациента было два визита к врачу в разное время.
  Нужно вычислить, сколько прошло времени (дней, часов, минут) между этими визитами.
 */
public class TimerBetweenVisits {
    public static void main(String[] args){
        LocalDateTime firstVisit = LocalDateTime.of(2025,1,15,9,15);
        LocalDateTime secondVisit = LocalDateTime.of(2025,2,5,12,15);

        Duration duration = Duration.between(firstVisit,secondVisit);
        System.out.println(" Days between Visit " + duration.toDays());
        System.out.println(" Hours between Visit " + duration.toHours());
    }

} // klass ended
