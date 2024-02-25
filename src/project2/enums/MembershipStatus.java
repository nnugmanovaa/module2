package project2.enums;

public enum MembershipStatus {
    SILVER(5),
    GOLD(15),

    PLATINUM(35);

    private int borrowLimit;

    MembershipStatus(int i) {
        this.borrowLimit = i;
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(int borrowLimit) {
        this.borrowLimit = borrowLimit;
    }
}
