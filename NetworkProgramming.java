import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetworkProgramming
{
    public static void main(String[] args) throws UnknownHostException, MalformedURLException
    {
        System.out.println("Demonstrating InetAddress Class");
        InetAddress localHost = InetAddress.getLocalHost(); // throws UnknownHostException
        System.out.println("\nLocal Host Name: " + localHost.getHostName());
        System.out.println("Local Host Address: " + localHost.getHostAddress());
        
        InetAddress address = InetAddress.getByName("student.amizone.net");
        System.out.println("\n" + address.getHostName()); // throws UnknownHostException
        System.out.println("Address: " + address.getHostAddress());
        
        InetAddress sw[] = InetAddress.getAllByName("www.google.co.in"); // throws UnknownHostException
        System.out.println("\nwww.google.co.in");
        System.out.print("Addresses: ");
        for(int i = 0; i < sw.length; i++)
            System.out.print(sw[i] + " ");
        
        System.out.println("\n\n\nDemonstrating URL Class");
        String webAddress = "https://www.java.com/en/download/win10.jsp";
        URL obj = new URL(webAddress); // throws MalformedURLException
        System.out.println("Protocol: " + obj.getProtocol());
        System.out.println("Host Name: " + obj.getHost());
        System.out.println("File Name: " + obj.getFile());
        System.out.println("Path Name: " + obj.getPath());
        System.out.println("Port Name: " + obj.getPort());   
    }
}
