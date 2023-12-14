package classwork1;

public class Wallet {
    private double balance;

    public double deposit(double amount){
        return balance+=amount;
    }

    public boolean widthdrow ( double amount){
        if( balance< amount){
            return false;
        }
        else {
            balance-= amount;
            return true;
        }
    }

    public boolean transferTo(Wallet targetWallet, double amount){
        if ( amount <= 0){
            System.out.println("Сумма для вашего переворда должна быть положительной");
            return false;
        }
        if (balance>=amount){
            balance-=amount;
            targetWallet.deposit(amount);
            return true;
        }
        else{
            System.out.println("У вас недосточно средств для списание ваших денег");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
