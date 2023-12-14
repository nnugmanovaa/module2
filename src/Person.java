public class Person {

    public String firstname;
    public String lastname;
    public int age;
    public String sex;
    public String [] interests = new String[]{};

    public static void printInresets( String [] a){
        for( int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public void printClass(){
        System.out.println(this.firstname);
        System.out.println(this.lastname);
        System.out.println(this.age);
        System.out.println(this.sex);

        for( int i=0; i<this.interests.length;i++){
            System.out.println(interests[i]);
        }
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
