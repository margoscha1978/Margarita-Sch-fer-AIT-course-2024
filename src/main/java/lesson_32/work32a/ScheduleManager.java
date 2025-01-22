package lesson_32.work32a;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScheduleManager {
    private LocalDate dateSchedule;
    private List<ClassSchedule> schedules; // Используем List вместо ArrayList
    public ScheduleManager(LocalDate dateSchedule) {
        this.dateSchedule = dateSchedule;
        this.schedules = new ArrayList<>();
    }
    public List<ClassSchedule> getSchedules() {
        return new ArrayList<>(schedules); // Возврат копии для защиты внутреннего состояния
    }
    public LocalDate getDateSchedule() {
        return dateSchedule;
    }
    public boolean isTrainerAvailable(String trainerName, String time) {
        for (ClassSchedule schedule : schedules) {
            if (schedule.getTrainerName().equals(trainerName) && schedule.getTime().equals(time)) {
                return false;
            }
        }
        return true;
    }
    public boolean isRoomAvailable(String time, String room) {
        for (ClassSchedule schedule : schedules) {
            if (schedule.getTime().equals(time) && schedule.getRoom().equals(room)) {
                return false;
            }
        }
        return true;
    }
    public void addClassSchedule(ClassSchedule schedule) {
        if (schedule == null) {
            System.out.println("Schedule is null");
            return;
        }
        if (schedule.getId() == null || schedule.getClassType() == null ||
                schedule.getTrainerName() == null || schedule.getTime() == null ||
                schedule.getRoom() == null) {
            System.out.println("Schedule is invalid");
            return;
        }
        if (isTrainerAvailable(schedule.getTrainerName(), schedule.getTime()) &&
                isRoomAvailable(schedule.getTime(), schedule.getRoom())) {
            schedules.add(schedule);
            System.out.println("Schedule ID " + schedule.getId() + " added for " + dateSchedule);
        } else {
            System.out.println("Schedule ID " + schedule.getId() + " not added for " + dateSchedule);
        }
    }
    public void removeClassSchedule(String scheduleId) {
        if (scheduleId == null || scheduleId.isEmpty()) {
            System.out.println("Schedule ID is null or empty");
            return;
        }
        boolean found = false;
        for (ClassSchedule schedule : new ArrayList<>(schedules)) { // Используем копию списка
            if (schedule.getId().equals(scheduleId)) {
                schedules.remove(schedule);
                System.out.println("Schedule ID " + scheduleId + " removed");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Schedule ID " + scheduleId + " not found and not deleted");
        }
    }
    public void showSchedules() {
        for (ClassSchedule schedule : schedules) {
            System.out.println("Date: " + dateSchedule + ", " + schedule);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleManager that = (ScheduleManager) o;
        return Objects.equals(dateSchedule, that.dateSchedule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dateSchedule);
    }
    public void generateScheduleReportByTrainerName(String trainerName) {
        if (trainerName == null || trainerName.isEmpty()) {
            System.out.println("Trainer name is null or empty");

        }
        System.out.println("Schedule report for trainer: " + trainerName);
        for (ClassSchedule schedule : schedules) {
            if (schedule.getTrainerName().equals(trainerName)) {
                System.out.println(schedule);
            }
        }
    }
} // klass ended
