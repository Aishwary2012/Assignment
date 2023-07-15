package Q3;

public class SavingAccount extends Account {
    private int interest ;
    private double maximumWithdrawAmountLimit;

    public SavingAccount(String accountHolderName,int accountNumber,double accountBalance,int interest,double minAmtBalance){
        super(accountHolderName,accountNumber,accountBalance,minAmtBalance);
        this.interest = interest;
        this.maximumWithdrawAmountLimit = super.getAccountBalance()-super.getMinAmtBalance();

    }

    public double getBalance(){
        return super.getAccountBalance()*(100+this.interest)/100;
    }

    @Override
    public void withdraw(double withdrawAmt){


        if(this.maximumWithdrawAmountLimit >= withdrawAmt){
            super.setAccountBalance(super.getAccountBalance()-withdrawAmt);
        }
        else {
            System.out.println("WithDraw Amt is greater then accountBalance");
        }
    }

    @Override
    public String toString(){
        return super.toString()+"interest: "+interest+" maximumWithdrawAmountLimit: "+maximumWithdrawAmountLimit;
    }


}
