package com.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDOTest2 {

	public static void main(String[] args) throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket(8);
		byte b[]=new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
		datagramSocket.receive(datagramPacket);
		String string = new String(datagramPacket.getData());
		System.out.println(string.trim());
		

	}

}
