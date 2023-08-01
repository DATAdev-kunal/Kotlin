import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        FileInputStream file=new FileInputStream("Data Science");
        FileOutputStream newfile=new FileOutputStream("NewFile");

//BYTE ARRAY ACT AS A ***//  BUFFER  \\***

        byte b[]=new byte[file.available()];

        file.read(b);
        newfile.write(b);
        newfile.close();
        file.close();

        
    }
}
