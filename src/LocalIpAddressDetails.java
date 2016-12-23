import java.net.*;
import java.util.*;

/**
 *
 */
public class LocalIpAddressDetails {



    static String localIpAddr = null;
    public static void main(String[] args) {
        System.out.println(getLocalAddress());
    }
    static void lookupLocalAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface
                    .getNetworkInterfaces();
            netInterFace : while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces
                        .nextElement();
// Check for mac address
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if ((hardwareAddress == null) || (hardwareAddress.length == 0)) {
                    continue;
                }
                Set<InetAddress> subAddresses = new HashSet<InetAddress>();
                Enumeration<NetworkInterface> subInterfaces = networkInterface.getSubInterfaces();
                while (subInterfaces.hasMoreElements()) {
                    NetworkInterface subInterface = subInterfaces.nextElement();
                    for (InterfaceAddress interfaceAddress : subInterface
                            .getInterfaceAddresses()) {
                        subAddresses.add(interfaceAddress.getAddress());
                    }
                }
                List<InterfaceAddress> interfaceAddresses = networkInterface
                        .getInterfaceAddresses();
                for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address.isLoopbackAddress()) {
                        continue;
                    }
                    if (subAddresses.contains(address)) {
                        continue;
                    }
                    if (address instanceof Inet4Address) {
                        localIpAddr = address.getHostAddress();
                        break netInterFace;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (localIpAddr == null) {
            try {
                localIpAddr = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                localIpAddr = "127.0.0.1";
            }
        }
    }
    public static String getLocalAddress() {
        if (localIpAddr == null) {
            lookupLocalAddress();
        }
        return localIpAddr;
    }
}