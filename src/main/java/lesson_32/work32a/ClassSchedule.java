package lesson_32.work32a;

public class ClassSchedule {
    private String id;
    private String classType;
    private String trainerName;
    private String time;
    private String room;
    public ClassSchedule(String id, String classType, String trainerName, String time, String room) {
        this.id = id;
        this.classType = classType;
        setTrainerName(trainerName);
        setTime(time);
        setRoom(room);
    }
    public String getId() {
        return id;
    }
    public String getClassType() {
        return classType;
    }
    public String getTrainerName() {
        return trainerName;
    }
    public void setTrainerName(String trainerName) {
        if (trainerName != null && !trainerName.trim().isEmpty()) {
            this.trainerName = trainerName;
        } else {
            System.out.println("Trainer name cannot be null or empty");
        }
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        if (time != null && !time.trim().isEmpty()) {
            this.time = time;
        } else {
            System.out.println("Time cannot be null or empty");
        }
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        if (room != null && !room.trim().isEmpty()) {
            this.room = room;
        } else {
            System.out.println("Room cannot be null or empty");
        }
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Class Type: " + classType +
                ", Trainer Name: " + trainerName +
                ", Time: " + time +
                ", Room: " + room;
    }
} // klass ended
