import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer extends Thread {
    Socket skt;
    public MultiThreadedServer(Socket skt)
    {
        this.skt=skt;
    }

    public void run()
    {
        try
        {
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
            }while(!msg.equals("dne"));
            skt.close();
        }catch(Exception err){}
        
    }
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(2000);
        
        int count=1;
        MultiThreadedServer server;
        Socket skt;
        System.out.println("!!! SERVER started !!!");
        do
        {
            skt=ss.accept();
            System.out.println("Client connected "+count++);
            server=new MultiThreadedServer(skt);
            server.start();
        }while(true);

        
    }
    
}

class Clients
{
    public static void main(String[] args)throws Exception {
        Socket skt=new Socket("localhost", 2000);

        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());
        String msg;

        do
        {
            
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server:  "+msg);

            
        }while(!msg.equals("dne"));
    }

}
