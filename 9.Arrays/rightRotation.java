import java.util.Scanner;

public class rightRotation {
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
        int k =3;
        temp=arr[arr.length-1];
        System.out.println("right rotated: ");
        for(int i=arr.length-1;i>0;i--;k--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int x:arr)
            System.out.print(x+" ");
    }
    
}
