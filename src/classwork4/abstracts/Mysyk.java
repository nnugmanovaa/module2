package classwork4.abstracts;

public class Mysyk extends Pet {

    public Mysyk(int age, String name){
        super(age, name);
    }
    @Override
    protected void voice() {
        System.out.println("Mweaaaaoh");
    }
}
