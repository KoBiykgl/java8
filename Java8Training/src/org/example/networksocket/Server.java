package org.example.networksocket;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void main(String[] args) {
		try (ServerSocket listener = new ServerSocket(6666);) {
			int i = 0;
			while (true) {
				Socket socket = listener.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(),
						true);
				out.println("Client " + ++i + " connection time: "
						+ new Date().toString());
				out.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
