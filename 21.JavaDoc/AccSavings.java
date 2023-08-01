//package javaDocDemo;

/** @author Kunal
 * @version 1.0.0
 * @since 15 July 2023
 *
 */
class AccSavings 
{   
    long accNo;
    String IFSCcode, accHolderName, accHolderAddress, accHolderPhone, DOB;
    public double balance;
    
    
    /** 
     * @return double
     */
    public double getBalance() {
        return balance;
    }
    
    public double fixedDeposit=0;

    /**@param depoAmt Amount to be deposited*/

    public double deposit(double depoAmt)
    {
        if(depoAmt>0)
        {
            balance=balance+depoAmt;
        
        }
        System.out.println("***Deposited amount: "+depoAmt+" ***");
        return balance;
    }
    
    /**@param widAmt Amount to be withdrawn
     * @return balance
     */
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
    /**@param fixAmt Amount to be fixed */
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
    /**@return Balance after liquidating fixed deposit */
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
    /**@param accNo Account number
     * @param IFSCcode IFSC code of the savings account bank
     */
    public AccSavings(long accNo,String IFSCcode)
    {
        System.out.println(getBalance());
    }
    /**
     * 
     * @param accNo
     * @param IFSCcode
     * @param accHolderName
     * @param accHolderAddress
     * @param accHolderPhone
     * @param DOB
     */
    public AccSavings(long accNo,String IFSCcode,String accHolderName,String accHolderAddress, String accHolderPhone, String DOB)
    {
        this.accNo=accNo;
        this.IFSCcode=IFSCcode;
        this.accHolderAddress=accHolderAddress;
        this.accHolderName=accHolderName;
        this.accHolderPhone=accHolderPhone;
        this.DOB=DOB;
    
    }
    
    
    /** 
     * @return double
     */
    public double getFixedDeposit() {
        return fixedDeposit;
    }
    /**
     * 
     * @param fixedDeposit
     */
    public void setFixedDeposit(double fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }
    /**@return Details of account */
    public String toString()
    {
        return ("Savings Acc no: "+accNo+"\nAcc Holder name: "+accHolderName/*  +"\nAcc Holder phone no: "+accHolderPhone+"\nAcc holder address: "+accHolderAddress+"\nAcc Holder DOB: "+DOB */+"\nAcc balance: "+balance+"\nFixed amount: "+ fixedDeposit);
    }

}
