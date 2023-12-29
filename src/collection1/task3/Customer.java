package collection1.task3;

public class Customer {

    private String firrstName;
    private String secondName;
    private String email;

    public Customer(){
        this.firrstName = null;
        this.secondName = null;
        this.email = null;
    }

    public Customer(String firrstName, String secondName, String email) {
        this.firrstName = firrstName;
        this.secondName = secondName;
        this.email = email;
    }

    public String getFirrstName() {
        return firrstName;
    }

    public void setFirrstName(String firrstName) {
        this.firrstName = firrstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firrstName='" + firrstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
