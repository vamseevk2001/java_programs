package computer_networks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
        public static void main(String[] args){
            try{
                ServerSocket ss=new ServerSocket(6666);
                Socket s=ss.accept();
                DataInputStream dis=new DataInputStream(s.getInputStream());
                int a= dis.read();
                System.out.println("number= "+a);
                System.out.println("number= "+a*2);
                String  str=(String)dis.readUTF();
                int c=a*2;
                DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                dout.write(c);
                ss.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
}
