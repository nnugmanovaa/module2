package module2.task2.exs4;

public class Apartment {
    private String title;
    private int smet;
    private String type;

    public Apartment(String title, int smet, String type) {
        this.title = title;
        this.smet = smet;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSmet() {
        return smet;
    }

    public void setSmet(int smet) {
        this.smet = smet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int calculatePrice(int smetPrice){
        int price = smetPrice * smet;
        if(type.equalsIgnoreCase("Cyberbricks")){
            return (int) (price*1.5);
        } else if(type.equalsIgnoreCase("Carbonpanel")) {
            return (int) (price * 0.8);
        }
        return price;
    }
}
