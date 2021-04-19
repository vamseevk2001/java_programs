package computer_networks.chat_program;

import java.io.InputStream;
import java.net.Socket;

public class client {
    public static void main(String a[]) throws Exception
    {
        Socket s=new Socket("localhost",2345);
        System.out.println("Connected with server...\n Waiting for message...");
        InputStream in=s.getInputStream();
        byte b[]=new byte[100];
        in.read(b);
        String msg=new String(b);
        System.out.println("Message from server : " +msg);
        s.close();
    }

} 
