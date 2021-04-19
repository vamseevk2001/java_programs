package computer_networks.chat_program;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String a[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2345);
        System.out.println("Server started...\n Waiting for request...");
        Socket s=ss.accept();
        System.out.println("Connection Accepted...\n Sending welcome msg....");
        OutputStream out=s.getOutputStream();
        String msg="Welcome client";
        out.write(msg.getBytes());
        ss.close();
    }

}
