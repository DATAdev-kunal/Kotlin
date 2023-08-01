public class OrderOfExceptions {
    public static void main(String[] args) {
        try
        {
            int []A={3,5,9,3,0};

            /* int c=A[1]/A[A.length-1];
            System.out.println(c); */
            
            //OR

            System.out.println(A[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
