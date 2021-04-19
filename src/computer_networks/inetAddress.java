package computer_networks;

import java.net.InetAddress;

public class inetAddress {
    public static void main(String[] args){
        try{
            InetAddress ip = InetAddress.getByName("www.vit.ac.in");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("Ip address: "+ip.getHostAddress());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
