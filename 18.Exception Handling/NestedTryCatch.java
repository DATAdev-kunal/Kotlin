public class NestedTryCatch {
    public static void main(String[] args) {
        try 
        {
            int []arr={3,4,6,7,0,2};

            System.out.println(arr[2]/arr[5]);
                try {
                    System.out.println(arr[10]);
                }
                catch (ArrayIndexOutOfBoundsException err) {
                    System.out.println(err.getMessage());
                }
        }
        catch (ArithmeticException err) 
        {
            System.out.println(err.getMessage());
        }
    }
}
