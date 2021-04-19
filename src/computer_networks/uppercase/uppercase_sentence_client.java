package computer_networks.uppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class uppercase_sentence_client {
    public static void main(String ar[]) {
        int myPort = 1234;
        try {

            DatagramSocket ds = new DatagramSocket();
            DatagramPacket pack;
            InetAddress addr = InetAddress.getLocalHost();
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            {
                System.out.print("Enter the sentence  : ");
                String message = b.readLine();
                byte[] data = new byte[message.length()];
                message.getBytes(0, data.length, data, 0);
                pack = new DatagramPacket(data, data.length, addr, myPort);
                ds.send(pack);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
