import java.util.Scanner;

public class arrayInit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First : when size of array is known
        //        and elements are to be entered
        int A[]= new int[5];

        System.out.print("enter elements of array: ");
        
        for(int i=0;i<A.length;i++)
            A[i]=sc.nextInt();

        for(int x:A)
            System.out.print(x+" ");

        System.out.println("");
    
        //Second : when elements of array is known before
        /* int B[]={1,2,3,4,5};

        for(int x:B)
            System.out.print(x+ " ");
            
        System.out.println(""); */

        //Third : when array is declared but wish to initialize later
        /* int C[];
        C= new int[5];

        System.out.print("enter elements of array: ");

        for(int i=0;i<C.length;i++)
            C[i]=sc.nextInt();
        for(int x:C)
            System.out.print(x+ " ");
        System.out.println(""); */

        //Fourth : same as First in other way
        /* int[] D=new int[5];

        System.out.print("enter elements of array: ");

        for(int i=0;i<D.length;i++)
            D[i]=sc.nextInt();
        for(int x:D)
            System.out.print(x+" ");
        System.out.println(""); */
        
    }
}
