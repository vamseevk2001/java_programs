package computer_networks.chat_program_using_tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {

    public static void main(String a[]) throws Exception
    {
        Socket s=new Socket("localhost",3000);
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();
        DataInputStream dis=new DataInputStream(System.in);
        String msg=" ";
        while(!msg.equals("bye"))
        {
            byte b[]=new byte[100];
            in.read(b);
            msg=new String(b);
            System.out.println(msg);
            msg=dis.readLine();
            out.write(msg.getBytes());
        }
        s.close();
    }

}
