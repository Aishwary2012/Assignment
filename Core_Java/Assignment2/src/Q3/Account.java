package Q3;

abstract public class Account {
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance,minAmtBalance;

    public Account(String accountHolderName,int accountNumber,double accountBalance,double minAmtBalance){
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.minAmtBalance = minAmtBalance;
    }

    public double getMinAmtBalance(){
        return this.minAmtBalance;
    }

    public void setAccountBalance(double newAccountBalance){
        this.accountBalance = newAccountBalance;
    }

    public void deposit(double depositedAmt){
        this.setAccountBalance(this.accountBalance+depositedAmt);
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    abstract public void withdraw(double withdrawAmt);

    @Override
    public String toString(){
        return "accountHolderName: "+accountHolderName+" accountNumber: "+accountNumber+" accountBalance: "+accountBalance+" minAmtBalance: "+minAmtBalance;
    }

}
