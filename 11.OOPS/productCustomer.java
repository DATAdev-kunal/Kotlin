class Product
{
    private String itemNo,itemName;
    private int qty;
    private double price;

    public String getItemNo(){return itemNo;} 
    public String getItemName(){return itemName;}
    public int getQty(){return qty;}
    public double getPrice(){return price;}
    public void setQty(int n){if(n>0) qty=n;}
    public void setPrice(double p){if(p>0) price=p;}

    public Product(String itemNo)
    {
        this.itemNo=itemNo;
    }

    public Product(String itemNo,String itemName)
    {
        this.itemNo=itemNo;
        this.itemName=itemName;
    }

    public Product(String itemNo,String itemName, double price,int qty)
    {
        this.itemNo=itemNo;
        this.itemName=itemName;
        this.price=price;
        this.qty=qty;
    }
    
    public String toString()
    {   
        return ("model no: "+itemNo+"\ncar name: "+itemName+"\nprice: "+Double.toString(price)+"\nQuantity: "+Double.toString(qty));
    }
}

class Customer 
{
    private String custId,custName,address,phoneNo;
    private String cars;

    public String getCustId(){return custId;}
    public String getCustName(){return custName;}
    public String getAddress(){return address;}
    public String getPhoneNo(){return phoneNo;}
    public String getCars(){return cars;}
    public void setAddress(String address){if(address!="") this.address=address;}
    public void setPhoneNo(String phoneNo){if (phoneNo!="") this.phoneNo=phoneNo;}
    public void setCars(String cars)
    {
        this.cars=cars;
    }
    public Customer(String custId)
    {
        this.custId=custId;
    }
    public Customer(String custId, String custName)
    {
        this.custId=custId;
        this.custName=custName;
    }
    public Customer(String custId, String custName, String address)
    {
        this.custId=custId;
        this.custName=custName;
        this.address=address;
    }
    public Customer(String custId, String custName, String address,String phoneNo)
    {
        this.custId=custId;
        this.custName=custName;
        this.address=address;
        this.phoneNo=phoneNo;
    }
    public Customer(String custId, String custName, String address,String phoneNo, String cars)
    {
        this.custId=custId;
        this.custName=custName;
        this.address=address;
        this.phoneNo=phoneNo;
        this.cars=cars;
    }
    public String toString()
    {
        return ("customer Id: "+custId+"\ncustName: "+custName+"\naddress: "+address+"\nphone no: "+phoneNo+"\ncars: "+cars);
    }
    
}
public class productCustomer {
    public static void main(String[] args) {
        System.out.println("Product 1");
        Product p1= new Product("AX001");
        
        System.out.println("item no: "+p1.getItemNo());
        System.out.println("qty before: "+p1.getQty());

        p1.setQty(45);

        System.out.println("qty after: "+p1.getQty());

        System.out.println("\nProduct 2");
        Product p2= new Product("MXI239923HI","Aston Martin",23000000,5);

        System.out.println(p2+"\nquantity: "+p2.getQty()+"\nprice: "+p2.getPrice());
        System.out.println("");

        Product prod[]=new Product[6];
        prod[0]= new Product("LXI239923BM","Pagani",23000,8);
        prod[1]= new Product("L9w84rnboiw","BMW",11000,2);
        prod[2]= new Product("M9ej4w9829h","Porche",89000,5);
        prod[3]= new Product("j98n4lonnoj","Ferarri",26000,9);
        prod[4]= new Product("L3464uh23BM","iSuzu",10000,1);
        prod[5]= new Product("L364jwj5ejM","Subaru",60900,4);

        for(Product x:prod)
        {
            System.out.println(x);
            System.out.println("");
        }


        Customer cust[]=new Customer[4];
        cust[0]= new Customer("UE218058","Kunal","BH1, PU, CHD","+91 8604329827","Aston Martin, Bugatti, Koinegseg Agera");
        /* ,cars={"Aston martin","Bugatti","bmw"} */
        cust[1]= new Customer("UE218074","Pranav","Panchkula, HR","+91 9896902039","pata ni");
        cust[2]= new Customer("UE218072","Pragun","Panchkula, HR","+91 6732345663","nano");
        cust[3]= new Customer("NYC13133","Taylor Swift","Manhaton, NYC","+XX xxxxxxxxxx","Heaven Flyer");

        for(Customer c:cust)
        {
            System.out.println(c);
            System.out.println("");
        }

        
    }
}
