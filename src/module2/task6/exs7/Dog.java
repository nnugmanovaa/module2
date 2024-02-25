package module2.task6.exs7;

public class Dog implements Animal{
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another){
        System.out.println("Wooooooof!");
    }
}
