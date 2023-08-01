public class sumVarArgs {
    static int sum(int...A)
    {   int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum is: "+sum(21,34,75,234,86,1234));
    }
}
