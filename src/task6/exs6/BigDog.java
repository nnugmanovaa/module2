package task6.exs6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woowwww!");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooowwwww!");
    }
}
