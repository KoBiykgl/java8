package org.example.networksocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try (Socket s = new Socket("localhost", 6666);
				BufferedReader input = new BufferedReader(
						new InputStreamReader(s.getInputStream()));) {
			String answer = input.readLine();
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
