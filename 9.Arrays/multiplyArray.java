public class multiplyArray {
    public static void main(String[] args) {
        //1st matrix input
        int sum=0;
        int m1[][]={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };

        int m2[][]={
                    {1,2,1},
                    {2,4,6},
                    {7,2,5}
                };

        int m3[][]=new int[3][3];

        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m2[0].length;j++)
            {
                for(int k=0;k<m1[0].length;k++)
                {
                    m3[i][j]=m3[i][j]+ (m1[i][k]*m2[k][j]);
                }
                //m3[i][j]=sum;
            }
        }
        
        for(int x[]:m3)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
