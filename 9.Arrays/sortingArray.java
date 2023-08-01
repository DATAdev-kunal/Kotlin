import java.util.Scanner;

class sortingArray{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("enter size of array: ");
    n=sc.nextInt();

    int arr[]= new int[n];
    System.out.print("enter elements of array: ");
    for (int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("\ncreated array: ");
    for(int x:arr)
        System.out.print(x+ " ");

    java.util.Arrays.sort(arr);

    System.out.print("\nsorted array: ");

    for(int x:arr)
        System.out.print(x+" ");
    System.out.println("");
   }
}