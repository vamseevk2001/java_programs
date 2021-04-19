package computer_networks.uppercase;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class uppercase_sentence_server {
    public static void main(String[] args){
        try {
            DatagramSocket s = new DatagramSocket(1234);
            while (true) {
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                s.receive(packet);
                String message = new String(packet.getData(), 0, 0, packet.getLength());
                System.out.println("uppercased sentence : \n"+message.toUpperCase());
            }
        }
        catch(Exception e){}
    }
}
