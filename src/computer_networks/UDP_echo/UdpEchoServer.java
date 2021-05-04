package computer_networks.UDP_echo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpEchoServer {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket SrvSoc = new DatagramSocket(7777);
        byte[] SData = new byte[1024];
        System.out.println("Server Ready\n");
        while (true)
        {
            byte[] RData = new byte[1024];
            DatagramPacket RPack = new DatagramPacket(RData, RData.length); SrvSoc.receive(RPack);
            String Text = new String(RPack.getData());
            if (Text.trim().length() > 0)
            {
                System.out.println("From Client <<< " + Text);
                InetAddress IPAddr = RPack.getAddress();
                int Port = RPack.getPort();
                SData = Text.toUpperCase() .getBytes();
                DatagramPacket SPack = new DatagramPacket(SData,
                        SData.length, IPAddr, Port);
                SrvSoc.send(SPack);
            }
            else
                break;
        }
        System.out.println("\nClient Quits\n");
        SrvSoc.close();
    }
}
