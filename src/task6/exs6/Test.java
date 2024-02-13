package task6.exs6;

public class Test {
    public static void main(String[] args) {
        // Using the subclasses
        //Cat cat1 = new Cat(); - ошибка так как у нас нет путсого конструктора для создания обьекта класса Кошки
        Cat cat1 = new Cat("Mysyk");
        cat1.greeting();
        Dog dog1 = new Dog("Aktos");
        dog1.greeting();
        BigDog bigDog1 = new BigDog("BigAktos");
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat("Mysyk2");
        animal1.greeting();
        Animal animal2 = new Dog("Aktos2");
        animal2.greeting();
        Animal animal3 = new BigDog("BigAktos2");
        animal3.greeting();
        //Animal animal4 = new Animal(); - у абстрактного клсса не может быть обьектов
        System.out.println("<------------------------------->\n");
        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2; мы не можем сдлетаь тайпкастинг  обьект класса собаки в кошку
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2); // тут я не поняла почему он вызвал тот метод
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
