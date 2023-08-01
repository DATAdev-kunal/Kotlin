interface Member 
{
    void callback();
}

class Store
{
    Member mem[]=new Member[100];
    int count=0;

    void register(Member m)
    {
        mem[count++]=m;
    }

    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}

class Customer implements Member 
{
    String name;
    

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Ok! I'll visit... from "+name);
        
    }
    
}


public class CallbackMember {
    public static void main(String[] args) {
        Store st=new Store();
        Customer cust1=new Customer("Kunal");
        Customer cust2=new Customer("John");


        st.register(cust1);
        st.register(cust2);

        st.inviteSale();
    }
}
