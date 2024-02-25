package project2.entities.items;

import project2.utils.BorrowableItem;
import project2.enums.ItemType;
import project2.utils.PaperItem;

import java.io.Serializable;

public class Magazine extends LibraryItem implements BorrowableItem, PaperItem, Serializable {
    private long issueNumber;
    private String issuer;

    public Magazine(){};



    public Magazine(int id, String name, boolean isAvailable, long issueNumber, String issuer) {
        super(id, name, isAvailable, ItemType.MAGAZINE);
        this.issueNumber = issueNumber;
        this.issuer = issuer;
    }


    public String deserialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId())
                .append(";")
                .append(getName())
                .append(";")
                .append(isAvailable())
                .append(";")
                .append(getItemType())
                .append(";")
                .append(getIssueNumber())
                .append(";")
                .append(getIssuer())
                .append(";");
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "issueNumber=" + issueNumber +
                ", issuer='" + issuer + '\'' +"\n";
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
