
public class ThrowThrows {
    
    static int area(int l,int b)throws Exception
    {
        if(l<0||b<0)
        {
            throw new Exception("Negative dimensions not allowed"); 
        }
        return l*b;
    }
    static void meth1()throws Exception
    {
        
        int a=area(-10,5);
        System.out.println("area: "+a);
    }
         
    public static void main(String[] args)throws Exception {
        
        meth1();
               
    }
}
