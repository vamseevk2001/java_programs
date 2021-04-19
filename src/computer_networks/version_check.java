package computer_networks;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class version_check {

    public static int getVersion(InetAddress ia)
    {
        byte[] address = ia.getAddress();
        if(address.length == 4)
            return 4;
        else if(address.length == 16)
            return 6;
        else
            return -1;
    }
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress Address;
        Address = InetAddress.getByName("www.google.com");
        int x = getVersion(Address);
        if(x == 4)
            System.out.println("IPv4 Address.");
        else if(x == 6)
            System.out.println("IPv6 Address.");
        else
            System.out.println("Invalid Address.");
    }
}


