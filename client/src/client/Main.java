package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("CLIENTE");
		
		Socket socket = new Socket("localhost", 4000);
		Scanner leitura = new Scanner(System.in);
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		String teclado = leitura.nextLine();
		saida.println(teclado);
	}
}
