package computer_networks.squareOfANumberUsingTCP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SquareServer {
    public static void main(String[] args){
        try {
            DatagramSocket s = new DatagramSocket(1234);
            while (true) {
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                s.receive(packet);
                String message = new String(packet.getData(), 0, 0, packet.getLength());
                int ms = Integer.parseInt(message);
                int res = ms * ms;
                System.out.println("Square of " + message + " is " + res);
            }
        }
        catch(Exception e){}
    }
}
