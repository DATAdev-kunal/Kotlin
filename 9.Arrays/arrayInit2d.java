import java.util.Scanner;

public class arrayInit2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Hard-coded way
        /* int B[][]={
                        {1,2,3,4},
                        {2,4,6,8},
                        {3,5,7,9}
                    };
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
                System.out.print(B[i][j]+" ");
            
            System.out.println("");
        } */

        //First
        /* int A[][]=new int[3][4]; */

        //Second
        /* int[][]A= new int[3][3]; */

        //Third
        /* int[] A []= new int[2][4]; */

        //Fourth
        /* int A[][];
        A=new int[3][1]; */

        //Fifth
        int[] E,A[];
        //here E is 1-d array only but A is 2-d array
        //as its written as int[] A[]; which is indeed 
        //third way of declaring array.

        A=new int[3][2];
        
        //E= new int[4];

        System.out.println("enter elements of array: ");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n2d array generated is: ");
        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
