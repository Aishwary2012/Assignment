package Q3;

public class CurrentAccount extends Account{
    private String tradeLIcenseNumber;
    private double overdraft;

    public CurrentAccount(String accountHolderName,int accountNumber,double accountBalance,double minAmtBalance,String tradeLIcenseNumber,double overdraft){
        super(accountHolderName,accountNumber,accountBalance,minAmtBalance);
        this.tradeLIcenseNumber = tradeLIcenseNumber;
        this.overdraft = overdraft;
    }

    public double getBalance(){
        return super.getAccountBalance();
    }

    @Override
    public void withdraw(double withdrawAmt){

        if(overdraft+getAccountBalance() <= withdrawAmt){
            setAccountBalance(getAccountBalance()-withdrawAmt);
            System.out.println("withdrawAmt "+ withdrawAmt+" is withdrawn");
        }else
            System.out.println("You can not withdraw, dont have sufficient balance and overdraft limit  ...");
    }

    @Override
    public String toString() {
        return super.toString()+
                "CurrentAccount [tradeLicenseNumber=" + tradeLIcenseNumber + ", "
                + "overdraft=" + overdraft + "]";
    }



}
