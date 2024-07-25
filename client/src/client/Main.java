package client;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import client.controller.ControllerPessoa;
import client.view.View;

public class Main {
	public static Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		boolean ehSair = false;
		
		ControllerPessoa controllerPessoa = new ControllerPessoa(leitura);
		
		controllerPessoa.menuPessoa();
		
		View.limparTela();
		System.out.println("+---------------------------------------------------+");
		System.out.println("|               SAINDO DO SISTEMA ...               |");
		System.out.println("+---------------------------------------------------+");
		
		leitura.close();
	}
	
	
//	Socket socket = new Socket("localhost", 4000);
//	Scanner leitura = new Scanner(System.in);
//			
//	PrintStream saida = new PrintStream(socket.getOutputStream());
//	String teclado = leitura.nextLine();
//	
//	saida.println(teclado);
//	saida.println("Testando");
}