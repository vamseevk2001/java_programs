package computer_networks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.write(2);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            int a = dis.read();
            System.out.println("the recieved value is: "+a);
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
