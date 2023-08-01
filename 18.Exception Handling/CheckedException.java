class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Negative dimensions aren't allowed";
    }
}
public class CheckedException {
    static public int area(int l,int b)throws NegativeDimensionException
    {
        if(l<0||b<0)
        {
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    public static void main(String[] args) {
        try
        {
            System.out.println("area: "+area(3,5));
        }
        catch(NegativeDimensionException err)
        {
            System.out.println(err);
        }
    }
}
