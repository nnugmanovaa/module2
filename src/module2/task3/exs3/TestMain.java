package module2.task3.exs3;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Nargiza", 'm');
        System.out.println(customer);
        System.out.println(customer.getGender());
        Account account = new Account(11111, customer);
        System.out.println(account);
        account.getCustomerName();
        account.setBalance(123.2);
        System.out.println(account);
        account.deposit(100);
        account.withdraw(100000000);
        account.withdraw(101);
        System.out.println(account);
    }

}
