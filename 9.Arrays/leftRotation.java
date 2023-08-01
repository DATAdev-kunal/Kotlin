import java.util.Scanner;

public class leftRotation {
    public static void main(String[] args) {
        //input array
        int n,temp;
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
        
        //rotation

        temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("left rotated: ");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}
