class Withdraw
{
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void cash(double widAmt)throws MinBalanceException
    {
        if(balance-widAmt<5000)
        {
            throw new MinBalanceException();
        }
        System.out.println("cash withdrawn: "+widAmt);
        balance=balance-widAmt;
    }
}
//writing own exception class for min. balance

class MinBalanceException extends Exception
{
    public String toString()
    {
        return "min balance must be 5000, try with smaller amount!";
    }
}

public class OwnExceptionClass {
    public static void main(String[] args)throws MinBalanceException{
        Withdraw amt=new Withdraw();
        
        amt.setBalance(10000);

        //try
        //{
            amt.cash(7000);
            System.out.println("remaining balance: "+amt.getBalance());
        //}
        //catch(MinBalanceException err)
        //{
        //    System.out.println(err);
        //}
    }
}
