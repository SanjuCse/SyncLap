package com.java.socket;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class GetIP {

	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getLocalHost();
//		System.out.println(address);
//		System.out.println(InetAddress.getByName("SANJU"));
		
		System.out.println(InetAddress.getLocalHost());
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		System.out.println(address.hashCode());
		System.out.println(address.isAnyLocalAddress());
	}

}
