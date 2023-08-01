import java.io.*;
public class TryResource {
    static FileReader f; 

    static int meth()throws Exception
    {   int result=5;
        try
        {
            f= new FileReader("/home/kunal/Documents/program.txt");
            //f.close();
            return result;
        }
        finally
        {
            //f.close();
        }
    }
    public static void main(String[] args)throws Exception {
        System.out.println(meth());
    }
}
