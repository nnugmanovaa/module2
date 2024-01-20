package classwork4.abstracts;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Mysyk(1, "Kazy");

        Mysyk mysysk = (Mysyk) pet;

        System.out.println(pet);
        System.out.println(mysysk);
    }
}
