import java.util.Scanner;

public class secondMaxElement {
    public static void main(String[] args) {
        //input array
        int n,max1,max2;
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
        
        max1=max2=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println("max1= "+max1);  
        System.out.println("max2= "+max2);                                                               
    }
}
