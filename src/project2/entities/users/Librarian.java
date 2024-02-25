package project2.entities.users;

import project2.enums.Role;

import java.io.Serializable;
import java.util.Base64;

public class Librarian extends User implements Serializable{

    private int workExperience;

    public void diactivateUser(LibraryMember libraryMember){
        libraryMember.setAvtive(false);
    }

    public void activateUser(LibraryMember libraryMember){
        libraryMember.setAvtive(true);
    }

    @Override
    public void getInformationAboutProfile(){
        System.out.printf("Name: %s, Login: %s, Work experience %d \n",
                this.getFirstName(), this.getLogin(), this.workExperience);
    }

//    public List<User> getAllLibraryUsers(List<User> users){
//
//    }
    public Librarian(){}

    public Librarian(int id, String login, String password, String firstName, String lastName, int workExperience) {
        super(id, login, password, firstName, lastName, Role.LIBRARIAN);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String deserialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(getRole())
                .append(";")
                .append(getId())
                .append(";")
                .append(getLogin())
                .append(";")
                .append(getPassword())
                .append(";")
                .append(getFirstName())
                .append(";")
                .append(getLastName())
                .append(";")
                .append(getWorkExperience())
                .append(";");
        return sb.toString();
    }
}
