package collection1.task3;

public class Author {
    private Customer customer;
    private String accountDetails;
    private Long balance;

    public Author(){
        this.customer = null;
        this.accountDetails = null;
        this.balance = null;
    }
    public Author(Customer customer, String accountDetails, Long balance) {
        this.customer = customer;
        this.accountDetails = accountDetails;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Author{" +
                "customer=" + customer +
                ", accountDetails='" + accountDetails + '\'' +
                ", balance=" + balance +
                '}';
    }
}
