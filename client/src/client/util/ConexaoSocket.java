package client.util;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConexaoSocket {
	/*
	 * ATRIBUTOS
	 */
	private static ConexaoSocket instance;
	private Socket socket;
	
	
	
	/*
	 * CONSTRUTOR SINGLETON
	 */
	private ConexaoSocket() {
		// TODO Auto-generated constructor stub
	}
	
	public static ConexaoSocket getInstance() {
		if (instance == null) {
			instance = new ConexaoSocket();
		}
		
		
		return instance;
	}
	
	public Socket conectar() throws UnknownHostException, IOException {
		socket = new Socket("localhost", 4000);
		
		return socket;
	}
	
	public Socket conexao() {
		return socket;
	}
	
	
	
	/*
	 * GETTERS AND SETTERS
	 */
	
}
