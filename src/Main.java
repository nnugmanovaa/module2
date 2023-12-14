public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aruzhan","Abdrakhmanova", 22,"girl", new String[]{"walking", "cooking"});
        Person person2=  new Person();
        person2.firstname = "Nargiza";
        person2.lastname="Nugmanova";
        person2.age = 21;
        person2.sex = "girl";
        person2.interests = new String[]{"swimming", "walking"};
        System.out.println(person2.firstname);
        System.out.println(person2.lastname);
        System.out.println(person2.age);
        System.out.println(person2.sex);
        person2.printInresets(person2.interests);
        person1.printClass();
    }
}