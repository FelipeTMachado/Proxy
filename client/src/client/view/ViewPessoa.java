package client.view;

import java.util.Scanner;

public class ViewPessoa extends View {
	/* 
	 * 
	 */
	private Scanner leitura;
	
	
	
	// CONSTRUTOR
	public ViewPessoa(Scanner leitura) {
		this.leitura = leitura;
	}
	
	
	
	// METODOS FUNCIONAIS 
	public String menuBuscarPessoa() {
		limparTela();
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                  BUSCA DE PESSOAS                 |");
		System.out.println("+---------------------------------------------------+");
		System.out.print("| DIGITE O ID DA PESSOA: ");
		
		return leitura.nextLine();
	}
	
	public void menuOpcaoInexistente() {
		limparTela();
		System.err.println("\033[0;31m+---------------------------------------------------+");
		System.err.println("|         OPCAO INVALIDA TENTE NOVAMENTE ...        |");
		System.err.println("+---------------------------------------------------+");
		System.err.print("| PRESSIONE ENTER PARA CONTINUAR ...\033[0m");
		leitura.nextLine();
	}
	
	public String menuPessoa() {
		limparTela();
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                CADASTRO DE PESSOAS                |");
		System.out.println("+---------------------------------------------------+");
	    System.out.println("| 1 - NOVA PESSOA                                   |");
	    System.out.println("| 2 - BUSCAR PESSOA                                 |");
	    System.out.println("|                                                   |");
	    System.out.println("| 0 - SAIR DO SISTEMA                               |");
	    System.out.println("+---------------------------------------------------+");
	    System.out.print("| DIGITE A SUA OPCAO: ");
	    
	    return leitura.nextLine();
	}
	
	
	
	// GETTERS AND SETTERS
}
