public class varArgs {
    static int max(int...A)
    {
        if(A.length==0)
            return Integer.MIN_VALUE;
        
        int max=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(12,34,65,68,23,78,9,42,65));
    }
}
