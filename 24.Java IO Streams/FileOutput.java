import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args){
        
        try
        {
            FileOutputStream fos1=new FileOutputStream("java.txt");
            
            String str="Learning java is fun";
                fos1.write(str.getBytes());

            fos1.close();


            FileOutputStream fos2 = new FileOutputStream("Data Science");
            
            //OR

            String skill="learning data science is a valuable skill";
            byte b[]=skill.getBytes();

            for(byte x:b)
            {
                fos2.write(x);
            }
            fos2.close();
        }
        catch(IOException err){}

        

        

    }
}
