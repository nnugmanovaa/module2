package module2.task4.exs6;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Mysyk");
        Animal dog = new Dog("Aktos"); // тут я не смогу вызвать методы  которые реализованы у класса Дог
        // если мы хотим пользовать данными методами, то мы должны пользоваться изначально ссылочный тип данных от Cat/Dog
        Mammal dog2 = new Dog("Akstos");

        Animal cat3 = cat;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(cat3);

        Dog dog3 = new Dog("Sobaka");
        Dog dog4 = new Dog("Sobaka");
        dog3.greets();
        dog3.greets(dog4);  // елси у меня метод прописан конректно, что он принимает обьект клаасса Dog, то мы должны
        // ее предостаивтть, а не создавать обект от класса Animal or Mammal


        // если мы перкратим оверрадитть toString в классе cat/dog то ттогда он будет браться от класса анследника
    }
}
