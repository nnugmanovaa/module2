package classwor3;

public class Particle {

    private String name;
    public Particle(){
        name = "door";
    }


    public Particle ( String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
