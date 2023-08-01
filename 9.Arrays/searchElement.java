import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        //input array
        int n,key;
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

        System.out.print("enter element to be searched: ");
        key=sc.nextInt();

        //searching
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            { 
                System.out.println("element found at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("element not found in array");
    }
}
