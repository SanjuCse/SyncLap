package com.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UPDTest {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		String string = "sanju this side";
		byte b[] = string.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 8);
		datagramSocket.send(datagramPacket);

	}

}
