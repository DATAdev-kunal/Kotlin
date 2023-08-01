class CellPhone
{
    String phoneNo, IMEI;

    public String getPhoneNo() {return phoneNo;}
    public String getIMEI() {return IMEI;}
    public void setPhoneNo(String phoneNo) {this.phoneNo = phoneNo;}
    public void setIMEI(String iMEI) {IMEI = iMEI;}

    public CellPhone()
    {
        System.out.println("called on cell phone");
    }
    
    public CellPhone(String phoneNo, String iMEI) 
    {
        this.phoneNo = phoneNo;
        IMEI = iMEI;
    }

    public void call(String phoneNo)
    {
        System.out.println("Cell phone called on: "+phoneNo);
    }

    public void contact(String contactNo)
    {
        
    }
}
class SmartPhone extends Phone
{   
    String macAddress, ipAddress;

    public String getMacAddress() {return macAddress;}
    public String getIpAddress() {return ipAddress;}

    public SmartPhone(String macAddress, String ipAddress) 
    {
        this.macAddress = macAddress;
        this.ipAddress = ipAddress;
    }

    public SmartPhone()
    {
        System.out.println("called on smart phone");
    }

    public String toString() 
    {
        return "SmartPhone [macAddress=" + macAddress + ", ipAddress=" + ipAddress + "]";
    }
}

public class Phone {
    public static void main(String[] args) {

        /* SmartPhone smartCall= new SmartPhone();
        System.out.println(smartCall);

        CellPhone cellCall=new CellPhone();
        System.out.println(cellCall); */
        
        CellPhone c1=new CellPhone("8604329827", "2947IMie");

        System.out.println("imei no of cell phone: "+c1.getIMEI());

        System.out.println("Phone no of cell phone: "+ c1.getPhoneNo());


        SmartPhone sp1=new SmartPhone("XAC:223:23::2F4:245", "255:255:255:255");

        System.out.println("MAC address of smartphone: "+sp1.getMacAddress());
        System.out.println("IP address of smartphone: "+sp1.getIpAddress());

    }
}
