package lesson0.task1;

import java.util.Arrays;

public class Person {

    public String firstname;
    public String lastname;
    public int age;
    public String sex;
    public String [] interests = new String[]{};

    public void printInresets(){
//        for( int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        System.out.println(Arrays.toString(interests));
    }

    public void printClass(){
        System.out.printf("Firstname: %s, Lastname: %s, Age: %d, Sex: %s, Array: %s%n", this.firstname, this.lastname, this.age, this.sex, Arrays.toString(this.interests));
//        System.out.println(this.firstname);
//        System.out.println(this.lastname);
//        System.out.println(this.age);
//        System.out.println(this.sex);
//
//        for( int i=0; i<this.interests.length;i++){
//            System.out.println(interests[i]);
//        }
    }


    public Person(){}

    public Person (String firstname, String lastname, int age, String sex, String [] interests){
        this.firstname = firstname;
        this.lastname=lastname;
        this.age = age;
        this.sex=sex;
        this.interests=interests;
    }


}
