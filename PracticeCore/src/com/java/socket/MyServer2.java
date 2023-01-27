package com.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MyServer2 {
	ArrayList arrayList = new ArrayList();
	ServerSocket serverSocket;
	Socket socket;

	MyServer2() throws IOException {
		serverSocket = new ServerSocket(10);
		while (true) {
			socket = serverSocket.accept();
			arrayList.add(socket);
			Runnable runnable = new MyThread(socket, arrayList);
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}

	public static void main(String[] args) throws IOException {
		new MyServer2();
	}
}

class MyThread implements Runnable {
	Socket socket;
	ArrayList arrayList;
	DataInputStream dataInputStream;

	public MyThread(Socket s, ArrayList arrayList) {
		this.socket = socket;
		this.arrayList = arrayList;
	}

	@Override
	public void run() {
		String s1 = " ";
		DataInputStream dataInputStream;
		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			do {
				s1 = dataInputStream.readUTF();
				System.out.println(s1);
				if (!s1.equals("stop")) {
					tellEveryOne(s1);
				} else {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					dataOutputStream.writeUTF(s1);
					dataOutputStream.flush();
				}
			} while (!s1.equals("stop"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void tellEveryOne(String s1) throws IOException {
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Socket socket = (Socket) iterator.next();
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF(s1);
			dataOutputStream.flush();
			System.out.println("Clients");

		}
	}
}
