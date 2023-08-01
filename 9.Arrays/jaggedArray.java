import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int A[][];
        A= new int[3][];
        A[0]=new int[4];
        A[1]=new int[2];
        A[2]=new int[5];

        System.out.println("enter elements: ");
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("jaggered array is: ");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}
