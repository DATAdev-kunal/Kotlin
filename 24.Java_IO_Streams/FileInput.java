import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) throws Exception{


//PRINTING BYTE-ARRAY, USING STRING**********************************************************

        //creating object of FileInputStream with parameter DataScience as a file
        FileInputStream fis1=new FileInputStream("DataScience");

        //generating byte array of length equal to bytes available in file
        byte b1[]=new byte[fis1.available()];

        //filling byte-array by object named 'fis1' of DataScience file with method .read(byte[]), which reads bytes
        fis1.read(b1);

        //now assigning that filled byte-array to a string
        String str= new String(b1);

        //printing string 
        System.out.println(str);

        //closing file DataScience after all operation
        fis1.close();



//PRINTTING BYTE-ARRAY WITHOUT CREATING STRING OF IT, USING FOR LOOP***********************

        FileInputStream fis2=new FileInputStream("DataScience");
        byte b2[]=new byte[fis2.available()];

        fis2.read(b2);

        for(byte a:b2)
        {
            System.out.print((char)a);
        }
        System.out.println("");
        fis2.close();



//PRINTING DIRECTLY WITHOUT CREATING BYTE-ARRAY, USING DO-WHILE LOOP*************************

        FileInputStream fis3=new FileInputStream("DataScience");
        int x1;
        do
        {   
            x1=fis3.read();
            if(x1!=-1)
                System.out.print((char)x1);
        }while(x1!=-1);
        System.out.println("");
        fis3.close();



//PRINTING DIRECTLY WITHOUT CREATING BYTE-ARRAY USING ONLY WHILE LOOP**********************

        FileInputStream fis4=new FileInputStream("DataScience");
        //byte b3[]=new byte[fis4.available()];
        
        int x2;
        while((x2=fis4.read())!=-1)
        {
            System.out.print((char)x2);
        }
        System.out.println("");
        fis4.close();

    }
}
