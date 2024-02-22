package project2;

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
