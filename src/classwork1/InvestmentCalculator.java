package classwork1;

public class InvestmentCalculator {

    private static int initialAmount;
    private static int annualInterestRate;

    static Wallet wallet;

    public InvestmentCalculator(){}
    public InvestmentCalculator( int initialAmount, int annualInterestRate, Wallet wallet){
        this.initialAmount=initialAmount;
        this.annualInterestRate = annualInterestRate;
        this.wallet = wallet;
    }

    static double calculateEarnings(int years){
        wallet.setBalance(wallet.getBalance()+ initialAmount * Math.pow((1 + annualInterestRate/100.0), ( years * 1)));
        return wallet.getBalance();
    }

    public int getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(int initialAmount) {
        this.initialAmount = initialAmount;
    }

    public int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
