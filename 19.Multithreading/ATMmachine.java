class ATM
{
   
    synchronized public void checkBalance(String name)
        {
            System.out.println(name+", Your current balance.");
            try{Thread.sleep(0);}catch(Exception err){}
        }

    synchronized public void withdraw(String name,int accNo)
        {
            System.out.println(name+", withdrawn amount from your Acc "+accNo);
            try{Thread.sleep(0);}catch(Exception err){}
        }
    
}


class Customer extends Thread
{   String name;
    int accNo;
    ATM atm;

    public Customer(ATM atm,String name,int accNo)
    {
        this.atm=atm;
        this.name=name;
        this.accNo=accNo;
    }

    public void useAtm()
    {
        atm.checkBalance(name);
        atm.withdraw(name,accNo);
    }
    public void run()
    {   
        useAtm();
        //System.out.println("");
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer cust1=new Customer(atm,"Kunal",3407064);
        //System.out.println("");
        Customer cust2=new Customer(atm,"Adam",9770507);
        //System.out.println("");
        Customer cust3=new Customer(atm,"Smith",6780507);
        //System.out.println("");
        Customer cust4=new Customer(atm,"Taylor",1235507);
        //System.out.println("");
        Customer cust5=new Customer(atm,"Angela",8720507);
        //System.out.println("");
        Customer cust6=new Customer(atm,"George",5670507);
        //System.out.println("");
        Customer cust7=new Customer(atm,"Charles",4660507);

        cust1.start();
        cust2.start();
        cust3.start();
        cust4.start();
        cust5.start();
        cust6.start();
        cust7.start();
        
    }
}
