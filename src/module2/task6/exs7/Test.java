package module2.task6.exs7;

public class Test {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        System.out.println(animal1);
        animal1.greeting();
        Animal animal2 = new Dog();
        System.out.println(animal2);
        animal2.greeting();
        Animal animal3 = new BigDog();
        System.out.println(animal3);
        animal3.greeting();
       // Animal animal4 = new Animal(); - you cat not create objects from interfaces

        // Downcast
        Dog dog2 = (Dog)animal2;
        System.out.println(dog2);
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        System.out.println(dog3);
        //Cat cat2 = (Cat)animal2; // не полуичттся так как мы пытаемся преобразовать собаку в кошку
        dog2.greeting(dog3);
        System.out.println("<---------------------->");
        dog3.greeting(dog2);
        System.out.println("<---------------------->");
        //dog2.greeting(bigDogi2); // мы не создавали bigDogi2
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
