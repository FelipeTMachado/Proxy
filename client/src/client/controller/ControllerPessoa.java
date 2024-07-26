package client.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.Scanner;

import server.Pessoa;
import client.util.ConexaoSocket;
import client.view.ViewPessoa;


public class ControllerPessoa {
	// ATRIBUTOS
	private Scanner leitura;
	private ViewPessoa viewPessoa;
	
	
	
	// CONSTRUTOR
	public ControllerPessoa(Scanner leitura) {
		this.leitura = leitura;
	}
	
	
	
	// METODOS FUNCIONAIS
	public Pessoa menuBuscarPessoa() throws UnknownHostException, IOException, ClassNotFoundException {
		String idPessoa = viewPessoa.menuBuscarPessoa();
		
		return buscarPessoa(idPessoa);
	}
	
	public Pessoa buscarPessoa(String id) throws UnknownHostException, IOException, ClassNotFoundException {
		PrintStream saida = new PrintStream(ConexaoSocket.getInstance().conectar().getOutputStream());
		
		saida.println(id);
		
		ObjectInputStream inputReader = new ObjectInputStream(ConexaoSocket.getInstance().conexao().getInputStream());
//		BufferedReader reader = new BufferedReader(inputReader);
		System.out.println("TESTE");
		Object x;
		
		while ((x = inputReader.readObject()) != null) {
			System.out.println("Servidor: " + ((Pessoa) x).getCpf());
		}
			
		return new Pessoa("", "", "", "");
	}
	
	public void menuNovaPessoa() {
		
	}
	
	public void menuPessoa() throws UnknownHostException, IOException, ClassNotFoundException {
		boolean ehSair = false;
		
		this.viewPessoa = new ViewPessoa(this.leitura);
		
		while (!ehSair) {
			switch (viewPessoa.menuPessoa()) {
			case "1": {
				menuNovaPessoa();
				
				break;
			}
			
			case "2": {
				menuBuscarPessoa();
	
				break;
			}

			case "0": {
				System.exit(0);

				break;
			}
			
			default:
				viewPessoa.menuOpcaoInexistente();
			}
		}
	}



	// GETTERS AND SETTERS
	public Scanner getLeitura() {
		return leitura;
	}
	public void setLeitura(Scanner leitura) {
		this.leitura = leitura;
	}
	public ViewPessoa getViewPessoa() {
		return viewPessoa;
	}
	public void setViewPessoa(ViewPessoa viewPessoa) {
		this.viewPessoa = viewPessoa;
	}
}
