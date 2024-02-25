package module2.task4.exs6;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return String.format("Cat[%s]", super.toString());
    }
}
