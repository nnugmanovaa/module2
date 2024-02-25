package project2.entities.users;

import project2.utils.BorrowableItem;
import project2.enums.MembershipStatus;
import project2.enums.Role;
import project2.entities.items.Book;
import project2.entities.items.Dvd;
import project2.entities.items.Magazine;

import java.io.Serializable;
import java.util.*;

public class LibraryMember extends User implements Serializable {
    private List<BorrowableItem> borrowableItems;
    private boolean isActive = false;

    private MembershipStatus membershipStatus;

    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public void activate(){
        this.isActive = true;
    }
    public void diactivate(){
        this.isActive = false;
    }

    public LibraryMember(){}
    public LibraryMember(int id, String login, String password, String firstName, String lastName, List<BorrowableItem> borrowableItems) {
        super(id, login, password, firstName, lastName, Role.MEMBER);
        this.borrowableItems = borrowableItems;
        this.isActive = true;
    }

    private void upgradeMembershipStatus(){
    }

    @Override
    public String toString() {
        return "LibraryMember{" +
                super.toString() +
                ", isActive=" + isActive +
                ", membershipStatus=" + membershipStatus +
                '}';
    }

    @Override
    public void getInformationAboutProfile(){
        System.out.printf("Name: %s, Login: %s, Activity status: %s, " +
                "Memebership status: %s, Borrowble Items: %s \n", this.getFirstName(), this.getLogin(),
                this.isActive, this.membershipStatus, borrowableItems.toString());
    }

    public List<BorrowableItem> getBorrowableItems() {
        return borrowableItems;
    }

    public void setBorrowableItems(List<BorrowableItem> borrowableItems) {
        this.borrowableItems = borrowableItems;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setAvtive(boolean avtive) {
        isActive = avtive;
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
                .append(isActive)
                .append(";")
                .append(getMembershipStatus())
                .append(";")
                .append(getBorrowedItemsIds());
        return sb.toString();
    }

    private String getBorrowedItemsIds() {
        if (Objects.nonNull(borrowableItems)  && !borrowableItems.isEmpty())  {
            StringBuilder sb = new StringBuilder();
            for (BorrowableItem borrowableItem : borrowableItems) {
                if (borrowableItem instanceof Book b) {
                    sb.append(b.getId())
                            .append("@");
                } else if (borrowableItem instanceof Dvd d) {
                    sb.append(d.getId())
                            .append("@");
                } else if (borrowableItem instanceof Magazine m){
                    sb.append(m.getId())
                            .append("@");
                }
            }
            return sb.toString();
        }
        return null;
    }
}
