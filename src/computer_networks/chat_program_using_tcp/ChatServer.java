package computer_networks.chat_program_using_tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String a[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(3000);
        System.out.println("Server started...");
        Socket s=ss.accept();
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();
        DataInputStream dis=new DataInputStream(System.in);
        String msg="Enter bye to exit";
        while(!msg.equals("bye"))
        {
            out.write(msg.getBytes());
            byte b[]=new byte[100];
            in.read(b);
            msg=new String(b);
            System.out.println(msg);
            msg=dis.readLine();
        }
        s.close();
        ss.close();
    }

}
