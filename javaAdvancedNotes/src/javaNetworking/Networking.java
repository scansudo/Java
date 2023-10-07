package javaNetworking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Networking {

	public static void main(String[] args) throws UnknownHostException {

		String url = "www.steaksta.com";
		
		InetAddress inetAddress = Inet4Address.getByName(url);
		
		// Array that returns 4 values [x,ipv4,ipv4,ipv4] (better to use host method)
		System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));
		
		// getHostAddress() (Returns the web sites host ip address)
		System.out.println("Host Address: " + inetAddress.getHostAddress());
		
		// isAnyLocalAddress() (Is this a wild card address associated w this host?)
		System.out.println("is Any Local Address : " + inetAddress.isAnyLocalAddress());
		
		// isLinkLocalAddress() (Is there a link to the local address in the domain of the web site)
		System.out.println("is Link Local Address: " + inetAddress.isLinkLocalAddress());
		
		// isLoopbackAddress() 
		System.out.println("is Loopback Address: " + inetAddress.isLoopbackAddress());
		
		// isSiteLocalAddress() 
		System.out.println("is Site Local Address: " + inetAddress.isSiteLocalAddress());
		
		// hashCode() method
		System.out.println("Hash Code: " + inetAddress.hashCode());
		
	}
}