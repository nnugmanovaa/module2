package module2.task4.exs6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal [name = %s", name);
    }
}
