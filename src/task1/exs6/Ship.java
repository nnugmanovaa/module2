package task1.exs6;

public class Ship {
    private String Id;
    private String arrival_time;
    private int stay_time;
    private boolean is_distress;

    public boolean canEnterThePort(){
        if (is_distress) {
            return true;
        } else {
            String[] timeParts = arrival_time.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int totalMinutes = hours * 60 + minutes;

            return totalMinutes + stay_time <= 10 * 60;
        }
    }

    public Ship(String id, String arrival_time, int stay_time, boolean is_distress) {
        Id = id;
        this.arrival_time = arrival_time;
        this.stay_time = stay_time;
        this.is_distress = is_distress;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public int getStay_time() {
        return stay_time;
    }

    public void setStay_time(int stay_time) {
        this.stay_time = stay_time;
    }

    public boolean isIs_distress() {
        return is_distress;
    }

    public void setIs_distress(boolean is_distress) {
        this.is_distress = is_distress;
    }
}
