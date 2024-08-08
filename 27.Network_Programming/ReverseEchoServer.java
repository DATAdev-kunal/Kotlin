import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;

public class ReverseEchoServer {
    public static void main(String[] args) {
        try
        {
            ServerSocket ss=new ServerSocket(2000);
            Socket skt=ss.accept();

            BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));

            PrintStream ps=new PrintStream(skt.getOutputStream());

            String msg;
            StringBuilder sb;

            do
            {
                msg=br.readLine();
                sb=new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();
                ps.println(msg);
            }
            while(!msg.equals("dne"));
            
        }catch(Exception e){}
    }
}

class Client
{
    public static void main(String[] args)throws Exception {

        Socket skt=new Socket("172.16.178.103", 2000);
        
        BufferedReader keb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;

        do
        
        {
            msg=keb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From server:  "+msg);
            
        }
        while(!msg.equals("dne"));
    }
}
