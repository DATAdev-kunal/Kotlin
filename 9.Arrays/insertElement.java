import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        int n,value,index;
        Scanner sc= new Scanner(System.in);

        System.out.print("enter size of array: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("enter elements of array: ");

        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();

        System.out.print("array is: ");
        for(int x:arr)
        
            System.out.print(x+" ");
        System.out.println("");

        //insertion
        //Here the no. of elements is kept 5 instead of filling
        //the complete array, bcz array have to be right shifted



        System.out.print("enter element to be inserted: ");
        value=sc.nextInt();

        System.out.print("enter at which index: ");
        index=sc.nextInt();

        //right rotating the array to create
        //space for new element
        for(int i=5;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=value;

        for(int x:arr)
            System.out.print(x+" ");
        System.out.println("");
    }
}
