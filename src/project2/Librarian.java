package project2;

import java.io.Serializable;

public class Librarian extends User implements Serializable{

    private int workExperience;

    public void diactivateUser(LibraryMember libraryMember){
        libraryMember.setAvtive(false);
    }

    public void activateUser(LibraryMember libraryMember){
        libraryMember.setAvtive(true);
    }
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
