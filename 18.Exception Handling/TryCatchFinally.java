import java.io.*;

public class TryCatchFinally {
    public static void main(String[] args) {
        try
        {
            FileReader f;

            f= new FileReader("usr/home/kunal/my.txt");
            System.out.println(f);
        }
        catch(FileNotFoundException err)
        {
            System.out.println(err);
        }
        finally
        {
            System.out.println("process Done!");
        }
    }
}
