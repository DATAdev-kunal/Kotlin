class Customer
{
    protected String name,phoneNo,address;
    protected double billAmount;

    public double getBillAmount() {
        return billAmount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void purchase(double billAmount)  
    {
        this.billAmount=billAmount;
    }
}

class Member extends Customer
{   private String custId;
    private double currAmt,prevAmt;

    
    public double getCurrAmt() {
        return currAmt;
    }
    public void setCurrAmt(double currAmt) {
        this.currAmt = currAmt;
    }
    public String getCustId() {
        return custId;
    } 
    public double getPrevAmt() {
        return prevAmt;
    }
    public void setPrevAmt(double prevAmt) {
        this.prevAmt = prevAmt;
    }
    public Member(String custId,String name,String phoneNo,double currAmt,double prevAmt) 
    {
        this.custId = custId;
        this.name=name;
        this.phoneNo=phoneNo;
        this.currAmt=currAmt;
        this.prevAmt=prevAmt;
    }
    public void purchase(double bill)
    {   
        double temp=currAmt;
        currAmt=bill;
        prevAmt=temp;
    }

    public String toString() 
    {
        return ("custId= " + custId +"\nname="+name+"\nphone no= "+phoneNo +"\ncurrent Bill=" + currAmt + "\nprevious Bill= " + prevAmt);
    }
    
    
    
}

public class shopVisitor {
    public static void main(String[] args) {
        Member m1;

        m1=new Member("MIG45252","Kunal","2525163529",4542.29,2389.35);

        System.out.println("\n"+m1+"\n");

        m1.purchase(1000);
        System.out.println(m1+"\n");



    }
}
