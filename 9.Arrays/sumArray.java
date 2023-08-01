import java.util.Scanner;

public class sumArray {

    public static void main(String[] args) {
        //input array
        int n,sum=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("enter size of array: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("enter elements of array: ");

        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        System.out.print("array is: ");
        for(int x:arr)
        
            System.out.print(x+" ");
        System.out.println("");

        //summation of array
        for(int x:arr)
            sum=sum+x;
        System.out.println("\nSum of all elements is: "+ sum);
    }
}
