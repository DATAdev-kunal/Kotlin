import java.util.Scanner;

public class addMatrices {
    public static void main(String[] args) {
        
        int A[][]={
                    {1,2,3,4},
                    {2,4,6,8},
                    {3,5,7,9}
                };

        int B[][]={
                    {1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1}
                };
                
        int C[][]= new int[3][4];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j] + B[i][j];
            }
        }
        System.out.println("addtion matrix is: ");

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+ " ");
            }
            System.out.println("");
        }

    }
}
