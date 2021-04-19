package computer_networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class tcp_date_server {
    public static void main(String[] args){
        ServerSocket ss = null;
        Socket cs;
        PrintStream ps;
        BufferedReader dis;
        String inet;
        try
        {
            ss = new ServerSocket(4444);
            System.out.println("Press Ctrl+C to quit");
            while(true)
            {
                cs = ss.accept();
                ps = new PrintStream(cs.getOutputStream());
                Date d = new Date();
                ps.println(d);
                dis = new BufferedReader(new InputStreamReader(cs.getInputStream()));
                inet = dis.readLine();
                System.out.println("Client System/IP address is :"+ inet);
                ps.close();
                dis.close();
            }
        }
        catch( IOException e)
        {
            System.out.println("The exception is :" + e);
        }
    }
}
