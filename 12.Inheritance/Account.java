class BankAccount
{
    protected long accNo;
    double balance=0;
    protected String accHolderName, accHolderAddress,accHolderPhone,IFSCcode,DOB;
    private boolean isLoanAcc;
    public double getAccNo(){return accNo;}
    public double getBalance(){return balance;}
    public String getAccHolderName(){return accHolderName;}
    public String getAccHolderAddress(){return accHolderAddress;}
    public String getAccHolderPhone(){return accHolderPhone;}
    public String getIFSCcode(){return IFSCcode;}
    public String getDOB(){return DOB;}

    public void setAccHolderAddress(String address){accHolderAddress=address;}
    public void setAccHolderPhone(String phone){accHolderPhone=phone;}

    
    public String toString()
    {
        return ("Acc no: "+accNo+"\nAcc Holder name: "+accHolderName/* +"\nAcc Holder phone no: "+accHolderPhone+"\nAcc holder address: "+accHolderAddress+"\nAcc Holder DOB: "+DOB */+"\nAcc balance: "+balance);
    }
}

class SavingAcc extends BankAccount
{
    public double fixedDeposit=0;
    
    public double deposit(double depoAmt)
    {
        if(depoAmt>0)
        {
            balance=balance+depoAmt;
        
        }
        System.out.println("***Deposited amount: "+depoAmt+" ***");
        return balance;
    }

    public double withdraw(double widAmt)
    {
        if(balance>0 && balance>=widAmt)
        {
            if(widAmt>0)
            {
            balance=balance-widAmt;
            }
        System.out.println("***Withdrawn amount: "+widAmt+" ***");
        }
        else
        {
            System.out.println("***Insufficient balance to withdraw ***");
        }

        return balance;
    }
    
    public double fd(double fixAmt)
    {
        if(fixAmt<balance)
        {
            fixedDeposit=fixedDeposit+fixAmt;
            balance=balance-fixAmt;
        }
        System.out.println("***Fixed amount: "+fixAmt+" ***");
        return balance;
    }

    public double liquidate()
    {
        if(fixedDeposit>0)
        {
            balance=balance+fixedDeposit;
            System.out.println("***Liquidation amount of FD: "+fixedDeposit+" ***");
            fixedDeposit=0;
        }
        else
        {
            System.out.println("***No fixed amount to liquidate***");
        }
       return balance;
    }

    public SavingAcc(long accNo,String IFSCcode)
    {
        System.out.println(getBalance());
    }

    public SavingAcc(long accNo,String IFSCcode,String accHolderName,String accHolderAddress, String accHolderPhone, String DOB)
    {
        this.accNo=accNo;
        this.IFSCcode=IFSCcode;
        this.accHolderAddress=accHolderAddress;
        this.accHolderName=accHolderName;
        this.accHolderPhone=accHolderPhone;
        this.DOB=DOB;
    
    }

    public double getFixedDeposit() {
        return fixedDeposit;
    }

    public void setFixedDeposit(double fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }

    public String toString()
    {
        return ("Savings Acc no: "+accNo+"\nAcc Holder name: "+accHolderName/*  +"\nAcc Holder phone no: "+accHolderPhone+"\nAcc holder address: "+accHolderAddress+"\nAcc Holder DOB: "+DOB */+"\nAcc balance: "+balance+"\nFixed amount: "+ fixedDeposit);
    }
}

class LoanAcc extends BankAccount
{   private double loanAmt;
    private long LoanAccNo;

    public void sanctionLoan(double amount)
    {
        loanAmt=loanAmt+amount;
        System.out.println("***Loan amount sanctioned: "+amount+" ***");
    }

    public double payEMI(double emi)
    {   
        loanAmt=loanAmt-emi;
        System.out.println("***EMI payed: "+ emi+" ***");
        return loanAmt;
    }

    public double topUpLoan(double topUpAmt)
    {
        loanAmt=loanAmt+topUpAmt;
        System.out.println("***Loan top-up amount: "+topUpAmt+" ***");
        return loanAmt;
    }

    public double repayment(double repay)
    {
        if(repay==loanAmt)
        {
            loanAmt=0;
            System.out.println("!!! Loan repayed !!!");
        }
        else
        {
            System.out.println("***Pay full repayment: "+loanAmt+" ***");
        }
        
        return loanAmt;
    }

    public LoanAcc(long LoanAccNo,String IFSCcode,String accHolderName,String accHolderAddress, String accHolderPhone, String DOB)
    {
        this.LoanAccNo=LoanAccNo;
        this.IFSCcode=IFSCcode;
        this.accHolderAddress=accHolderAddress;
        this.accHolderName=accHolderName;
        this.accHolderPhone=accHolderPhone;
        this.DOB=DOB;
    
    }

    public String toString()
    {
        return ("Loan Acc no: "+LoanAccNo+"\nAcc Holder name: "+accHolderName/* +"\nAcc Holder phone no: "+accHolderPhone+"\nAcc holder address: "+accHolderAddress+"\nAcc Holder DOB: "+DOB */+"\nAmount to repay: "+loanAmt);
    }
    
    public double getLoanAmt(){return loanAmt;}
}

public class Account {
    public static void main(String[] args) {

        //Testing Savings Account: 

        SavingAcc acc1=new SavingAcc(402989292, "SBIO034", "Kunal", "BH1, PU, CHD", "98686979", "16-sep-2002");

        System.out.println("\n"+acc1+"\n");
        
        acc1.deposit(10000);
        System.out.println(acc1+"\n");

        acc1.withdraw(1000);
        System.out.println(acc1+"\n");

        acc1.withdraw(15000);
        System.out.println(acc1+"\n");

        //acc1.deposit(1500);
        //System.out.println(acc1+"\n");

        acc1.fd(1500);
        System.out.println(acc1+"\n");
        //
        acc1.fd(500);
        System.out.println(acc1+"\n");
        
        //
        acc1.liquidate();
        System.out.println(acc1+"\n");
        //System.out.println("Fixed amount: "+acc1.getFixedDeposit());

        acc1.liquidate();
        System.out.println(acc1+"\n");


        //Testing Loan Account:

        LoanAcc acc2=new LoanAcc(2002235233,"HDFC0082", "Anmol", "Ireland", "02470275012", "23-oct-1995");

        System.out.println("\n"+acc2+"\n");

        acc2.sanctionLoan(25000);
        System.out.println(acc2+"\n");

        acc2.payEMI(5000);
        System.out.println(acc2+"\n");

        acc2.topUpLoan(15000);
        System.out.println(acc2+"\n");

        acc2.repayment(35000);
        System.out.println(acc2+"\n");

    }

}
