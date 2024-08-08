import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStream {
    public static void main(String[] args) {
      FileOutputStream fos = new FileOutputStream("MyJava2");
      DataOutputStream dos = new DataOutputStream(fos);
      Mentor m = new Mentor();
      m.mentID = 2345;
      m.name = "Nolan";
      m.spec = "Directing";
      dos.writeInt(m.mentID);
      dos.writeUTF(m.name);
      dos.writeUTF(m.spec);
      dos.close();
      FileInputStream fis = new FileInputStream("MyJava2");
      DataInputStream dis = new DataInputStream(fis);
      Mentor mo = new Mentor();
      mo.mentID = dis.readInt();
      mo.name = dis.readUTF();
      mo.spec = dis.readUTF();
      dis.close();
      System.out.println(mo.mentID);
      System.out.println(mo.name);
      System.out.println(mo.spec);
      fis.close();
    }
}
