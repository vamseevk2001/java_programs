package computer_networks;

import java.net.InetAddress;

public class ip_address_hostname_of_local_computer {
        public static void main(String[] args)
                throws Exception {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("Local HostAddress:  "+addr.getHostAddress());
            String hostname = addr.getHostName();
            System.out.println("Local host name: "+hostname);
        }
    }

