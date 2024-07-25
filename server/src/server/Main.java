package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("SERVER");
		
		ServerSocket serverSocket = new ServerSocket(4000);
		
		while(true) {	
			Socket socket = serverSocket.accept();
			System.out.println("cliente conectou");
			
			InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
			BufferedReader reader = new BufferedReader(inputReader);
			
			
			String x;
			
			while ((x = reader.readLine()) != null) {
				System.out.println("Servidor: " + x);
			}
		}
	}
}
