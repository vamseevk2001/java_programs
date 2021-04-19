package computer_networks;

import java.net.InetAddress;

public class IP_address_of_the_system {
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of the system is : " + IP.getHostAddress());
    }

}
