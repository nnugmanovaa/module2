package module2.task1.exs1;

public class Plane {
    private String Id;
    private String Arriva_time;
    private String Leave_time;

    public Plane(String Id, String arrivalTime, String leaveTime) {
        this.Id = Id;
        this.Arriva_time = arrivalTime;
        this.Leave_time = leaveTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getArriva_time() {
        return Arriva_time;
    }

    public void setArriva_time(String arriva_time) {
        this.Arriva_time = arriva_time;
    }

    public String getLeave_time() {
        return Leave_time;
    }

    public void setLeave_time(String leave_time) {
        this.Leave_time = leave_time;
    }

    public int calculateFlightTime() {
        int arrivalHour = Integer.parseInt(Arriva_time.split(":")[0]);
        int arrivalMinute = Integer.parseInt(Arriva_time.split(":")[1]);
        int leaveHour = Integer.parseInt(Leave_time.split(":")[0]);
        int leaveMinute = Integer.parseInt(Leave_time.split(":")[1]);

        int arrivalInMinutes = arrivalHour * 60 + arrivalMinute;
        int leaveInMinutes = leaveHour * 60 + leaveMinute;

        return leaveInMinutes - arrivalInMinutes;
    }
}
