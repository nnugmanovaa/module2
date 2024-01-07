package task3.exs3;

public class Account {
    public int id;
    public Customer customer;
    public double balance;

    public Account deposit ( double amount){
        this.balance += amount;
        return this;  //Return the updated Account object after deposit
    }

    public Account withdraw (double amount){
        if (this.balance > amount){
            this.balance -= amount;
        } else {
            System.out.println("amount withdraw exceeds the current balamce!");
            return this;
        }
        return this;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }

    @Override
    public String toString() {
        return String.format("%s, balance %2f", customer.toString(), balance);
    }
}
