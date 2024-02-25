package module2.task6.exs6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Woof");
    }
    public void greeting(Dog another){
        System.out.println("Wooooof");
    }
}
